package org.soujava.microprofile.demo.cars;

import jakarta.nosql.mapping.ConfigurationUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.function.Supplier;

@ApplicationScoped
@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {

    private static final Supplier<WebApplicationException> NOT_FOUND =
            () -> new WebApplicationException(Response.Status.NOT_FOUND);

    @Inject
    @ConfigurationUnit(database = "car")
    private CarRepository repository;

    @GET
    public List<Car> findAll(@BeanParam @Valid PageRequest page) {
        return repository.findAll(page.toPagination());
    }

    @GET
    @Path("/{id}")
    public Car findById(@PathParam("id") Long id) {
        return repository.findById(id).orElseThrow(NOT_FOUND);
    }


    @POST
    public void insert(@Valid Car car) {
        repository.save(car);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, @Valid Car car) {
        repository.save(car);
    }

    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") Long id) {
        repository.deleteById(id);
    }
}
