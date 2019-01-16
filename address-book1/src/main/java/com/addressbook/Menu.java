package com.addressbook;

import java.util.ArrayList;
public class Menu 
{
/*	ArrayList<String> menuItem=new ArrayList<String>();
	
	public void addMenuItem()
	{
		Scanner sc=new Scanner(System.in);
		menuItem.add(sc.nextLine());
		
	}
	
	public void removeMenuItem()

	{
		Scanner sc=new Scanner(System.in);
		menuItem.remove(sc.nextLine());
		
	}
	*/
	public int menu_id;
	public String menu_name;
	public ArrayList<MenuItem> menu_item=new ArrayList<MenuItem>();
	
	
	
		
	public Menu(String menu_name) {
		this.menu_name = menu_name;
		
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	
	public void addMenuItem(MenuItem mobj)
	{
		
		////////////////////jhjkghkjghgkjgkjlkkkljjjhjk pass
		
		menu_item.add(mobj);
	}
	
	void displayItem()
	{
		System.out.println("The Menu Is :"+menu_name);
		 int iNo=0;
		for (MenuItem i : menu_item) 
		{ 
			System.out.println(++iNo+"."+i.menuitem_name);
		}
	}
	
	
	
}
