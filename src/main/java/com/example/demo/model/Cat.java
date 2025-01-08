package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

@Schema(description = "Represents a Cat class.")
public class Cat {

    @JsonUnwrapped
    @Schema(description = "The attributes.")
    private Attributes attributes;

    public Cat(Attributes attributes) {
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
