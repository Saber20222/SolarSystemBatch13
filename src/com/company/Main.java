package com.company;

public class Main {
    public static void main(String[] args) {
        // write code here

        solarSystem inception = new solarSystem();
        inception.sun = 1;
        inception.moon = 4;
        inception.planets = 2;
        System.out.println("the basic structure is is ready");

//  Developing the feature SUN
        SUN omaro = new SUN();
        omaro.temperature="12334433kj";
        omaro.name="ferro";
        omaro.radius=1234455;
        omaro.color="pink";

//      developing planet1
        Planet1 superplanet=new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="545488km";
    }
}