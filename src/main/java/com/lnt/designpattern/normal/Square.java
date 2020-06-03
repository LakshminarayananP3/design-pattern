package com.lnt.designpattern.normal;

import com.lnt.designpattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
