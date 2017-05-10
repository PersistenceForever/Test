package com.meituanTest;

public class CountPath {

	public static void main(String[] args) {
		int [][]map={{0,1,0},{2,0,0}};
		int n=2;
		int m=3;
		int value=countPath(map,n,m);
		System.out.println(value);

	}
	public static int countPath(int[][]map,int n,int m)
	{
		int x1=-1,y1=-1;//经理的坐标
		int x2=-1,y2=-1;//商家的坐标
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1){
					x1=j;
					y1=i;
				}else if(map[i][j]==2)
				{
					x2=j;
					y2=i;
				}
			}
			
		}
		int xto=x1>x2?-1:1;//根据经理和商家的方向判断向左走还是向右走
		int yto=y1>y2?-1:1;//向上还是向下
		for (int y = y1; y!=(y2+yto); y+=yto) {
			for (int x = x1; x!=(x2+xto); x+=xto) {
				if(y==y1||x==x1)
				{
					map[y][x]=1;
					continue;
				}
				map[y][x]=map[y-yto][x]+map[y][x-xto];
			}
			
		}
		return map[y2][x2];
		
	}

}
