package com.htc;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int arr[]= {1,9,4,3,2,3,4,5,6};
		
		List list=Arrays.asList(arr);
		
		list.stream().sorted().findFirst();
		
		System.out.println(list.stream().sorted().findFirst());
		//System.out.println(list.stream().sorted().findFirst().toString());
		
		
		//System.out.println("Before Sort =>>"+Arrays.toString(arr));
		//arr=sortArr(arr);
		//System.out.println("After Sort =>>"+Arrays.toString(arr));
		
	}
	
	
	
	public static int[] sortArr(int[] arr) {
		int len=arr.length;
//		System.out.println("Length =>>"+len);
		for(int j=0;j<len-1;j++) {
//			System.out.println("Value =>> " +j+"     "+arr[j]+"     "+arr[j+1]);
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j=-1;
			}
			
		}
		
		
		return arr;
	}

}
