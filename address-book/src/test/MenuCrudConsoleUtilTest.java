package test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.java.com.addressbook.Menu;
import main.java.com.addressbook.MenuCrudConsoleUtil;


public class MenuCrudConsoleUtilTest {
	
	public static MenuCrudConsoleUtil menuCrudConsoleObject;
	
	public static Menu menuObject;
	
	@BeforeClass
	public static void setUpBeforeClass() 
	{
		menuCrudConsoleObject=new MenuCrudConsoleUtil();
		
	}

	@Test
	public void createMenuTest() 
	{
		menuObject=menuCrudConsoleObject.createMenu();
		assertTrue(menuObject.getMenu_name().equals("PhoneBookManager"));
		
	}
	
	@Test
	public void addMenuItemTest() 
	{
		menuObject=menuCrudConsoleObject.createMenu();
		menuCrudConsoleObject.addMenuItem(menuObject);
		assertTrue(menuObject.);
		
	}

}
