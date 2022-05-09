package com.company;

public class Transmission {
     char[] driveType;
     char[] gearboxType;

     public Transmission(char[] driveType, char[] gearboxType){
         this.driveType = driveType;
         this.gearboxType = gearboxType;
     }

     public char[] getDriveType(){
         return driveType;
     }

     public char[] getGearboxType(){
         return gearboxType;
     }
}
