package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //  9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей, из которых состоит
        //  `Car`.
        Body body = new Body(new char[]{'v', 'e', 'h','e','l'}, new char[]{'i','r','o','n'});
        Engine engine = new Engine(new char[]{'e','l','e','k','t','r','o'}, new char[]{'w','a','t','e','r'},
                0,new char[]{'n','o','n','e'},new char[]{'w','i','t','h','o','u','t'});
        Transmission transmission = new Transmission(new char[]{'b','o','t','h'}, new char[]{'r','e','d','u',
                'c','t','e','r'});
        Car tesla = new Car(body, engine, transmission);
    }
}
