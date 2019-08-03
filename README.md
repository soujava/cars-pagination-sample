# Cars Services
A JAX-RS with MongoDB pagination demo

A JAX-RS sample using [Payara Micro](https://www.payara.fish/software/payara-server/payara-micro/) implementation.

To run:

* `mvn -DskipTests clean package payara-micro:bundle`
* `java -jar target/cars-microbundle.jar`

### execute the script

`sh cars.sh`


#### Enjoy the queries

* http://localhost:8080/resource/cars
* http://localhost:8080/resource/cars?page=2
* http://localhost:8080/resource/cars?page=4&size=5

