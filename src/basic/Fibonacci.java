package basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=1,sum;
		System.out.print(x+","+y);
		int input=10;
		while(input>0) {
			sum=x+y;
			x=y;
			y=sum;
			System.out.print(","+sum);
			input--;
		}
	}

}
