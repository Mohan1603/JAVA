package com.edureka;

import java.io.Serializable;

public class VehicleInfo implements Serializable{
	
	int numberOfWheels;
	Integer milage= new Integer(100);//wrapper class
	String nameOfVehicle;
	
	VehicleInfo(String nameOfVehicle, int numberOfWheels, int milage){
		this.nameOfVehicle=nameOfVehicle;
		this.milage=milage;
		this.numberOfWheels=numberOfWheels;
	}

}
