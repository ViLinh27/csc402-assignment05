package assignment5;

import algs4.StdOut;

import java.util.Arrays;
import java.util.Random;

//Linh Nguyen
public class Inversions {

	public static void main(String[] args) {
		Random r = new Random();
		int[] rnumArr = new int[1000];
		for(int i = 0;i<rnumArr.length;i++) {
			rnumArr[i] = r.nextInt();
		}
		//StdOut.println("unsorted array: "+ Arrays.toString(rnumArr));///sanity check
		int inumArr = inversion(rnumArr);
		StdOut.println("unsorted count: "+inumArr);
		Arrays.sort(rnumArr);
		int sortedArr = inversion(rnumArr);
		StdOut.println("sorted count: "+sortedArr);
		
	}
	public static int inversion(int[] arr) {
		int count = 0;
		for(int i = 0;i<(arr.length)-1; i++) {
			for(int j = i+ 1; j<(arr.length)-1;j++) {
				if(arr[i]> arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
