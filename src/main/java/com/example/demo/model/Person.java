package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {
    private final UUID id;

    @NotBlank
    private final String name;

    @NotNull
    private final double gpa;

    private final int sat;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("gpa") double gpa,
                  @JsonProperty("sat") int sat) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.sat = sat;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getSat() {
        return sat;
    }
}
