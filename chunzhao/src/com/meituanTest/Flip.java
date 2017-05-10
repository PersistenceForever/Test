package com.meituanTest;

public class Flip {

	public static void main(String[] args) {
		int[][]a=new int[2][3];
		System.out.println(a.length);

	}
	public static int[][] flipChess(int[][]A,int[][]f)
	{ 
		for(int i=0;i<f.length;i++)
		{
			int row=f[i][0]-1;
			int col=f[i][1]-1;
			if((row-1)>=0)
				A[row-1][col]=(A[row-1][col]==0)?1:0;
			if((row+1)<=3)
				A[row+1][col]=(A[row+1][col]==0)?1:0;
			if((col-1)>=0)
				A[row][col-1]=(A[row][col-1]==0)?1:0;
			if((col+1)<=3)
				A[row][col+1]=(A[row][col+1]==0)?1:0;
		}
		
		return A;
	}
	
	
	

}
