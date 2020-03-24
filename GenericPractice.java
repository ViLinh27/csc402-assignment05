package assignment5;
//Linh Nguyen
import java.util.Random;

import algs4.StdOut;

import java.util.Arrays;

public class GenericPractice {

	public static void main(String[] args) {
		Integer[] rnumArr = new Integer[100];
		Integer[] nArr = fillIntArrayRandom(rnumArr);
		//StdOut.println("Array: "+Arrays.toString(nArr));//see what array looks like//sanity check
		Integer fmax = maxGenIter(nArr);
		StdOut.println("Max is: "+fmax);
		
		Integer smax = maxGenRec(nArr);
		StdOut.println("Second method max:"+smax);
	}
	
	public static Integer[] fillIntArrayRandom(Integer[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt();
		}
		return a;
	}
	
	public static <T extends Comparable <T>> T maxGenIter(T[] a) {
		/* This will be a generic method that uses an iterative approach to 
		 * finding the maximum value in an array of int values. See below for a non-generic version of this method. */
		T max = a[0];
		for(int i = 0;i<a.length;i++) {
			for(int j = i;j<a.length;j++) {
				if(a[j].compareTo(max)>0) {
					max=a[i];
				}
			}
		}
		return max;
	}
	
	public static <T extends Comparable <T>> T maxGenRec(T[] a) {
		//Another generic method, this calls the next method.
		int l =0;
		int r = a.length-1;
		
		T m3 = maxGenRec(a, l, r);
		return m3;
	}
	
	public static <T extends Comparable <T>> T maxGenRec(T[] a, int left, int right) {
		if(left == right) {
			return a[left];
		}
		int middle = (left+right)/2;
		T leftmax = maxGenRec(a,left,middle);
		T rightmax = maxGenRec(a,middle+1,right);
		if(leftmax.compareTo(rightmax)>0) {
			return leftmax;
		}
		return rightmax;
	}

}
