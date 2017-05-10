package com.meituanTest;

import java.text.DecimalFormat;

//本题考查的是贪心算法
public class LongestDistance {

	public static void main(String[] args) {
		int[]array={5890,12599,9872,6013,9204,6573,11220,1588};
//		int[]array={10,5};
		int n=array.length;
		System.out.println("返回:"+getDis(array,n));

	}
	public static int getDis(int[]A,int n)
	{
		int maxDiff=0;//初始化最大差值
		int minNum=A[0];//初始化最小值
		for(int i=1;i<n;++i){//遍历
		   if(A[i]<minNum)minNum=A[i];//更新最小值
	       if(A[i]-minNum>maxDiff)maxDiff=A[i]-minNum;//更新最大差值              
	     }
		 return maxDiff;
		
	}

}
