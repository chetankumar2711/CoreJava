package com.hackerrank.javase;

import org.junit.platform.commons.util.ReflectionUtils;

import com.hackerrank.javase.commonutil.MathUtil;
import com.hackerrank.javase.commonutil.ReflectionUtil;
import com.hackerrank.javase.commonutil.ThreadUtil;
import com.hackerrank.javase.entity.ReflectionTestEntity;

public class Starter {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		
		Starter starter = new Starter();
		starter.playWithStreams();

	}

	private void playWithStreams() {
		//MathUtil.printFibonacciSeries(10);
		//ThreadUtil.demoMultiThreads("callable");
		try {
			ReflectionUtil.showReflectionDemo(new ReflectionTestEntity());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

}
