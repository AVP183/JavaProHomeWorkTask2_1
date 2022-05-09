package com.company;

public class Car {
    /*
    7. Создать класс `Car`.
             8. В класс `Car` добавить:
             - Поля: `body (Body)`, `engine (Engine)`, `transmission (Transmission)`.
             - Конструктор, который принимает все свойства класса.
    -  `getter`-ы для всех полей.
    */
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
