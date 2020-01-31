/**
 * 
 */
package com.hackerrank.javase.streamutilfunctions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hackerrank.javase.entity.Student;

/**
 * @author cheta
 *
 */
public class StreamUtil {

	/**
	 * Compare by cgpa in descending order i.e., top to bottom
	 * if cgpa ties, break by names in ascending order
	 * ig both cgpa and names tie, break by id in ascending order
	 * @param listOfStudents
	 * @return 
	 */
	public static List<Student> useMultiSort(List<Student> listOfStudents) {
		Comparator<Student> multiComparator = Comparator.comparingDouble(Student::getCgpa).reversed()
				.thenComparing(Student::getLastName).thenComparingInt(Student::getId);
		return listOfStudents.stream().sorted(multiComparator).collect(Collectors.toList());
		
	}

	/**
	 * @param num
	 * @return
	 */
	public static boolean checkPalindrome(int num) {
		String numeric = new Integer(num).toString();
		String firstHalf = "";
		String secondHalf = "";
		;
		int length = numeric.length();
		//System.out.println("length is " + length);
		if (numeric.length() % 2 == 0) {
			firstHalf = numeric.substring(0, length / 2);
			secondHalf = numeric.substring((length / 2), length);
			//System.out.println("first half is " + firstHalf + " and second half is " + secondHalf);
			secondHalf= reverse(secondHalf);
			
		} else if (numeric.length() == 1) {
			return false;
		} else {
			firstHalf = numeric.substring(0, length / 2);
			secondHalf = numeric.substring((length / 2) + 1, length);
			//System.out.println("first half is " + firstHalf + " and second half is " + secondHalf);
			secondHalf = Stream.of(secondHalf.split("")).reduce((a, b) -> b.concat(a)).orElseGet(String::new);
			secondHalf= reverse(secondHalf);
		}
		if (firstHalf.equals(secondHalf))
			return true;
		else
			return false;

	}
	
	private static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

}
