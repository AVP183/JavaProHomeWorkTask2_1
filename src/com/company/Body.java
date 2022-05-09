package com.company;

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

