package com.wangyiTest;

import java.util.ArrayList;
import java.util.Scanner;

public class TiaoShiBan3 {

	public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            System.out.println(getNum(n, m));
            scanner.close();
    }
    private static int getNum(int n,int m){
        if(n==m)return 0;
        int len=m-n+1;
        int [] array=new int [len];
        array[0]=0;
        ArrayList<Integer> list=new ArrayList<Integer>();    //用list保存约数
        for(int i=1;i<len;i++){           //开始时所有位置都是不可达的
            array[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<len;i++){
            if(array[i]==Integer.MAX_VALUE)continue;       //当前位置不可达，直接计算下一位置
            list.clear();
            list=get(n+i);
            for(int j=0;j<list.size();j++){
                int tempNum=list.get(j);
                if(i+n+tempNum<=m&&array[i]+1<array[i+tempNum]){   //计算当前可达位置，并更新状态表
                    array[i+tempNum]=array[i]+1;
                }
            }
        }
        if(array[len-1]==Integer.MAX_VALUE)return -1;
        else return array[len-1];
    }
    private static ArrayList<Integer> get(int n){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=2;i<=Math.sqrt(n);i++){      //求所有约数
            if(n%i==0){
                list.add(i);
                    if(n/i!=i){
                        list.add(n/i);
                    }
            }
        }
        return list;
    }


}
