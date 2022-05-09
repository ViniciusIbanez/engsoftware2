#!/bin/bash
mvn clean package
docker login --username=_ --password=$HEROKU_API_KEY registry.heroku.com
HEROKU_API_KEY=$HEROKU_API_KEY  heroku container:push web -a engsoftware2
HEROKU_API_KEY=$HEROKU_API_KEY  heroku container:release web -a engsoftware2