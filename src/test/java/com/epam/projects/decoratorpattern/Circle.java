package com.epam.projects.decoratorpattern;

//Class 1
//Class 1 will be implementing the Shape interface

//Rectangle.java
public class Circle implements Shape {

// Overriding the method
@Override public void draw()
{
   // /Print statement to execute when
   // draw() method of this class is called
   // later on in the main() method
   System.out.println("Shape: Circle");
}
}
