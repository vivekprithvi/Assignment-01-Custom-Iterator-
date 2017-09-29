package com.ptg.controller;

import com.ptg.view.CustomIterator;

public class TestCustomIterator {
	public static void main(String[] args) {
		CustomIterator custom=new CustomIterator();
		//elements in the set
		custom.showSetElements();		

		//calling hasNext
		System.out.println("calling the hasNext() function:");
		System.out.println(custom.hasNext());
		
		//calling next()
		System.out.println("calling the next function of the customIterator");
		System.out.println(custom.next());

		//calling next() two times
		System.out.println("calling the next function of the customIterator twice");
		custom.next();
		System.out.println(custom.next());
	}
}
