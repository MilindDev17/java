import java.util.*;
import java.util.Scanner;

public class Ksmallest {
	static int info(int[] arr1, int[] arr2 , int n) {
		int Count = 0;
			for(int i = 0;i<arr1.length;i++) {
				for(int j = 0 ; j<arr2.length;j++) {
					if(i<n) {
						if(arr1[i] == arr2[j]) {
							Count++;
							System.out.println(Count);
						}
					}
				}
			}
			return Count;
		
} 
	
	public static void main(String args[]) {
		Scanner sc=  new Scanner(System.in);
		
		int k = sc.nextInt();
		int[] arr1 = new int[k];
		int[] arr2 = new int[k];
		
		for(int i = 0; i < arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		info(arr1,arr2,k);
		}}
