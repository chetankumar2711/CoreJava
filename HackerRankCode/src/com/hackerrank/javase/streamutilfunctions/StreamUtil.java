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
	 * @param listOfStudents
	 */
	public static void useMultiSort(List<Student> listOfStudents) {
		Comparator<Student> multiComparator = Comparator.comparingDouble(Student::getCgpa)
				.thenComparing(Student::getLastName).thenComparingInt(Student::getId);
		listOfStudents = listOfStudents.stream().sorted(multiComparator).collect(Collectors.toList());
		listOfStudents.forEach(s->System.out.println(s.getLastName()));
		
	}

}
