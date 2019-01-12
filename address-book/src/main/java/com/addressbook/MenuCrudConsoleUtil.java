package main.java.com.addressbook;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MenuCrudConsoleUtil 

{
	Scanner sc=new Scanner(System.in);

	
	
	public Menu createMenu()
	{
		
		Logger logger=Logger.getLogger(this.getClass().getName());
		
		logger.log(Level.SEVERE, "Enter The Menu");

		System.out.println("Enter The Menu");

		
		String menu_name=sc.next();


		Menu menuObj=new Menu(menu_name);


		

		return menuObj;
	}

	public void addMenuItem(Menu menuObj)
	{
		System.out.println("Enter The Menu Item or false to exit the loop");
		String menu_name=sc.next();
		while(!menu_name.equals("false"))
		{
			
			MenuItem menu_item_obj=new MenuItem(menu_name);

			menuObj.addMenuItem(menu_item_obj);
			
			menu_name=sc.next();
		}

	}

	public void displayMenuAndItem(Menu menuObj)
	{
		

		menuObj.displayItem();


	}


}
