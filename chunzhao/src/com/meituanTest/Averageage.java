package com.meituanTest;

import java.util.Scanner;

public class Averageage {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    while(scanner.hasNextInt())
    {
    	double w=scanner.nextDouble();
    	double y=scanner.nextDouble();
    	double x=scanner.nextDouble();
    	int n=scanner.nextInt();
    	while(n-->0){
    		y=(y+1)*(1-x)+x*21;
    	}
    	System.out.println((int)Math.ceil(y));
    }
    scanner.close();
	}

}
