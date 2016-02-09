package io;
import java.io.*;
public class GameCharacter implements java.io.Serializable{

	int power;
	String type;
	String[] weapons;
	
	public GameCharacter(int power, String type, String[] weapons) {
		super();
		this.power = power;
		this.type = type;
		this.weapons = weapons;
	}
	public GameCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getWeapons() {
		return weapons;
	}
	public void setWeapons(String[] weapons) {
		this.weapons = weapons;
	}


}
