package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,2,7,84,9,6,9,1,0};
		System.out.println(Arrays.toString(arr));
		int [] newArr=  new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			 newArr[i]=arr[arr.length-i-1];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
