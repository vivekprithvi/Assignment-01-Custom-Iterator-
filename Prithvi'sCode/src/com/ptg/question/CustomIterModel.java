package com.ptg.question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CustomIterModel<E> implements Iterator<E> {
	List<String> list = new ArrayList<String>();
	int i=0, pointer;
	
		public CustomIterModel(List l) {
		super();
		this.list = l;
	}

		@Override
		public boolean hasNext() {
			pointer = i;
			if(pointer<list.size())
				{
				i = i+2;
				return true;
				}
			else
				return false;
		}
		
		@Override
		public E next() {
			return (E) list.get(pointer);
		}
	}

