# Heroes Services
A JAX-RS with Couchbase demo

A JAX-RS sample using [Tomee](http://tomee.apache.org/) implementation.

To run:

* `mvn -DskipTests clean package payara-micro:bundle`
* `java -jar target/cars-microbundle.jar`

### execute the script

`sh cars.sh`


#### Enjoy the queries

* http://localhost:8080/resource/cars
* http://localhost:8080/resource/cars?page=2
* http://localhost:8080/resource/cars?page=4&size=5

