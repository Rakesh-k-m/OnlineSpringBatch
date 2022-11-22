package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CricketIpl.xml");

		Cricket c = (Cricket) context.getBean("myCricket");

		System.out.println("Team: " + c.getTeam());
		System.out.println("Place: " + c.getPlace());
		System.out.println("Players: " + c.getNumberOfPlayers());
		System.out.println("-------------------------------------");
		System.out.println("Jersy Color: " + c.getIpl().getJersyColor());
		System.out.println("Season: " + c.getIpl().getSeason());
		System.out.println("Team Captain: " + c.getIpl().getTeamCaptain());

	}

}
