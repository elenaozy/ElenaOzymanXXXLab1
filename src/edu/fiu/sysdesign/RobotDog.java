package edu.fiu.sysdesign;
/**
 * 
 * RobotDog - a subclass of Robot representing a dog type of robots
 *
 */
public class RobotDog extends FreenoveRobot {
	public String bodyShape;
	public int speedLevel;

	public RobotDog(String name, int kitType, int batteryCappacity, String bodyShape, int speedlevel) {
		super(name, kitType, batteryCappacity);
	}


	public void tracking() {
	
	}
}
	