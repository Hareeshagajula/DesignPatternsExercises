package com.epam.projects.decorator;


public abstract class WidgetDecorator implements Widget {

private int rank = 0;
 protected Widget wrank;

 
 public WidgetDecorator(Widget wrank)
 {
    
     this.wrank = wrank;
 }


 public void getRank() { 
	 rank = rank+1;
	 System.out.println("Rank of the widget:"+rank);
	 wrank.getRank();
	 }
}