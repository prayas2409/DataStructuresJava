
/**	 
 * @author prayas
 * Created on 15 Jan 2018 
 * Version 11.0.1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Utility {
	//// Scanner variable
	static Scanner s = new Scanner(System.in);
	static File f = null;
	static FileWriter fr = null;

	/// function to check the leap year
	static boolean leapYear(int year) {

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			} else
				return false;
		} else if (year % 4 == 0)
			return true;

		else
			return false;
	}

	public static int isInteger() {
		int num = -999;
		while (num == -999) {
			try {
				String input = s.nextLine();
				num = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("Enter the proper number");
				num = -999;
			}
		}
		return num;
	}

	public static int isPositiveInteger() {
		int num = -1;
		while (num <= -1) {
			try {
				String input = s.nextLine();
				num = Integer.parseInt(input);
				if (num > 0) {
					break;
				} else {
					System.out.println("Please enter a positive number");
				}
			} catch (Exception e) {
				System.out.println("Please enter a positive number");
			}
		}
		return num;
	}

	public static int inputPositiveInteger() {
		int num;
		num = Utility.isInteger();
		while (num <= -1) {
			System.out.println("Enter the proper number");
			num = Utility.isInteger();
		}
		return num;
	}

	public static String isString() {

		String temp = s.next();
		String[] ints = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		boolean flag = true;
		do {
			flag = true;
			//// if string contains space
			if (temp.contains(" ")) {
				System.out.println("The string should not contain space please try again");
				temp = s.next();
				flag = false;
				continue;
			}
			//// checks fi there are integer in the string
			for (int i = 0; i < ints.length; i++) {
				if (temp.contains(ints[i])) {
					System.out.println("The string should not contain numbers please try again");
					temp = s.next();
					flag = false;
					break;
				}

			}

		} while (flag == false);

		return temp;
	}

	public static boolean isPrime(int number) {
		int counter;
		for (counter = 2; counter <= (number / 2); counter++) {

			// if counter is not prime
			if (number % counter == 0) {
				return false;
			}
		}
		return true;
	}

	//// sorts character array
	static char[] sortChar(char[] a) {
		int i, j;
		char temp;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

	}

	static void anagrams(String string1, String string2) {

		int i, flag = 0;

		if (string1.length() != string2.length()) {
			System.out.println("Strings are not anagrams");
			return;
		}

		char aS1[] = new char[string1.length()];
		char aS2[] = new char[string2.length()];
		// storing into array to compare each place
		for (i = 0; i < string1.length(); i++) {
			aS1[i] = string1.charAt(i);
		}
		for (i = 0; i < string2.length(); i++) {
			aS2[i] = string2.charAt(i);
		}
		//// sort both to check each element at each index
		aS1 = sortChar(aS1);
		aS2 = sortChar(aS2);
		// System.out.println(aS1);
		// System.out.println(aS2);

		for (i = 0; i < string1.length(); i++) {
			if (aS1[i] != aS2[i]) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Strings " + string1 + " and " + string2 + " are anagrams");

		// else System.out.println("Strings are not anagrams");

	}

	static void BinarySearch(String[] array, String num) {

		int flag, i, length, low, high, mid;
		length = array.length;
		array = bubbleSortString(array, length);
		low = 0;
		high = length - 1;
		for (i = 0; i < length; i++) {

			mid = (low + high) / 2;

			// System.out.println("we are finding at "+mid+" and high = "+high);

			flag = num.compareTo(array[mid]);
			if (flag == 0) {
				System.out.println("string found at position " + (mid + 1));
				return;
			}

			// System.out.println(" "+flag+" when compared "+num+", "+array[mid]);
			if (flag < 0) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		System.out.println("String not found");

	}

	static int[] swipeInt(int array[], int index, int till) {
		int j;
		for (j = index; j >= 1; j--) {
			array[j] = array[j - 1];
		}
		return array;
	}

	static char[] swipeChar(char[] array, int index, int till) {
		int j;
		for (j = index; j >= till + 1; j--) {
			array[j] = array[j - 1];
		}
		return array;
	}

	static String[] swipeString(String array[], int index, int till) {
		int j;
		for (j = index; j >= till + 1; j--) {
			array[j] = array[j - 1];
		}
		return array;
	}

	static int[] bubbleSortInt(int[] array, int length) {

		int i, j, temp;
		for (i = 0; i < length; i++) {
			for (j = 0; j < length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// System.out.println("The sorted array is");
		// for(i=0;i<length;i++) System.out.print(" "+array[i]);
		return array;
	}

	static String[] bubbleSortString(String[] array, int length) {

		int i, j;
		String temp;

		for (i = 0; i < length; i++) {
			for (j = 0; j < length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 1) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
//		System.out.println("The sorted array is");
//		for(i=0;i<length;i++) {
//			System.out.print(" "+array[i]);
//		}
		return array;
	}

	public static int[] toBinary(int num) {

		int count, i = 0, power = 1;

		// calculating the power of 2 just greater than number
		for (; num >= power; i++) {
			power *= 2;
		}

		/*
		 * count will keep track of n in 2^n values store 1,2,4,8 nums store which
		 * number will be used to calculate the number
		 */
		count = i;
		int values[] = new int[i], nums[] = new int[i];
		// storing values 16 8 4 2 in values
		for (i = 0; power > 1; i++) {
			power = power / 2;
			values[i] = power;
		}
		count = i;
		for (i = 0; i < count; i++)
			System.out.print(" " + values[i]);
		System.out.println();
		i = 0;
		while (num > 0) {
			// printing 1 for only those numbers which will be used to calculate number
			// also storing the value 1 for the numbers that are used
			if (num >= values[i]) {
				num = num - values[i];
				nums[i] = 1;
				System.out.print("1");
			} else
				System.out.print("0");
			i++;
		}
		System.out.println();
		count--;
		int nums8bit[] = new int[8];
		for (i = 7; count >= 0; i--) {
			nums8bit[i] = nums[count];
			count--;
		}
		System.out.println("In 8 bits");
		for (i = 0; i < 8; i++)
			System.out.print(nums8bit[i]);
		System.out.println();

		return nums8bit;
	}

	//// check if a number is power of 2
	static int check2Power(int num) {
		int power = 1;
		int flag = 0;
		while (num % 2 == 0) { // num divisible by 2
			if (num % 2 == 0) {
				num = num / 2;
				power++;
			}
			if (num / 2 == 1 && num % 2 == 0) {
				// checking basically for num 2 when 2 comes at last after dividing it is a
				// power of 2
				System.out.println("power is " + power);
				return power;
			}
		}
		return 0;
	}

	static void appendToFile(String path, String str) throws IOException {

		File f = new File(path);
		try {
			fr = new FileWriter(f, true);
			fr.write(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			fr.close();
		}
	}

	static void writeToFile(String path, String str) throws IOException {

		File f = new File(path);
		FileWriter fr = null;
		try {
			fr = new FileWriter(f);
			fr.write(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		fr.close();
	}

	static LinkedListClass Read1LineFile(String path) throws FileNotFoundException {

		File f = new File(path);
		LinkedListClass llc = new LinkedListClass();
		Scanner filescanner = null;
		try {
			filescanner = new Scanner(f);

			while (filescanner.hasNext()) {
				llc.add(filescanner.next());
			}

		} catch (Exception e) {
			System.out.println("The process stopped because " + e);
		}
		filescanner.close();
		return llc;
	}

	static void clearFile(String path) throws IOException {
		writeToFile(path, "");
	}
}