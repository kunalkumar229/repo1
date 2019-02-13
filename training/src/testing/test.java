package testing;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		password = sc.nextLine();
		int n = password.length();	
		 int d=0,l=0,u=0,s=0,sum=0;
         for(int i=0;i<n;i++){
             if(Character.isDigit(password.charAt(i))){
                 d=1;
             }
             else if(Character.isLowerCase(password.charAt(i))){
                 l=1;
             }
             else if(Character.isUpperCase(password.charAt(i))){
                 u=1;
             }
             else{
                 s=1;
             }
         }
     sum=4-(d+l+u+s);
     System.out.println("outer sum"+" "+sum);
     System.out.println("d="+d+" "+"l="+l+" "+"u="+u+" "+"s="+s);
     if(n>=6){
         System.out.println("sum"+" "+sum);
     }
     else{
         if(sum<=(6-n)){
        	 System.out.println("6-n & sum<=6-n"+" "+(6-n)+"sum"+sum);
         }
         else{
        	 System.out.println("inner sum"+" "+sum+" (6-n)"+(6-n)); 
         }
     }
     sc.close();

	}

}
