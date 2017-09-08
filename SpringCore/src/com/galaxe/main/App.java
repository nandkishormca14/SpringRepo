package com.galaxe.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.galaxe.beans.HelloWorld;
import com.galaxe.beans.OutputHelper;
import com.galaxe.beans.StaticInnerBean;
import com.galaxe.beans.StaticInnerBean.Inner;

public class App {
	
	final static Logger logger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		
							
				ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
				
				Inner obj3= (Inner) context.getBean("inner");
				obj3.display();
				
				HelloWorld obj= (HelloWorld) context.getBean("hellobean");
				obj.setId(1);
				obj.printHello();
				HelloWorld obj1= (HelloWorld) context.getBean("hellobean");
				//obj1.setId(2);
				obj1.printHello();
				OutputHelper obj2=(OutputHelper) context.getBean("outputHelper");
				obj2.getOutput();
				
	}
		
}
