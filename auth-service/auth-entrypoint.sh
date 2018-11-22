#!/bin/sh

echo 'Starting the custom script'


while ! nc -z discovery 8082
do
    echo "Waiting for upcoming Discovery Server"
    sleep 2
done


echo 'Pre-requisite done now moving on the execution of current container service'

nohup java -jar auth-service.jar