package com.mjie.xml.beans.dependency.constructor;

public class ThingOne {

    public ThingOne( ThingTwo thingTwo,ThingThree thingThree) {
        System.out.println(thingTwo.hashCode());
        System.out.println(thingThree.hashCode());
    }
}
