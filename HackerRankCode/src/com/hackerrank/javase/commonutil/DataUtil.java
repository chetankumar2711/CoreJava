package com.hackerrank.javase.commonutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.hackerrank.javase.entity.Student;

public class DataUtil {
	
	public static List<Student> getListOfStudents(){
		List<Student> studentsList = new ArrayList<>();
		studentsList = Arrays.asList(new Student(2, 3.8, "yaha"),
				new Student(4, 3.2, "pant"),
				new Student(7, 3.5, "kirit"),
				new Student(9, 4.0, "agarkar")
				).stream().collect(Collectors.toList());
		return studentsList;
		

	}

}
