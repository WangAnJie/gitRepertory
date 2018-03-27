package com.system.java.newnature.test;

import java.util.ArrayList;

public class LocalVariableTest {
public static void main(String[] args){
		var x = new ArrayList<String>();
		 for(int i = 0; i<10; i++){
			x.add("here is "+i);

		}
		for(int i = 0;i<x.size(); i++){
			System.out.println(x.get(i));	
		}
       
    }
}
