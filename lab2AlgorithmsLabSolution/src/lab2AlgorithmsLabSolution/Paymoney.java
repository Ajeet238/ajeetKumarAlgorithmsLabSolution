package lab2AlgorithmsLabSolution;

import java.util.*;

public class Paymoney {
	static void targetAchieved(int arr[], int target) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum >= target) {
				System.out.println("Target achieved after :" + (i + 1) + " transaction");
				break;
			}

		}
		if (sum < target) {
			System.out.println("Given target is not achieved ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int arrSize = sc.nextInt();
		System.out.println("Enter the value of array");
		int arr[] = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved5");
		int noOfTarget = sc.nextInt();
		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			targetAchieved(arr, target);

		}

	}

}
