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

        omaro.temperature = "12334433kj";
        omaro.name = "ferro";
        omaro.radius = 1234455;
        omaro.color = "pink";

// planet2
        Planet2 superwoman=new Planet2();
        superwoman.size="766585857km";
        superwoman.name="pliea";
        superwoman.color="green";


        

//      developing planet1
        Planet1 superplanet=new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="545488km";

    }
}