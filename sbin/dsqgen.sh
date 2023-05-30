#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd $DIR
source ./.env

for i in "$@"; do
    case $i in
        -sf*)
        SCALE="${i#*sf}"
        shift
        ;;

        *)
        echo "Unknown argument $i"    # unknown option
        ;;
    esac
done

echo $(hostname): Generating TPCDS queries, scale = $SCALE

cd ..
mkdir -p ../queries/SF-$SCALE

for n in $(seq 1 99); do 
    ./dsqgen -directory ../query_templates -dialect ansi -scale 1 -template query$n.tpl &>/dev/null
    mv query_0.sql ../queries/SF-$SCALE/query_$n.sql
done
