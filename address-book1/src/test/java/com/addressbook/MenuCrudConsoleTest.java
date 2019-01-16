package com.addressbook;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



public class MenuCrudConsoleTest {
	
	public static com.addressbook.MenuCrudConsoleUtil menuCrudConsoleObject;
	
	public static com.addressbook.Menu menuObject;
	
	@BeforeClass
	public static void setUpBeforeClass() 
	{
		menuCrudConsoleObject=new com.addressbook.MenuCrudConsoleUtil();
		
	}

	@Test
	public void createMenuTest() 
	{
		menuObject=menuCrudConsoleObject.createMenu();
		
		assertTrue(menuObject.getMenu_name().equals("PhoneBookManager") );
		
	}
	
	@Test
	public void addMenuItemTest() 
	{
		menuObject=menuCrudConsoleObject.createMenu();
		
		menuCrudConsoleObject.addMenuItem(menuObject);
		
		assertTrue(menuObject.menu_item.get(0).menuitem_name.equals("Create"));
	}

}

