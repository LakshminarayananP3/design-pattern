package com.lnt.designpattern.normal;

import com.lnt.designpattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
