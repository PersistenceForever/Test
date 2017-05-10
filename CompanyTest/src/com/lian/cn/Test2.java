package com.lian.cn;

public class Test2 {

	public static void main(String[] args) {
		int i=3;
		int j=3;
		while(i<=3)
		{
			while(j<=3&&j>=0)
			{
				j--;
				System.out.println("j:"+j);
				if(j==1)
					break;
			}
			i--;
			System.out.println("i:"+i);
		}

	}

}
