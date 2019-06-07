package com.pranavkapoorr.testing;

import java.util.List;
import java.util.stream.Collectors;

public class ToTest {
	public int add(int number1,int number2) {
		return number1 + number2; 
	}
	public List<Integer> removeDuplicates(List<Integer> myArr) {
		if(myArr==null) {
			return null;
		}
		return myArr.stream().distinct().collect(Collectors.toList());
	}
}
