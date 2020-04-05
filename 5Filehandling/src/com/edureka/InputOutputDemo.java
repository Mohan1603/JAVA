package com.edureka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class InputOutputDemo {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File employeeInfoFile = new File("D:\\Eclipse_Workspace\\5Filehandling\\EmployeeInfo.txt");
		File vehicleInfoFile = new File("D:\\Eclipse_Workspace\\5Filehandling\\VehicleInfo.txt");
		InputOutputDemo demo = new InputOutputDemo();
		demo.writeFile(employeeInfoFile);//invoking writeFile method
        demo.readFile(vehicleInfoFile);
	}
	public void writeFile(File fileToWrite) {
		PrintWriter employeeInfoWriter=null;//making accessible to finally
		try {
			employeeInfoWriter= new PrintWriter(fileToWrite);//to Write using println
			employeeInfoWriter.println("Mohan");
			employeeInfoWriter.println("100");
		}
		catch(FileNotFoundException e) {
			System.out.println("Given file not found: "+fileToWrite.getName());
			throw new RuntimeException(e);
		}finally {
			employeeInfoWriter.close();//one of the uses of finally(closing the resources)
		}
		
	}
	public void readFile(File fileToRead) throws FileNotFoundException{
		Scanner vehicle = new Scanner(fileToRead);//to Read
		while(vehicle.hasNext()) {
			System.out.println("Line read from the input File: "+vehicle.nextLine());
		}
		
		
	}

}
