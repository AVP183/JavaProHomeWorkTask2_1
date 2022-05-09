package com.company;

public class Engine {
    /*
     3. Создать класс `Engine`.
             4. В класс `Engine` добавить:
             -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`,
             `cylindersArrangement (char[])`, `combustibleMixtureIgnition (char[])`.
             -  Конструктор, который принимает все свойства класса.
    -  `getter`-ы для всех полей.
             */
    char[] fuel;
    char[] coolingMethod;
    int cylindersAmount;
    char[] cylindersArrangement;
    char[] combustibleMixtureIgnition;

    public Engine(char[] fuel, char[] coolingMethod, int cylindersAmount, char[] cylindersArrangement,
                  char[] combustibleMixtureIgnition){
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public char[] getFuel(){
        return fuel;
    }

    public char[] getCoolingMethod(){
        return coolingMethod;
    }

    public int getCylindersAmount(){
        return cylindersAmount;
    }

    public char[] getCylindersArrangement(){
        return cylindersArrangement;
    }

    public char[] getCombustibleMixtureIgnition(){
        return combustibleMixtureIgnition;
    }

}
