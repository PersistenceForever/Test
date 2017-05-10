package com.wangyiTest;

import java.util.Scanner;

public class Huiwen1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(change(arr,n));
		}
		sc.close();
		
	}
	public static int change(int[] arr,int n) {
		int left=0;
		int right=n-1;
		int ans=0;
		while(left<right){
			if(arr[left]<arr[right]){
				arr[left+1]+=arr[left];
				++left;
				++ans;
			}else if(arr[left]>arr[right])
			{
				arr[right-1]+=arr[right];
				--right;
				++ans;
			}else{
				++left;
				--right;
			}
		}
		return ans;
	}

}
