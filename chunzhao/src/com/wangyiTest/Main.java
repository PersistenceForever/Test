package com.wangyiTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int pairs=sc.nextInt();
	        for(int i = 0; i < pairs; i++){
	            int n=sc.nextInt();
	            List<Integer> list = new ArrayList<Integer>();
	            list = getList(list, n);
	            int j = 0;
	            while(j < list.size() - 1){
	                System.out.print(list.get(j)+" ");
	                j++;
	            }
	            System.out.println(list.get(list.size() - 1));
	        }
	        sc.close();

	}
	public static List<Integer> getList(List<Integer> list,int n){
		for (int i = 0; i < n; i++) {
			list.add(i+1);
		}
		for (int i = 1; i < n; i++) {
			int temp=list.remove(n-1);
			list.add(n-1-i, temp);
		}
		return list;
		
	}

}
