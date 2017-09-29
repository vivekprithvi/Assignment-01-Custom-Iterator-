package com.ptg.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomIterator implements Iterator<Integer> {
	static Set<Integer> employeeSet;
	Iterator<Integer> iterator;
	
	public CustomIterator(){
		employeeSet=new HashSet<>();
		
		employeeSet.add(1);
		employeeSet.add(2);
		employeeSet.add(3);
		employeeSet.add(4);
		employeeSet.add(5);
		employeeSet.add(6);
		employeeSet.add(7);
		employeeSet.add(8);
		iterator=employeeSet.iterator();

	}
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Integer next() {
		
		iterator.next();
		return iterator.next();
	}
	
	public void showSetElements(){
		for(Integer e:employeeSet){
			System.out.println(e);
		}
	}
	

}
