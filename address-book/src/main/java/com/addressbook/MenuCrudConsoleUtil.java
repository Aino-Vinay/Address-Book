package main.java.com.addressbook;

import java.util.*;
public class MenuCrudConsoleUtil 

{
	Scanner sc=new Scanner(System.in);
	public Menu createMenu()
	{

		System.out.println("Enter The Menu");

		
		String menu_name=sc.next();


		Menu menuObj=new Menu(menu_name);


		

		return menuObj;
	}

	public void addMenuItem(Menu menuObj)
	{
		
		String menu_name="true";
		while(!menu_name.equals("false"))
		{
			
			
			
			System.out.println("Enter The Menu Item or false to exit the loop");
			menu_name=sc.next();
			
			
			
			
			
			
			MenuItem menu_item_obj=new MenuItem(menu_name);

			menuObj.addMenuItem(menu_item_obj);
			
		}

	}

	public void displayMenuAndItem(Menu menuObj)
	{
		

		menuObj.displayItem();


	}


}
