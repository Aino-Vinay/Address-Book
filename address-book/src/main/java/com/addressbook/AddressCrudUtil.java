package main.java.com.addressbook;
import java.util.*;


public class AddressCrudUtil {
	
	HashMap<String,Address> hashObj=new HashMap<String,Address>();
	
	
	
	public void create(String name)
	{
		hashObj.put(name, new Address());
	}
	
	public void Read(String name)
	{
		hashObj.get(name);
	}
	
	public void update(String name)
	{
		hashObj.replace(name, new Address());
	}
	
	public void delete(String name)
	{
		hashObj.remove(name);
	}
	
	
	

}
