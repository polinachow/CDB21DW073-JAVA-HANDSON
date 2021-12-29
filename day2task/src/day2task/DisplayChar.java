package day2task;
import java.util.Scanner;

public class DisplayChar {

	 public static  void main(String[] ags) {
		 
		 System.out.println("Enter the digits");
		 Scanner sc = new Scanner(System.in);
		 char cha=sc.next().charAt(0);
		 char cha1=sc.next().charAt(0);
		 char cha2=sc.next().charAt(0);
		 char cha3=sc.next().charAt(0);
		 int a = (int) cha;
		 int b = (int) cha1;
		 int c = (int) cha2;
		 int d = (int) cha3;
//		 int  c=cha,a=cha1,b=cha2,d=cha3;
		 System.out.println("corresponding number"+"\n"+a+'-'+cha+"\n"+b+'-'+cha1+"\n"+c+'-'+cha2+"\n"+d+'-'+cha3);
	 }
}
