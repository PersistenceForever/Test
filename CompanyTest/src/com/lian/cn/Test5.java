package com.lian.cn;
//二进制的与运算步骤：首先将二进制字符串转换成Int类型，然后使用位运算符
public class Test5 {

	public static void main(String[] args) {
		String s="11";
		String ss="10";
		int s1=Integer.parseInt(s,2);//按照基数类型解析s的值
		int s2=Integer.parseInt(ss,2);//按照基数类型解析ss的值
		String result=Integer.toBinaryString(s1&s2);
		System.out.println(result);
//		int s2=Integer.parseInt(s,10);//按照基数类型解析s的值
//		System.out.println("s1:"+s1);
//		System.out.println("s2:"+s2);
		

	}

}
