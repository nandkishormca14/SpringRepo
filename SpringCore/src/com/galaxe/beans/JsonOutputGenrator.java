package com.galaxe.beans;

public class JsonOutputGenrator implements IOutputGenerator{

	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	public void getOutput(){
		System.out.println(msg);
	}

}
