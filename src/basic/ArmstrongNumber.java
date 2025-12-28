package basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//153 → 3 digits
		//1^3+5^3+3^3=1+125+27=153

		int input=153;
		boolean flag=isArmstrong(input);
		if(flag)
			System.out.println(input+" is a armstrong number");
		else
			System.out.println(input+" is not a armstrong number");
	}
	public static boolean isArmstrong(int x) {
		int sum=0, r,actual=x;
		boolean flag=false;
		while(x>0) {
			r=x%10;
			sum+=r*r*r;
			x=x/10;
		}
		if(sum==actual)
			flag= true;
		return flag;
	}
}
