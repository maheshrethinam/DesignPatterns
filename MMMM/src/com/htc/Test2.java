package com.htc;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int arr[]= {2,1,4,3,7,5,8,6};
		
		//System.out.println("Before Sort =>>"+Arrays.toString(arr));
		arr=sortArr(arr);
		System.out.println("After Sort =>>"+Arrays.toString(arr));
		
	}
	
	
	
	public static int[] sortArr(int[] arr) {
		int len=arr.length/2;
		
		

		for(int j=0;j<len-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j=-1;
			}
			
		}
		
		
		
		
//		for(int j=len;j<orgLen-1;k++) {
//			System.out.println("Value =>> " +k+"     "+arr[k]+"     "+arr[k+1]);
//			if(arr[k]<arr[k+1]) {
//				int temp=arr[k+1];
//				arr[k+1]=arr[k];
//				arr[k]=temp;
//				k=-1;
//			}
//			
//		}
		
		
		
		return arr;
	}

}
