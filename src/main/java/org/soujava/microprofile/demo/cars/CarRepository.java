package org.soujava.microprofile.demo.cars;

import jakarta.nosql.mapping.Pagination;
import jakarta.nosql.mapping.Repository;

import java.util.List;

public interface CarRepository extends Repository<Car, Long> {

    List<Car> findAll(Pagination pagination);
}
