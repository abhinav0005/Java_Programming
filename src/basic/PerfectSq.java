package basic;

import java.time.chrono.IsoChronology;

public class PerfectSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=49;
		isPerfect(input);
	}
	public static void isPerfect(int x) {
		int r=(int) Math.sqrt(x);
		int out= r*r;
		if(out==x) {
			System.out.println(x+" is a perfect squire");
		}else
			System.out.println(x+" is not a perfect squire");
	}

}
