#!/bin/bash

javac Driver.java -d output
cd ./output
java Driver < ../$1 > sm.sm
# cat sm.sm
java SMinterp sm -d
java SMinterp sm
