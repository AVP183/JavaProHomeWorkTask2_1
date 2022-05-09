package com.company;

public class Car {
    Body body;
    Engine engine;
    Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission){
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body body(){
        return body;
    }

    public Engine engine(){
        return engine;
    };

    public Transmission transmission(){
        return transmission;
    }
}
