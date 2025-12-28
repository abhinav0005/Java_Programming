package array;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,2,7,84,9,6,9,1,0,84};
		int len= arr.length;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=len-1;i>0;i--) {
			if(arr[i-1]!=arr[i]) {
				System.out.println("Second largest no is: "+ arr[i-1]);
				break;
			}
		}
	}
}
