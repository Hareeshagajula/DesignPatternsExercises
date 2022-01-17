package com.epam.projects.decorator;


public class MobileApp implements Widget {

int rank;
 @Override public void getRank()
 {
     rank = rank +5;//mobile version
     System.out.println("Widgets: Mobile App-" +rank);
 }
}
