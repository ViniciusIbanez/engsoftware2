# EngSoftware2

## Running locally with docker

### Setup

- Pull the postgres latest image (one time only)`

```docker pull postgres```


- Change `src\main\resources\application.properties` to use the local database setup.
- Update `pom.xml` file adding a new dependecy for h2database.

  ```
    <dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
	</dependency>
  ```

  Do not push those changes to the remote branch, otherwise it will break the Heroku deployment. 


### Running the application

- Build the docker image from the root folder

```
docker build -f Dockerfile.maven -t praticandoapi/praticando-api .
``` 


