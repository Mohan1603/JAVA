package com.edureka;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriterDemo fileWriterDemo = new FileWriterDemo();
		File bikeInfo = new File("D:\\Eclipse_Workspace\\5Filehandling\\BikeInfo.txt");
		fileWriterDemo.writeFile(bikeInfo);
	}
	private void writeFile(File fileToWrite) throws Exception{
		FileWriter bikeInfoWriter = new FileWriter(fileToWrite);//to Write using FileWriter
		bikeInfoWriter.write("YAMAHA");
		bikeInfoWriter.flush();
		bikeInfoWriter.close();
		
	}

}
