package array;

import java.util.Arrays;

public class FirstLastPosition {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,4,4,3,1,6,7,8,8};
		System.out.println(Arrays.toString(arr));
		findPostion(arr, 8);
		
	}
	public static void findPostion(int[] num,int input) {
		int len= num.length;
		int first=-1,last=-1;
		for(int i=0;i<len;i++) {
			if(num[i]==input) {
				first=i;
				break;
			}
		}
		for(int i=len-1;i>=0;i--) {
			if(num[i]==input) {
				last=i;
				break;
			}
		}
		System.out.println("First and last position for "+input+" is: "+first +" and "+last);
	}
}
