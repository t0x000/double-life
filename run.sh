#!/bin/bash
clear && 
mvn clean install && 
clear &&
java -jar ./target/pokemon-game-1.0-SNAPSHOT.jar
