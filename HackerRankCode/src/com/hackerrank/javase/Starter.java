package com.hackerrank.javase;

import com.hackerrank.javase.commonutil.DataUtil;
import com.hackerrank.javase.streamutilfunctions.StreamUtil;

public class Starter {

	public static void main(String[] args) {
		Starter starter = new Starter();
		starter.playWithStreams();

	}

	private void playWithStreams() {
		StreamUtil.useMultiSort(DataUtil.getListOfStudents());
		
	}

}
