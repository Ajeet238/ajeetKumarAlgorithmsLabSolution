package lab2AlgorithmsLabSolution;
 
import java.util.Arrays;

import java.util.Scanner;

public class MinimumNoOfNotes {
	static void noOfNotes(int[] arr, int amountToPay) {
		Arrays.sort(arr);
		int l = arr.length;
		for (int i = l - 1; i >= 0; i--) {
			if (amountToPay == 0) {
				break;
			}
			if (amountToPay >= arr[i]) {
				int temp = amountToPay / arr[i];
				System.out.println(arr[i] + ": " + temp);
				amountToPay = amountToPay % arr[i];
			} else {
				continue;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int arrSize = sc.nextInt();
		System.out.println("Enter the  currency denominations value");
		int arr[] = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the  amount you want to pay");
		int amountToPay = sc.nextInt();
		noOfNotes(arr, amountToPay);
	}

}
