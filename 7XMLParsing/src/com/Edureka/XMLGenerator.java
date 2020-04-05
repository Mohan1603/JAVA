package com.Edureka;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;



public class XMLGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
		DocumentBuilder b=null;
		
		try {
			b= f.newDocumentBuilder();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		Document doc=b.newDocument();
		
		Element rootele= doc.createElement("students");
		Element studentele= doc.createElement("student");
		Element firstnameele= doc.createElement("firstname");
		Element lastnameele= doc.createElement("lastname");
		Element mailele= doc.createElement("mail");
		Element markele= doc.createElement("mark");
		
		Text t1=doc.createTextNode("Mohan");
		Text t2=doc.createTextNode("Kumar");
		Text t3=doc.createTextNode("ms9@gmail.com");
		Text t4=doc.createTextNode("80");
		
		firstnameele.appendChild(t1);
		lastnameele.appendChild(t2);
		mailele.appendChild(t3);
		markele.appendChild(t4);
		
		studentele.appendChild(firstnameele);
		studentele.appendChild(lastnameele);
		studentele.appendChild(mailele);
		studentele.appendChild(markele);
		
		rootele.appendChild(studentele);
		doc.appendChild(rootele);
		Transformer t=null;
		
		try {
			t= TransformerFactory.newInstance().newTransformer();
		}catch (TransformerConfigurationException e1) {
			e1.printStackTrace();
		}catch (TransformerFactoryConfigurationError e1) {
			e1.printStackTrace();
		}
		try {
			t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("D:\\Eclipse_Workspace\\7XMLParsing\\students.xml")));
		}catch(FileNotFoundException | TransformerException e) {
			e.printStackTrace();
		}
		System.out.println("XML file generated");

	}

}
