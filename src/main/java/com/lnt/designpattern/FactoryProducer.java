package com.lnt.designpattern;

import com.lnt.designpattern.factory.AbstractFactory;
import com.lnt.designpattern.factory.RoundedShapeFactory;
import com.lnt.designpattern.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}