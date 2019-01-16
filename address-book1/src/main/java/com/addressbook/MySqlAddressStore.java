package com.addressbook;

import java.sql.*;

public class MySqlAddressStore implements AddressStore
{
	Connection connectionObject=null;
	Statement statementObject=null;
	ResultSet resultSetObject=null;
	public MySqlAddressStore() {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		connectionObject=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","root");
		statementObject=connectionObject.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public int  add(String name,Address addressObject)
	
	{
		int id=0;
		try {
			
		 id=statementObject.executeUpdate("insert into address values('"+name+"','"+addressObject.street+"','"+addressObject.city+"','"+addressObject.country+"','"+addressObject.zip+"')");
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return id;
		
	}
	
	public int update(String name,Address addressObject)
	{
		int id=0;
		try {
			
			id=statementObject.executeUpdate(" update address set  street='"+addressObject.street+"',city='"+addressObject.city+"',country='"+addressObject.country+"',zip='"+addressObject.zip+"' where name='"+name+"'");
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return id;
	}
	
	public int delete(String name)
	{
		int id=0;
		try {
			
			id=statementObject.executeUpdate("DELETE FROM address where name='"+name+"'");
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return id;
	}
	
	public Address read(String name)
	{
		Address addressObject=new Address();

		try {
			
			
			
		resultSetObject=statementObject.executeQuery("SELECT * FROM address WHERE name='"+name+"'");
		addressObject.name=name;
		if(resultSetObject.next())
		{
		
		addressObject.street=resultSetObject.getString("street");

		addressObject.city=resultSetObject.getString("city");
		

		addressObject.country=resultSetObject.getString("country");
		

		addressObject.zip=resultSetObject.getInt("zip");
		}//if
		
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return addressObject;
	}
	
	
	
	
}
