package TestCollection.in;

import java.util.LinkedList;//Import all the packages
import java.util.List;

import in.com.cg.Car;
import in.com.cg.Cellphone;
import in.com.cg.Laptop;
import in.com.cg.School;
import in.com.cg.Television;

import java.util.*;
//Main function storing the array list
public class LinkList {

		public static void main(String[] args)
		{
			List list=new LinkedList();//linked list declaration
			
			list.add(new Car("Porsche","Cayman",2008,3000000));//Create a new Object of class Car and initialize the member instance
			list.add(new Car("Audi","A8",2018,70000000));
			list.add(new Car("Mahindra","Scorpio",2006,2000000));
			
			list.add(new Laptop("Dell",3386,"DOS","i5"));//Create a new object of class Laptop and initialize the instance member
			list.add(new Laptop("HP",786,"WINDOWS","i7"));
			list.add(new Laptop("Apple",243,"MACOS","IOS"));
			
			list.add(new Television("Panasonic","LCD","Yes",20000));//create a new object of class Television and initialize the instance member 
			list.add(new Television("Sony","LED","No",40000));
			list.add(new Television("LG","Plasma","Yes",60000));
			
			list.add(new Cellphone("Xiomi","Redmi Note5 Pro", "Leading mobile", "MIUI 10",15000));//create a new object of class cellPhone and initialize instance member
			list.add(new Cellphone("Apple","iPhone X", "Best in industry", "IOS 12",75000));
			list.add(new Cellphone("Huwaei","Honor 9 lite", "Budget mobile", "android",16000));
			
			list.add(new School("SVN","Bengaluru","Bengaluru",1));//create a new object of class School and initialize the instance member
			list.add(new School("VVS","Mysuru","Mandya",4));
			list.add(new School("VVSSP","Mengaluru","Bengaluru",2));
			
			 list.stream().forEach((list1)->System.out.println(list1));//output all the data collected
		}


}
