package com.company;
//1. Создать класс `Body`.
//2. В класс `Body` добавить:
//   -  Поля: `type (char[])`, `material (char[])`.
//   -  Конструктор, который принимает все свойства класса.
//   -  `getter`-ы для всех полей.

public class Body {
    char[] type;
    char[] material;

    public Body(char[] type, char[] material) {
        this.type = type;
        this.material = material;
    }

    public char[] getType(){
        return type;
    }

    public char[] getMaterial(){
        return material;
    }

}

