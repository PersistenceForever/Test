package com.lian.cn;
//注意一下:基本数据类型与整型在集合中的判断可以按照常规来判断；但是其他类变量不能直接判断
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;


public class Test4 {

	public static void main(String[] args) {	
		Student s1=new Student(12,"shasha1");
		Student s2=new Student(13,"shasha2");
		Student s3=new Student(14,"shasha3");
		Student s4=new Student(15,"shasha4");
		HashMap<String,Student> hm=new HashMap<String,Student>();
		hm.put(new String("guoshasha1"),s1);
		hm.put(new String("guoshasha2"),s2);
		hm.put(new String("guoshasha3"),s3);
//		System.out.println(hm.containsKey(new Double(12.0)));
		System.out.println(hm.containsKey(new String("guoshasha1")));
	
/*	   ArrayList<Student> al1=new ArrayList<Student>();
	   ArrayList<Student> alTemp=new ArrayList<Student>();
	 
	    al1.add(s1);
	    al1.add(s2);
	    al1.add(s3);
	    alTemp.addAll(al1);
//	    System.out.println("al1的大小:"+al1.size());
//	    System.out.println("alTemp的大小:"+alTemp.size());
	   ArrayList<Student> al2=new ArrayList<Student>();
	    al2.add(s1);
	    al2.add(s2);
	    al2.add(s4);
	    alTemp.retainAll(al2);
//	    System.out.println(al1.size());
//	    System.out.println(al1.retainAll(al2));
	    for (int i = 0; i < alTemp.size(); i++) {
			System.out.println(alTemp.get(i).toString());
		}*/

	}

}
class Student
{
	private int age;
	private String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	/*public boolean equals(Student s)
	{
		if(this.name==s.name&&this.name.equals(s.name))
			return true;
		return false;
	}*/
	public String toString()
	{
		return this.age+","+this.name;
	}
	
}
