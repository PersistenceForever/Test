package com.wangyiTest;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GouZaoQueue {

	 public static void main(String args[]){
	        new GouZaoQueue().getInput();
	    }
	    public void getInput(){
	        Scanner sc=new Scanner(System.in);
	        int pairs=sc.nextInt();

	        for(int i = 0; i < pairs; i++){
	            int n=sc.nextInt();
	            List<Integer> list = new ArrayList<Integer>();
	            list = getPerm(list, n);
	            int j = 0;
	            while(j < list.size() - 1){
	                System.out.print(list.get(j)+" ");
	                j++;
	            }
	            sc.close();
	            System.out.println(list.get(list.size() - 1));
	        }
	    }
	    public List<Integer> getPerm(List<Integer> list ,int n){
	        int tmp = 0;
	        while(n>0){
	            list.add(0,n);
	            tmp = list.remove(list.size()-1);
	            list.add(0,tmp);
	            n--;
	        }
	        return list;
	    }
	  
}
