DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd $DIR
source ./.env

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

        *)
        echo "Unknown argument $i"    # unknown option
        ;;
    esac
done

echo Parallel TPCDS dsdgen

#remove empty lines from workers
sed -i '/^$/d' workers

WORKERS=$(cat workers | wc -l)

i=0
for m in $(cat workers) ; do
    if [ $(pgrep -c -P$$) -ge $MAX_CONCURRENT_SSH ]; then
        wait -n
    fi

    ssh -A $(whoami)@$m "$TPCDS_HOME/sbin/parallel_dsdgen.sh -sf $SCALE -c $CHUNKS -w $WORKERS -wid $i"&

    let i=$i+1
done

wait
