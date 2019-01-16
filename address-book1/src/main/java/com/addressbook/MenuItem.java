package com.addressbook;

import java.util.*;

public class MenuItem 
{
	
/*	public void operateOnMenu()
	{
		System.out.println("1. Add MenuItem");
		System.out.println("2. Remove Menu Item");
		Scanner sc=new Scanner(System.in);
		int ch=Integer.parseInt(sc.next());
		Menu mobj=new Menu();
		switch(ch)
		{
		case 1:mobj.addMenuItem();
		break;
		
		case 2:mobj.removeMenuItem();
		break;
		}
	}
*/	
	
	public int menuitem_id;
	public String menuitem_name;
	
	
	
	
	
	public MenuItem(String menuitem_name) {
		
		this.menuitem_name = menuitem_name;
	}
	
	
	
	public int getMenuitem_id() {
		return menuitem_id;
	}
	public void setMenuitem_id(int menuitem_id) {
		this.menuitem_id = menuitem_id;
	}
	public String getMenuitem_name() {
		return menuitem_name;
	}
	public void setMenuitem_name(String menuitem_name) {
		this.menuitem_name = menuitem_name;
	}
	
	
	
	
		
	
	

}
