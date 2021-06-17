#!/usr/bin/env bash

BASES="1000"

for base in $BASES; do
  ./run-final.sh 1 true true true $base
  ./run-final.sh 1 true true true $base
  ./run-final.sh 1 true true true $base

  #currrent arrival rate
  #./run-final.sh 1 true true false $base

  #mem scheduling
  .#/run-final.sh 1 false true true $base

  #cpu scheduling
  # ./run-final.sh 1 true false true $base

  #no scheduling
  #./run-final.sh 1 false false false $base
done
