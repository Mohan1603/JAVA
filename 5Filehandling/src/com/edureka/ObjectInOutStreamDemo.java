package com.edureka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInOutStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		VehicleInfo bmw= new VehicleInfo("BMW",4,10);
		File serializedFile= new File("D:\\Eclipse_Workspace\\5Filehandling\\serializedFile.bin");
		new ObjectInOutStreamDemo().serialize(serializedFile,bmw);
		new ObjectInOutStreamDemo().deserialize(serializedFile);

	}
	private void serialize(File file, VehicleInfo instanceOfVehicleinfo) throws IOException{
		FileOutputStream fileStream= new FileOutputStream(file);
		ObjectOutputStream objectStream= new ObjectOutputStream(fileStream);
		objectStream.writeObject(instanceOfVehicleinfo);
		objectStream.flush();
		objectStream.close();
	}
	private void deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream filestream= new FileInputStream(file);
		ObjectInputStream objectStream= new ObjectInputStream(filestream);
		VehicleInfo deserializedObject= (VehicleInfo) objectStream.readObject();
		System.out.println("Name of the vehicle in serialized file: "+deserializedObject.nameOfVehicle);
		System.out.println("Number of wheels in serialized file: "+deserializedObject.numberOfWheels);
		System.out.println("Milage in serialized file: "+deserializedObject.milage);
	}

}
