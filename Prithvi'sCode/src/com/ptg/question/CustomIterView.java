package com.ptg.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomIterView{
	List<String> list = new ArrayList<String>();
	
	void addElements() {
		
		System.out.println("Enter number of elements: ");
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n;i++)
		{
			list.add(sc.nextLine());
		}
	}
}
