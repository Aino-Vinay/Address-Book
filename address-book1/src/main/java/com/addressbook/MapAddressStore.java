package com.addressbook;

import java.util.HashMap;

public class MapAddressStore implements AddressStore
{

	public HashMap<String,Address> hashObj=new HashMap<String,Address>();
	
	public int add(String name,Address addressObject)
	{
		hashObj.put(name, addressObject);
		
		return 1;
	}
	public Address read(String name)
	{
		return hashObj.get(name);
	}
	
	public int update(String name,Address addressObject)
	{
		
		hashObj.replace(name, addressObject);
		return 1;
	}
	
	public int delete(String name)
	{
		hashObj.remove(name);
		return 1;
	}

}
