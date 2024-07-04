package TestCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DataIntoCollection 
{
	public static void main(String[] args) throws IOException
	{
//	Properties prop=new Properties();
//	File files=new File("./Properties/PropertiesFile");
//	FileInputStream fis=new FileInputStream(files);
//	prop.load(fis);
//	  System.out.println(prop.getProperty("name"));
//	  System.out.println(prop.getProperty("id"));
//	  System.out.println(prop.getProperty("place"));
	  
//	  //capture all properties method-1
//	  Set<String> key = prop.stringPropertyNames();
//	  System.out.println(key);
//	  
//	  //capture all properties method-2
//	  Set<Object> key1 = prop.keySet();
//	  System.out.println(key1);
//	  
//	  //capture all the values
//	  Collection<Object> value = prop.values();
//	  System.out.println(value);
	  
//	  //print keys with their values
//	  for(String keys:prop.stringPropertyNames())
//	  {
//		  System.out.println(keys+" "+prop.getProperty(keys));
//	  }
	
    //store data in map from propertyfile and call it whenever need
	try {
		Properties prop=new Properties();
        prop.load(new FileInputStream("./Properties/PropertiesFile"));

        // Using HashMap
        Map<String, String> hashMap = new HashMap<>();
        for (String key : prop.stringPropertyNames()) {
            hashMap.put(key, prop.getProperty(key));
        }
        System.out.println("HashMap: " + hashMap);
         
        System.out.println(hashMap.get("name"));
	  }
        catch (IOException e) {
            e.printStackTrace();
	}

 }
}
