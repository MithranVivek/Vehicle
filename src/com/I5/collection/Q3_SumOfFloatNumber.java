package com.I5.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3_SumOfFloatNumber {

	public static void main(String[] args) {

		float[] b = { 100.0f, 127.2f, 500.0f, 23.0f };

		List<Float> a = new ArrayList<>();
		for (Float x : b) {
			a.add(x);
		}
		Integer sum = a.stream().collect(Collectors.summingInt(Float::intValue));
		System.out.println(sum);
	}

}
