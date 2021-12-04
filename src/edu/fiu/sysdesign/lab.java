package edu.fiu.sysdesign;

public class lab {

	public static FreenoveRobot RobotDog;
	
	public static void main(String[] args) {
		
		try {
			RobotDog = new FreenoveRobot(null, 0, 0);
		} catch (Exception e) {
			e.printStackTrace();
	}

FreenoveRobot.setRobotName();

}
}