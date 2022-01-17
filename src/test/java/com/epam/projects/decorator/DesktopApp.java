package com.epam.projects.decorator;


public class DesktopApp implements Widget {

int rank;
@Override public void getRank()
{
	 rank = rank +3;//desktop version
   System.out.println("Rank: Desktop App-" +rank);
}
}
