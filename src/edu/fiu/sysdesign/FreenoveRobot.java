
/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author elenaozyman
 *
 */
public class FreenoveRobot {
	public double BatteryPercentage = 0;
	public String name;
	public int kitType;
	public int batteryCapacity;
	
	public FreenoveRobot(String name, int kitType, int batteryCapacity) {
		super();
		this.name = name;
		this.kitType = kitType;
		this.batteryCapacity = batteryCapacity;
	}
	
	/**
	 * Make a move
	 */
	public void makemove() {
	}
	
	/**
	 * Make a sound
	 */
	public void makesound() {
	}
	
	/**
	 * @return battery percentage
	 */
	public double getBatteryPercentage() {
		return BatteryPercentage;
	}


}
