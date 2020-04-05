package com.Edureka;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEncode {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONObject stuJSON=new JSONEncode().createJSON();
		new JSONEncode().printJSON(stuJSON);
		new JSONEncode().writeToFile(stuJSON, "D:\\Eclipse_Workspace\\7XMLParsing\\student.json");
		new JSONEncode().readJSON("D:\\Eclipse_Workspace\\7XMLParsing\\student.json");
	}
	private JSONObject createJSON() {
		JSONObject studentJSON= new JSONObject();
		studentJSON.put("firstname", "Mohan");
		studentJSON.put("lastname", "Kumar");
		studentJSON.put("email", "ms9@gmail.com");
		studentJSON.put("marks", new Integer(45));
		return studentJSON;
	}
	private void printJSON(JSONObject json) {
		System.out.println(json);
	}
	private void writeToFile(JSONObject json, String absoluteFileName) throws IOException {
		FileWriter jsonFileWriter =new FileWriter(absoluteFileName);
		jsonFileWriter.write(json.toJSONString());
		jsonFileWriter.flush();
		jsonFileWriter.close();
	}
	private void readJSON(String absoluteFileName) throws FileNotFoundException, IOException, ParseException {
		JSONObject jsonAsObject=(JSONObject)new JSONParser().parse(new FileReader(absoluteFileName));//type casting
		System.out.println(jsonAsObject.get("firstname"));
	}

}
