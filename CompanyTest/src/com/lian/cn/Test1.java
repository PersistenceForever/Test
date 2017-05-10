package com.lian.cn;

import java.util.ArrayList;
import java.util.HashMap;
//注意：只有String和Integer类型是特例，其余在集合框架中不能直接用引用类型
public class Test1 {

	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<Person>();
		HashMap<Person,Integer> hm=new HashMap<Person,Integer>();
		HashMap<String,Integer > hm1=new HashMap<String,Integer>();
		hm1.put(new String("shasha"),new Integer(1));
		hm1.put(new String("shanshan"),new Integer(2));
		Person p1=new Person(20,"guoshasha");
		Person p2=new Person(21,"haoshasha");
		Person p3=new Person(21,"haoshasha");
		System.out.println("p2==p3:"+p2.equals(p3));
		al.add(p1);
		al.add(p2);
		hm.put(p1, 1);
		hm.put(p2, 2);
		Person p=p1;
//		System.out.println(al.contains(new Person(20,"guoshasha")));//false
//		System.out.println(al.contains(p1));//true
//		System.out.println(hm.containsKey(p));
		System.out.println(hm1.containsKey(new String("shasha")));
		
	}

}
class Person
{
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public boolean equals(Person p)
	{
		if(this.age==p.age&&this.name.equals(p.name))
			return true;
		else 
			return false;
	}
	
}
