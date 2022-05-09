package com.company;

public class Engine {
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
