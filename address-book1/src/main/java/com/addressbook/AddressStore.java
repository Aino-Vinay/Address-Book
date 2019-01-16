package com.addressbook;

public interface AddressStore {
	
	public int add(String name,Address addressObject);
	
	public Address read(String name);
	
	public int update(String name,Address addressObject);
	
	public int delete(String name);
	//public Address read();
}
