package com.ptg.question;

import java.util.ArrayList;
import java.util.List;

public class CustomIterController {
	
	public static void main(String[] args) {
		CustomIterView le = new CustomIterView();
		
		le.addElements();
		
		CustomIterModel cust = new CustomIterModel<>(le.list);
		
		
		System.out.println("Printing elements using the custom iterator: ");
		cust.hasNext();
		
		System.out.println(cust.next());
		
		cust.hasNext();
		
		System.out.println(cust.next());
		
		cust.hasNext();
		
		System.out.println(cust.next());
		
		cust.hasNext();
		
		System.out.println(cust.next());
	}
}
