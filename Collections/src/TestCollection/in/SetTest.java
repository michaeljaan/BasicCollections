package TestCollection.in;
import java.util.*;//import all inbuilt packages

import in.com.cg.Car;
import in.com.cg.Cellphone;
import in.com.cg.Laptop;
import in.com.cg.School;
import in.com.cg.Television;

public class SetTest {

	public static void main(String[] args)//main function
	{
		Set<Object>set=new LinkedHashSet<>();//Set declaration
		
		set.add(new Car("Porsche","Cayman",2008,3000000));//Create a new Object of class Car and initialize the member instance
		set.add(new Car("Audi","A8",2018,70000000));
		set.add(new Car("Mahindra","Scorpio",2006,2000000));
		set.add(new Car("Mahindra","Scorpio",2006,2000000));//duplicate the instance member
		
		set.add(new Laptop("Dell",3386,"DOS","i5"));//Create a new object of class Laptop and initialize the instance member
		set.add(new Laptop("HP",786,"WINDOWS","i7"));
		set.add(new Laptop("Apple",243,"MACOS","IOS"));
		set.add(new Laptop("HP",786,"WINDOWS","i7"));//duplicate the instance member
		
		set.add(new Television("Panasonic","LCD","Yes",20000));//create a new object of class Television and initialize the instance member 
		set.add(new Television("Sony","LED","No",40000));
		set.add(new Television("LG","Plasma","Yes",60000));
		
		set.add(new Cellphone("Xiomi","Redmi Note5 Pro", "Leading mobile", "MIUI 10",15000));//create a new object of class cellPhone and initialize instance member
		set.add(new Cellphone("Apple","iPhone X", "Best in industry", "IOS 12",75000));
		set.add(new Cellphone("Huwaei","Honor 9 lite", "Budget mobile", "android",16000));
		set.add(new Cellphone("Huwaei","Honor 9 lite", "Budget mobile", "android",16000));//duplicate the instance member
		
		set.add(new School("SVN","Bengaluru","Bengaluru",1));//create a new object of class School and initialize the instance member
		set.add(new School("VVS","Mysuru","Mandya",4));
		set.add(new School("VVSSP","Mengaluru","Bengaluru",2));
		
		 set.stream().forEach((Set1)->System.out.println(Set1));//output all the data collected

	}

}
