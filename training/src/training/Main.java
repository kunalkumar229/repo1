package training;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class idSort implements Comparator<Employee>{  
	public int compare(Employee o1,Employee o2){  
	Employee e1=o1;  
	Employee e2=o2;
	return e1.id.compareTo(e2.id);
	}  
	
} 
class nameSort implements Comparator<Employee>{  
	public int compare(Employee o1,Employee o2){  
	Employee e1=o1;  
	Employee e2=o2;
	return e1.name.compareTo(e2.name);
	}  
	
} 

class desigSort implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
	Employee e1=(Employee)o1;  
	Employee e2=(Employee)o2;
	return e1.designation.compareTo(e2.designation);
	}  
	
}

class deptSort implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
	Employee e1=(Employee)o1;  
	Employee e2=(Employee)o2;
	return e1.department.compareTo(e2.department);
	}  
	
}



public class Main {
	public static void main(String [] args) throws IOException{
		File file = new File("D:\\empData.txt");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> hm = new ArrayList<Employee>();
		String str;
		while((str=bf.readLine())!= null){
			String [] data = str.split(",");
			hm.add(new Employee(data[0],data[1],data[2],data[3]));
		}
		while(true){
			System.out.println("Enter your option to Sort By :\n1. ID\n2. NAME\n3. DESIGNATION\n4. DEPARTMENT\nPRESS 5 TO EXIT !!!!!!!");
			int i = sc.nextInt();
			System.out.println(String.format("%s%9s%18s%27s","ID","NAME","DESIGNATION","DEPARTMENT"));
			System.out.println("------------------------------------------------------------------");
			switch(i){
			case 1: Collections.sort(hm,new idSort());
					hm.forEach((o)->System.out.println(String.format("%s%9s%18s%27s",o.id,o.name,o.designation,o.department)));
					break;
			case 2: Collections.sort(hm,new nameSort());
					hm.forEach((o)->System.out.println(String.format("%s%9s%18s%27s",o.id,o.name,o.designation,o.department)));
					break;
			case 3: Collections.sort(hm,new desigSort());
					hm.forEach((o)->System.out.println(String.format("%s%9s%18s%27s",o.id,o.name,o.designation,o.department)));
					break;
			case 4: Collections.sort(hm,new deptSort());
					hm.forEach((o)->System.out.println(String.format("%s%9s%18s%27s",o.id,o.name,o.designation,o.department)));
					break;
			case 5: System.exit(0);		
			}
			System.out.println("------------------------------------------------------------------");
		}
		//sc.close();
	}
}
