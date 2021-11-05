/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author elenaozyman
 *
 */
public class Sensor extends RobotDog{
public Sensor(String name, int kitType, int batteryCappacity, String bodyShape, int speedlevel) {
		super(name, kitType, batteryCappacity, bodyShape, speedlevel);
		// TODO Auto-generated constructor stub
	}

public String sensorType;




	public String sensorType() {
		return sensorType;
	}

	public void setsensorType(String sensorType) {
		this.sensorType = sensorType;
	}

}