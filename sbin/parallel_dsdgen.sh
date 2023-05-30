#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd $DIR

while [[ $# -gt 0 ]]; do
    key="$1"

    case $key in
        -sf)
        SCALE=$2
        shift
        shift
        ;;

        -c)
        CHUNKS=$2
        shift
        shift
        ;;

        -w)
        WORKERS=$2
        shift
        shift
        ;;

        -wid)
        WORKER_ID=$2
        shift
        shift
        ;;

        *)
        echo "Unknown argument $i"    # unknown option
        ;;
    esac
done

echo $(hostname): Generating TPCDS-DB, scale = $SCALE, chunks = $CHUNKS, worker = $WORKER_ID

cd ../tools

start_time=$(date +%s.%3N)

mkdir -p ../data/SF-$SCALE

if [ $CHUNKS -eq 1 ]
then
    ./dsdgen -scale $SCALE -dir ../data/SF-$SCALE -force -quiet &
else
    let start=$WORKER_ID+1
    for n in $(seq $start $WORKERS $CHUNKS); do 
        ./dsdgen -parallel $CHUNKS -child $n -scale $SCALE -dir ../data/SF-$SCALE -force -quiet &
    done
fi

wait

tables=( "call_center" "catalog_page" "catalog_returns" "catalog_sales" \
"customer_address" "customer_demographics" "customer" "date_dim" \
"household_demographics" "income_band" "inventory" "item" "promotion" \
"reason" "ship_mode" "store_returns" "store_sales" "store" "time_dim" \
"warehouse" "web_page" "web_returns" "web_sales" "web_site" )

for table in ${tables[@]}; do
    if compgen -G "../data/SF-$SCALE/$table*.dat" > /dev/null; then
        mkdir -p ../data/SF-$SCALE/$table
        mv ../data/SF-$SCALE/$table*.dat ../data/SF-$SCALE/$table/
    fi
done

rm -f ../data/SF-$SCALE/*.dat

end_time=$(date +%s.%3N)

elapsed=$(echo "scale=3; $end_time - $start_time" | bc)

echo $(hostname): worker=$WORKER_ID, elapsed_time = $elapsed
