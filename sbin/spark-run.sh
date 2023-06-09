#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd $DIR
source ./.env

while [[ $# -gt 0 ]]; do
    key="$1"

    case $key in
        --path)
        INPUT_PATH=$2
        shift
        shift
        ;;

        --config)
        CONFIG=$2
        shift
        shift
        ;;

        *)
        echo "Unknown argument $i"    # unknown option
        shift
        ;;
    esac
done

if [ -z $CONFIG ]; then
    $SPARK_HOME/bin/spark-submit \
        --class TPCDS \
        ../spark/target/scala-2.12/spark_2.12-0.1.0-SNAPSHOT.jar \
        $INPUT_PATH
else
    $SPARK_HOME/bin/spark-submit \
        --class TPCDS \
        --properties-file $CONFIG \
        ../spark/target/scala-2.12/spark_2.12-0.1.0-SNAPSHOT.jar \
        $INPUT_PATH
fi
