#!/bin/bash
bash -c "mvn package; mvn exec:java -Dexec.mainClass="com.simplerplusplus.SimplerPlusPlus"; exec $SHELL"