package com.galaxe.beans;

public class OutputHelper {

	IOutputGenerator iOutputGenerator;

	public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
		this.iOutputGenerator = iOutputGenerator;
	}
	
	public void getOutput(){
		iOutputGenerator.getOutput();
	}
	
}
