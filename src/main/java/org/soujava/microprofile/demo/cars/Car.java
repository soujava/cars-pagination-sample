package org.soujava.microprofile.demo.cars;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Car {
    @Id
    private Long id;
    @Column
    @NotBlank
    private String provider;
    @Column
    @NotBlank
    private String model;
    @Column
    @Positive
    private Integer year;
    @Column
    @NotBlank
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "org.soujava.microprofile.demo.cars.Car{" +
                "id=" + id +
                ", provider='" + provider + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}