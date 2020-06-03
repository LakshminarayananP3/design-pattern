package com.lnt.designpattern.factory;

import com.lnt.designpattern.Shape;

public abstract class AbstractFactory {
   public abstract Shape getShape(String shapeType) ;
}