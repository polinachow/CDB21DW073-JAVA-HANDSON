package operators;

public class operators {
	void Arthmetic()
	{
		int a=10,b=90,c;
		c=a+b;
		System.out.println("Arthmetic");
		System.out.print(c+"\t");
		c=a-b;
		System.out.print(c +"\t");
		c=a/b;
		System.out.print(c+"\t");
		c=a*b;
		System.out.print(c+"\t");
		c=a%b;
		System.out.println(c+"\t");
		
	}
	void Assignment() {
		int a=6,b=8,c=2;
		a+=c;
		System.out.println("Assignment");
		System.out.print(a+"\t");
		b-=a;
		System.out.print(b+"\t");
		b*=a;
		System.out.print(b+"\t");
		a/=c;
		System.out.print(a+'\n');
		b&=c;
		System.out.print(a+"\t");
		a^=b;
		System.out.print(a+"\t");
		b|=c;
		System.out.print(b+"\t");
		a<<=c;
		System.out.print(a+"\t");
		c>>>=b;
		System.out.println(c+"\t");
	}
	void Comparison() {
		int a=45,b=45;
		System.out.println("Comparison");
		if (a>b) {
			System.out.print(a+"\t");
		}
		else if(a<b) {
			System.out.print(b+"\t");
		}
		else if(a==b) {
			System.out.println("both are  equal");
		}
		else if(a!=b) {
			System.out.println("both are not equal");
		}
		else if(a>=0) {
			System.out.println("positive number");
		}
		else if(a<=-1) {
			System.out.println("non-positive number");
		}
		
		
	}
	
	void Logical() {
		int a=12,b=89;
	        System.out.print("Logical   ");
		if(a>=0 && b>=0 || b<=0) {
			System.out.println("condition true");
		}
	}
	void Bitwise() {
		int a=10,b=5,c=20;
		System.out.println("Bitwise");
		System.out.println(a<b&a<c);
		System.out.println(a>b|a<c);
	}
	public static void main(String[] args) {
		operators ar=new operators();
		ar.Arthmetic();
		ar.Assignment();
		ar.Comparison();
		ar.Logical();
		ar.Bitwise();
	}
}
