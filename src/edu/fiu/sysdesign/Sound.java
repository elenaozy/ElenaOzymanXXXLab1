package edu.fiu.sysdesign;

import java.sql.Time;

public class Sound extends Sensor {
public Sound(String name, int kitType, int batteryCappacity, String bodyShape, int speedlevel) {
		super(name, kitType, batteryCappacity, bodyShape, speedlevel);
		// TODO Auto-generated constructor stub
	}

public String soundType;
public int duration;



	public String soundType() {
		return soundType;
	}

	public void soundType(String soundType) {
		this.soundType = soundType;
	}

}