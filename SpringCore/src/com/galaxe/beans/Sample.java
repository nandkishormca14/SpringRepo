package com.galaxe.beans;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Sample {

	public static void main(String[] args) {


String[] str = new String[]{"This", "is", "a", "boy"};


		TreeMap<Integer, String> tr=new TreeMap<Integer,String>();
		for(String st:str){
			System.out.println(st);
			tr.put(st.length(), st);
		}
		
		for(Entry<Integer, String> entry:tr.entrySet())
		System.out.print(entry.getValue()+" ");
	}
}
