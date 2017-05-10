package com.wangyiTest;

import java.util.Scanner;

public class XiPai {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int T=in.nextInt();
			for(int i=0;i<T;i++)
			{
				int n=in.nextInt();
				int k=in.nextInt();
				int[] a=new int[2*n];
				for (int j = 0; j < 2*n; j++) {
					a[j]=in.nextInt();
					
				}
				shuffle(a,n,k);
			}
		}
		in.close();
     
	}
	public static void shuffle(int[] a,int n,int k)
	{
		int []b=new int[2*n];
		for (int i = 0; i < 2*n; i++) {
			int index=i+1;//index是数组下标值加1
			for (int j = 0; j < k; j++) {//k层循环，改变index值
				if(index<=n){
					index=2*index-1;
				}else{
					index=2*(index-n);
				}
			}
			b[index-1]=a[i];//完成k次洗牌后，将得到的新牌赋值给新的数组b
		}
		//输出得到的洗牌顺序
		//System.out.println(b[0]);
		for (int i = 0; i < 2*n-1; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(b[2*n-1]);
	}

}
