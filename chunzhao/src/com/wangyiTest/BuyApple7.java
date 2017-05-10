package com.wangyiTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BuyApple7 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.close();
     int maxX=n/6;
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
     for (int i = 0; i <=maxX; i++) {
    	 int y=(n-6*i)/8;
    	 if(6*i+8*y==n)
    		 hm.put(i,y);
	 }
     if(hm.size()==0) {
    	 System.out.println(-1);
    	 return;
    	 }
     int []arr=new int[hm.size()];
     Set<Integer> set=hm.keySet();
     Iterator<Integer> iterator=set.iterator();
     for (int i = 0; i < arr.length&&iterator.hasNext(); i++) {
		int xx=iterator.next();
		int yy=hm.get(xx);
		arr[i]=xx+yy;
	}
     Arrays.sort(arr);
     System.out.println(arr[0]);
	}

}
