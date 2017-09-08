package com.galaxe.beans;

public class HelloWorld {

	private String name;
	private int id;
	private int age;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	/*public HelloWorld(String name, int age,int id) {
		
		this.name = name;
		this.id = id;
		this.age=age;
	}

	public HelloWorld(int id,String name,int age) {
		
		this.name = name;
		this.id = id;
		this.age=age;
	}*/

	public void printHello(){
		System.out.println("Hello "+name+" your id is "+id+" age="+age);
	}
}
