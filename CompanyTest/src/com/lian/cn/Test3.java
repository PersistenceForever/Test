package com.lian.cn;
//得到了我想要的结果
public class Test3 {
	public static void main(String[] args) {
		int i=4,j=3,count=2;
		while(count!=0)
		{
			while(i!=0)
			{
				i--;
				System.out.println("i:"+i);
				break;
			}
			while(j!=0)
			{
				j--;
				System.out.println("j:"+j);
				break;
			}
			count--;
		}

	}

}
