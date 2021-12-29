import java.util.Scanner;
public class FindAvegAge {	
	float calculateAverage(int[] age) {
		int s=age.length;
		float sum=0;
		float avg;
	for(int j=0;j<s;j++) {
		sum=sum+age[j];
	}
		return avg=sum/s;
	}
public static	void	main(String[] args) {
	Scanner sc=new Scanner(System.in);
	FindAvegAge obj=new FindAvegAge();
	int size=sc.nextInt();
	int [] age=new int[size];
	System.out.println("Enter the age of "+size+" employee");
	if(size>1) {
	for (int i=0;i<size;i++) {
		age[i]=sc.nextInt();
	}
	System.out.println("The Average Age is "+obj.calculateAverage(age));
	}
	else {
		System.out.println("Invalid output");
		}
	
	
}
}