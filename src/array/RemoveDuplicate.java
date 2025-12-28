package array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,4,4,3,1,6,7,8,8};
		System.out.println(Arrays.toString(arr));
		int len= arr.length;
		for(int i=0;i<len;i++) {
			int count=1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			System.out.println(arr[i]);
		}
	}
}
