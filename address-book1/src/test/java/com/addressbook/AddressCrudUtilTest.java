package com.addressbook;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AddressCrudUtilTest{

	public static AddressCrudUtil addressCrudUtilObject;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressCrudUtilObject=new AddressCrudUtil();
		
		
	}

	@Test
	public void testCreate() {
		Address addressObject=addressCrudUtilObject.create();
		
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).street.equals("East"));
		
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).city.equals("Nashik"));
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).country.equals("India"));
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).zip==411001);
		
	}

	@Test
	public void testUpdate() {
		
		Address addressObject=addressCrudUtilObject.create();
	
		addressCrudUtilObject.update(addressObject.name);
		
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).street.equals("West"));
		
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).city.equals("LA"));
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).country.equals("USA"));
		
		assertTrue(addressCrudUtilObject.hashObj.get(addressObject.name).zip==12345);
		
		
	}

	@Test
	public void testDelete()
	{
		Address addressObject=addressCrudUtilObject.create();
		
		addressCrudUtilObject.delete(addressObject.name);
		
		assertFalse(addressCrudUtilObject.hashObj.containsKey("Vinay"));
		
	}

}
