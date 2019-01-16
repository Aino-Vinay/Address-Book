package com.addressbook;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddressCrudUtil {
	
	Address address_obj;
	
	MapAddressStore mapAddressStoreObject=new MapAddressStore();
	MySqlAddressStore mySqlAddressObject=new MySqlAddressStore();
	
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
		
		
	//	hashObj.put(name,address_object);
		
		mapAddressStoreObject.add(name,address_object);
		mySqlAddressObject.add(name,address_object);
		return address_object;
		
		
	}
	
	public void Read(String name,Address address_object_read)
	{
			
		System.out.println("Reading");
		
		Address addressObjectRead=mapAddressStoreObject.read(name);
		
		System.out.println("The Street Is :"+addressObjectRead.street);
		
		System.out.println("The City Is :"+addressObjectRead.city);
		
		System.out.println("The Country Is :"+addressObjectRead.country);
		
		System.out.println("The Zip Is :"+addressObjectRead.zip);
		
		
		
		
		//////////////////////////////////////////////////////////////
		System.out.println("*********************Reading from database*************************");
		
		Address addressObjectReadFromDB=mySqlAddressObject.read(name);
		
		System.out.println("The Street Is :"+addressObjectReadFromDB.street);
		
		System.out.println("The City Is :"+addressObjectReadFromDB.city);
		
		System.out.println("The Country Is :"+addressObjectReadFromDB.country);
		
		System.out.println("The Zip Is :"+addressObjectReadFromDB.zip);
		
		
		
		
	}
	
	public void update(String name)
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
		
		
		
		
		mapAddressStoreObject.update(name, address_object_for_update);
		mySqlAddressObject.update(name,address_object_for_update);
	
		System.out.println("************** Record Updated **********");

		

	}
	
	public void delete(String name)
	{
		
		mapAddressStoreObject.delete(name);
		mySqlAddressObject.delete(name);
		System.out.println("************** Record Deleted **********");
		
	}
		
	
	
	

}
