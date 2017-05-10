package com.wangyiTest;

import java.util.Scanner;
public class YouYa2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rr=sc.nextInt();
		int count=0;
		for(int i=1;i*i<=rr;i++)
		{
			int j=i*i;
			int y=(int) Math.sqrt(rr-j);
			if(j+y*y==rr)
			{
				++count;
			}
		}  
		sc.close();
        System.out.println(count*4);
	}
}
