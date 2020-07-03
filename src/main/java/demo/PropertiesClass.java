package demo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesClass {
	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		Properties p1=new Properties();
		Properties p2=new Properties();
		Properties p4=new Properties();
		Properties p5=new Properties();
		
		
        PrintWriter writer = new PrintWriter(System.out); 
        String s = "Height=200";
        String s2 = "Width=15";
        String s3="breadth=25";

		p.setProperty("user", "Geethapriyababu");
		p.setProperty("password", "geetha@123");
		p.put("sample", "demo");
		
		p.store(new FileWriter("info.properties"), "First property file");
		
		//p.clear();
		Object clone = p.clone();
		System.out.println(clone);
		
		System.out.println(p.contains("geetha@123"));
		
		p.compute("user", (key,value)->"geetha");
		System.out.println(p);
		
		Enumeration<Object> elements = p.elements();
		while(elements.hasMoreElements())
			System.out.println(elements.nextElement());
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.isEmpty());
		
		p.list(System.out);
		p.list(writer);
		writer.flush();
//FileInputStream and FileOutputStream==================================================================================
		
		FileInputStream fis = new FileInputStream("properties.txt");
		p1.load(fis);
		FileOutputStream fos = new FileOutputStream("properties.txt");
        fos.write(s.getBytes());
       fos.write("\n".getBytes());
        fos.write(s2.getBytes());
        fos.write("\n".getBytes());
        fos.write(s3.getBytes());
		p1.list(System.out);
		
//StringReader Class======================================================================================================		
	    
		StringReader reader = new StringReader(s3);
		p2.load(reader);
		p2.list(System.out);
		
//creating xml file and storing the values there==========================================================================
		
	    p4.put("today", new Date().toString());
	    p4.put("user", "A");

	    FileOutputStream out = new FileOutputStream("user.props");
	    p4.storeToXML(out, "updated");

	    FileInputStream in = new FileInputStream("user.props");

	    p4.loadFromXML(in);
	    p4.list(System.out);

//to get only the keys===================================================================================================
	    
		Enumeration<?> propertyNames = p.propertyNames();
		while(propertyNames.hasMoreElements())
		System.out.println(propertyNames.nextElement());
		
		//p.save(out, comments);
		
//============to get size of the property file============================================================================		
		
		int size = p.size();
		System.out.println(size);
		
//========to store/write values to the new file===========================================================================
		
		p5.put("A", "Apple");
		p5.put("B","Ball");
		p5.put("c", "Cat");
		p5.put("D", "Dog");
		p5.put("D", "Donkey");
		
		p5.store(new FileOutputStream("Alphabets.txt"), "Alphabets");
		
		p5.list(System.out);
//===another method to retrieve the keys from the property file============================================================
		//return type is set
		
		Set<String> stringPropertyNames = p.stringPropertyNames();
		for (String string : stringPropertyNames) {
			System.out.println(string);
			
		}
		
		
	}

}
