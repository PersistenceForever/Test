package com.meituanTest;

public class MaxInnerRec {

	public static void main(String[] args) {
		int[] A={2,7,9,4,1};
		int n=5;
		System.out.println(countArea(A,n));

	}
	public static int countArea(int[] A,int n)
	{
		int i,j,L1,L2;
		int max=0,area;
		for(i=0;i<n;i++)
		{
		 L1=0;L2=0;
		for(j=i;j<n;j++)
		{
		if(A[j]>=A[i])L1++;
		else break;
		
		}
		for(j=i-1;j>=0;--j)
		{
	       if(A[j]>=A[i])L2++;
		   else break;
		}
		area=(L1+L2)*A[i];
		if(area>max)max=area;
		}
		return max;
	}

}
