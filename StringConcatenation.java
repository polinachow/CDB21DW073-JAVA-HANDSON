package day2task;
import java.util.Scanner;
import java.util.regex.Pattern;
public class StringConcatenation {
 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Inmate`s name");
		 String s1=sc.next();
		 System.out.println("Inmate`s father`s name");
		 String s2=sc.nextLine();
		 s2+=sc.nextLine();
		 sc.close();
		 String s3=s1.concat(" "+s2);  
		 int s=0;
		 for (int i = 0; i < s3.length(); i++) {
	           if(Character.isDigit(s3.charAt(i))) {
	        	 s=1;
	           }
	          
	        }
		 if(s==0) {
			 System.out.println(s3);
		 }
		 else {
			 System.out.println("Invalid Input");
		 }
}
}
