package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDetaProvider {
	
	Properties pro;
	
public ConfigDetaProvider()
{
	File src = new File("./Configuration/config.properties");
	
	try 
	{
		
	FileInputStream fis = new FileInputStream(src);
	
    pro = new Properties();
	
	pro.load(fis);
	
		
	} 
	catch (Exception e) 
	{
	System.out.println("exception is " +e.getMessage());	
		
	}
}
public String getChromePath()
{
	String url = pro.getProperty("chromePath");
	return url;
}
public String getApplicationUrl()
{
	String url = pro.getProperty("url");
	return url;
}
}















