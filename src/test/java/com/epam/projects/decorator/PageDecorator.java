package com.epam.projects.decorator;


public class PageDecorator extends WidgetDecorator {
	

 public PageDecorator(Widget dRank)
 {
     super(dRank);
 }

 @Override public void getRank()
 {
	 wrank.getRank();
	 setPageRank(wrank);
 }

 private void setPageRank(Widget dRank)
 {
	
      System.out.println("Page Ranking:" +dRank);
 }
}