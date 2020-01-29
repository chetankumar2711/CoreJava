/**
 * 
 */
package com.hackerrank.javase.streamutilfunctions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

}
