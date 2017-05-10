package com.lian.cn;
/*输入例子:
2
ABC
BCA

输出例子:
1875*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class JinRiTouTiao2017_1 {

	public static void main(String[] args) {
		int number,count;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	    number=Integer.parseInt(sc.next());
//	    System.out.println("number:"+number);
	    count=1;
	    ArrayList<String> al=new ArrayList<String>();
	    for (count = 1; count<= number;count++) {
	    	al.add(sc.next());
		}
	    //altm用于存放每一个字符串对应的改变后的格式的集合
	    ArrayList<TreeMap<Character,Long>>altm=new ArrayList<TreeMap<Character,Long>>();
	    HashSet<Character> countFirst=new HashSet<Character>();
	    //treeMap用于存放总的字符串改变后的格式
	    
	    TreeMap<Character,Long> treeMap=new TreeMap<Character,Long>();
	    ValueComporator vc=new ValueComporator(treeMap);
	    TreeMap<Character,Long> tmap=new TreeMap<Character,Long>(vc);
	    for (int i = 0; i < al.size(); i++) {
	    	TreeMap<Character,Long> te=getScore(al.get(i));
	    	altm.add(te);
		}
	    for (int i = 0; i < al.size(); i++) {
	    	char[]ch=al.get(i).toCharArray();
	    	countFirst.add(ch[0]);	
		}
	    //System.out.println("altm的大小:"+altm.size());
	    for(int j=0;j<altm.size();j++)
	    {
	    	TreeMap<Character,Long> temp=altm.get(j);
	    	Set<Character> set=temp.keySet();
	    	Iterator<Character> it=set.iterator();
	    	while(it.hasNext())
	    	{
	    		Character ch=(Character)it.next();
	    		if(treeMap.containsKey(ch))
	    		{
	    			Long value=treeMap.get(ch);
	    			value=value+temp.get(ch);
	    			treeMap.put(ch, value);
	    			
	    		}
	    		else
	    			treeMap.put(ch,temp.get(ch));
	    	}
	    	
	    	
	    }
	  
	   tmap.putAll(treeMap);
	   /* System.out.println("tmap的大小:"+treeMap.size());
	    Set<Character> set=treeMap.keySet();
	    Iterator<Character> it=set.iterator();
	    while (it.hasNext()) {
	    	Character ch=it.next();
	    	System.out.println(ch+","+treeMap.get(ch));
		}*/
	   long sum=0;//sum用于计算总的分值
	    Set<Map.Entry<Character,Long>> set=tmap.entrySet();
	    //System.out.println("tmap:"+tmap.size());
	    Iterator<Map.Entry<Character,Long>> it=set.iterator();
	    int jishu=9;
	   // int count1=0;
	    while (it.hasNext()) {
	    	Map.Entry<Character,Long> ch=it.next();
	         if(tmap.size()==10&&countFirst.contains(tmap.lastKey()))
	         {
	        	 //使用一个函数得到为基数为0的那个字符
	        	 char chMin=getChar(tmap, countFirst);
	        	 if(ch.getKey()!=chMin)
	        	 {
	        	   sum=sum+ch.getValue()*jishu;
	  	    	   jishu--; 
	        	 }
	        	 else
	        		 sum=sum+ch.getValue()*0;
	         }
	         else
	    	   {
	    	   sum=sum+ch.getValue()*jishu;
	    	   jishu--;
	    	   }	
	    	}
	    	//System.out.println(ch.getKey()+","+ch.getValue());
	
	    System.out.println(sum); 
	}
	//得到集合总数为10的那个为0的字符
	public static char getChar(TreeMap<Character,Long> tmap,HashSet<Character> countFirst)
	{
		TreeMap<Character,Long> temp=new TreeMap<Character,Long>();
		Set<Map.Entry<Character,Long>> set=tmap.entrySet();
		Iterator<Map.Entry<Character,Long>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character,Long> me=it.next();
			if(!countFirst.contains(me.getKey()))
			temp.put(me.getKey(),me.getValue());	
		}
		ValueComporator vc=new ValueComporator(temp);
		TreeMap<Character,Long>temp1=new TreeMap<Character,Long>(vc);
		temp1.putAll(temp);
		return temp1.lastKey();
		
	}
	//将每一个字符串的形式改写为(例如：字符串为“ABC”，则A:100,B:10,C:1）
	public static TreeMap<Character, Long> getScore(String s)
	{
		TreeMap<Character,Long> tm=new TreeMap<Character,Long>();
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(tm.containsKey(ch[i]))
			{
				Long value=tm.get(ch[i]);
				value=value+(long)Math.pow(10,ch.length-1-i);
				tm.put(ch[i], value);
			}
			else
				tm.put(ch[i],(long)Math.pow(10,ch.length-1-i));
			
		}
		return tm;
		
	}

}
class ValueComporator implements Comparator<Character>
{
	Map<Character, Long> base;

	public ValueComporator(Map<Character, Long> base) {
		this.base = base;
	}
	public int compare(Character a,Character b)
	{
		if(base.get(a)>=base.get(b))
		{
			return -1;
		}
		else return 1;
	}
	
}
