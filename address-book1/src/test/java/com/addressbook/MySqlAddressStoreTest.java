package com.addressbook;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MySqlAddressStoreTest {
	public static MySqlAddressStore mySqlAddressStoreObject=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		mySqlAddressStoreObject=new MySqlAddressStore();
	}
	
	


	@Test
	public void testAdd() {
		
		String name="Shubham";
		Address addressObject=new Address();
		addressObject.name="Shubham";
		addressObject.street="south";
		addressObject.city="Chennai";
		addressObject.country="India";
		addressObject.zip=4788;

		int id=mySqlAddressStoreObject.add(name, addressObject);
		assertTrue(id==1);
	}

	@Test
	public void testUpdate() {
		String name="Vinay";
		Address addressObject=new Address();
		addressObject.name="Vinay";
		addressObject.street="East";
		addressObject.city="Mumbai";
		addressObject.country="India";
		addressObject.zip=411001;

		mySqlAddressStoreObject.add(name, addressObject);
		
		String nameUpdate="Vinay";
		Address addressObjectUpdate=new Address();
		addressObjectUpdate.name="Vinay";
		addressObjectUpdate.street="West";
		addressObjectUpdate.city="Delhi";
		addressObjectUpdate.country="India";
		addressObjectUpdate.zip=411;


		int id=mySqlAddressStoreObject.update(name, addressObjectUpdate);
		
		
		assertTrue(id==1);
	}

	@Test
	public void testDelete() {
		String name="Rajat";
		Address addressObject=new Address();
		addressObject.name="Rajat";
		addressObject.street="North";
		addressObject.city="Banglore";
		addressObject.country="India";
		addressObject.zip=411;

		mySqlAddressStoreObject.add(name, addressObject);
		
	

		int id=mySqlAddressStoreObject.delete(name);
		
		
		assertTrue(id==1);
	}

	@Test
	public void testRead() {
		String name="Minal";
		Address addressObject=new Address();
		addressObject.name="Minal";
		addressObject.street="Krushnanagar";
		addressObject.city="Karachi";
		addressObject.country="Pakistan";
		addressObject.zip=611001;
		
		

		mySqlAddressStoreObject.add(name,addressObject);
		
		Address addressObjectReturn=mySqlAddressStoreObject.read(addressObject.name);
		
		assertTrue(addressObject.name.equals(addressObjectReturn.name));

		assertTrue(addressObject.street.equals(addressObjectReturn.street));

		assertTrue(addressObject.country.equals(addressObjectReturn.country));
		assertTrue(addressObject.city.equals(addressObjectReturn.city));
		

		assertTrue(addressObject.zip==addressObjectReturn.zip);
		
	}

}
