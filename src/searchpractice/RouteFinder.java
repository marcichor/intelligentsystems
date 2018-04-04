package searchpractice;

import java.util.*;
import java.io.*;
import robocode.*;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;



public class RouteFinder{
	static int NumOfRows;
	static int NumOfCols;
	
	public static void main(String[] args) {
		
		RobocodeEngine engine=new RobocodeEngine(new java.io.File("C:/Robocode"));
		engine.setVisible(true);
		NumOfRows=5000;
		NumOfCols=5000;
		BattlefieldSpecification battlefield = new BattlefieldSpecification(NumOfRows, NumOfCols);
		
		//engine.close();
		//System.exit(0);
		//RobotSpecification[] existingrobot = new RobotSpecification[6];
		
	}
}


