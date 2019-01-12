package main.java.com.addressbook;
import java.io.*;
import java.util.*;
public class AddressBookConsoleManager 
{
	static Scanner scanner_object=new Scanner(System.in);
	
	
	
	
	////////////////////////////////CompareOfArrayList not working
	
	//////////////Alternative of Compare
	public boolean compareMenuItem(String menu_item_name,Menu m)
	{
		boolean result=false;
		for (MenuItem i : m.menu_item) 
		{ 
			if(i.menuitem_name.equals(menu_item_name))
			{
				result=true;
				break;
			}
			
		}
		
		return result;
		
	}
	
	
	/////////////////////////////////////////////////////////////////
	

	
	
	
	
	public static void main(String args[])
	{
		
		MenuCrudConsoleUtil crudObj=new MenuCrudConsoleUtil();
		Menu m;
		
		
		m=crudObj.createMenu();
		
		crudObj.addMenuItem(m);
		
		
		AddressBookConsoleManager address_book_console_manager_object=new AddressBookConsoleManager();
		
		AddressCrudUtil address_crud_util_object=new AddressCrudUtil();
		
		
		
		while(true)
		{
			
			crudObj.displayMenuAndItem(m);
			
			System.out.println("Enter Your Choice :");
			
			
			String menu_name=scanner_object.next();
			
			
			if(address_book_console_manager_object.compareMenuItem(menu_name, m))
			{
			
			Address address_obj_switch=null;
			switch(menu_name)
			{
			
				case "Create":address_obj_switch=address_crud_util_object.create();
				System.out.println("****************Address Created*************");
				
				break;
				
				case "Read":
					System.out.println("********Enter The Name To Read Address****");
					String name_read=scanner_object.next();
					address_crud_util_object.Read(name_read,address_obj_switch);
				
				break;
				
				
				case "Update":
					
					System.out.println("************** Enter The Name To Update**********");

					String name_read_update=scanner_object.next();
					address_crud_util_object.update(name_read_update);
				
				break;
				
				
				
				case "Delete":
					
					System.out.println("************** Enter The Name To Update**********");

					String name_read_delete=scanner_object.next();
					address_crud_util_object.delete(name_read_delete);
				
				break;
				
				
				case "Exit":
					 System.exit(0);
				
			}
			
			
			
			}//if to check menu item
			
			else
			{
				System.out.println("Enter The Valid Choice");
			}//else
			

		}// while for infinite iteration
		
		
		
		
		
		
	}
}
	

	
	
	
			


