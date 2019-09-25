package pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList.Member2;


 public class Learn extends Child4
 {
	/* void display()
		{
			System.out.println("NEW class");
			
		}*/
	public static void main(String args[])
		{
			//System.out.println("child class2");
			//super.display();
		//	this.display();
		Learn obj2=new Learn();
			obj2.display();
		}	
	
	
}

 class Child 
{
	 void display()
	{
		System.out.println("child1 class");
		
	}
	
}
 
 class Child3 extends Child
 {
	  void display()
		{
			System.out.println("3 class");
		}
 	
 }
  
 class Child4 extends Child
 {
	 void display()
		{
			System.out.println("child4 class");
			PriorityQueue values=new PriorityQueue();
			values.add(4);
			values.add(6);
			values.poll();
			System.out.println(values.peek());
			
		} 	
 	
 }