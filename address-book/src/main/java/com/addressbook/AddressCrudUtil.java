package main.java.com.addressbook;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddressCrudUtil {
	
	Address address_obj;
	HashMap<String,Address> hashObj=new HashMap<String,Address>();
	
	
	
	public Address create()
	{
		
		System.out.println("Enter Name :");
		String name=AddressBookConsoleManager.scanner_object.next();
		
		
		System.out.println("Enter Street :");
		String street=AddressBookConsoleManager.scanner_object.next();
		
		
		System.out.println("Enter City :");
		String city=AddressBookConsoleManager.scanner_object.next();
		
		
		System.out.println("Enter Country :");
		String country=AddressBookConsoleManager.scanner_object.next();
		
		System.out.println("Enter Zip :");
		int zip=AddressBookConsoleManager.scanner_object.nextInt();
		
		Address address_object=new Address();
		
		address_object.setName(name);
		
		address_object.setStreet(street);
		

		address_object.setCity(city);
		

		address_object.setCountry(country);
		

		address_object.setZip(zip);
		
		
		hashObj.put(name,address_object);
		
		return address_object;
		
		
	}
	
	public void Read(String name,Address address_object_read)
	{
		if(hashObj.containsKey(name))
		{
				
		System.out.println("Reading");
		
		address_object_read=hashObj.get(name);
		
		System.out.println("The Street Is :"+address_object_read.street);
		
		System.out.println("The City Is :"+address_object_read.city);
		
		System.out.println("The Country Is :"+address_object_read.country);
		
		System.out.println("The Zip Is :"+address_object_read.zip);
		
		}
		
		else
		{
			System.out.println("The Record Does Not Exists");
		}
		
	}
	
	public void update(String name)
	{
		if(hashObj.containsKey(name))
		{
		
		
		
		
		System.out.println("************** Enter The Details To Update**********");
		
		
	
		
		System.out.println("Enter Street :");
		String street=AddressBookConsoleManager.scanner_object.next();
		
		
		System.out.println("Enter City :");
		String city=AddressBookConsoleManager.scanner_object.next();
		
		
		System.out.println("Enter Country :");
		String country=AddressBookConsoleManager.scanner_object.next();
		
		System.out.println("Enter Zip :");
		int zip=AddressBookConsoleManager.scanner_object.nextInt();
		
		
		Address address_object_for_update=new Address();
	
		
		address_object_for_update.setStreet(street);
		

		address_object_for_update.setCity(city);
		

		address_object_for_update.setCountry(country);
		

		address_object_for_update.setZip(zip);
		
		
		
		
		
		
		hashObj.replace(name, address_object_for_update);
		
		
		System.out.println("**************  Details Updated **********");
		}
		
		else
		{
			System.out.println("The Record Does Not Exists");
		}

	}
	
	public void delete(String name)
	{
		if(hashObj.containsKey(name))
		{
		hashObj.remove(name);
		System.out.println("************** Record Deleted **********");
		
		}
		else
		{
			System.out.println("The Record Does Not Exists");
		}
	}
	
	
	

}
