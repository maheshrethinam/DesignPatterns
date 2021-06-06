package com.htc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		List<Integer> value=Arrays.asList{1,9,4,3,2,3,4,5,6,9};
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(103);
		al.add(3);
		al.add(35);
		al.add(300);
		al.add(33);
		al.add(34);
		
		Collections.sort(al);
		int element=al.get(al.size()-2);
		System.out.println(element);
		
	}

}
