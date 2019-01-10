package main.java.com.addressbook;
import java.io.*;

public class AddressBookConsoleManager 
{
	public static void main(String args[])
	{
		
		MenuCrudConsoleUtil crudObj=new MenuCrudConsoleUtil();
		Menu m;
		
		m=crudObj.createMenu();
		
		crudObj.addMenuItem(m);
		
		crudObj.displayMenuAndItem(m);
		
		
		
		
	}
}
	

	
	
	
			


