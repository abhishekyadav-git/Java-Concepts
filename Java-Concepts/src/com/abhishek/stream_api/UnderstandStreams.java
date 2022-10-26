package com.abhishek.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnderstandStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2,27,15,19,18,48,49,77,56);
		filterEvenNumsOne(list); // function to show java implementation before java 8
		filterEvenNumsTwo(list); // function to show same implementation as above with stream

	}
	
	public static void filterEvenNumsOne(List<Integer> list) {
		List<Integer> finalList = new ArrayList<>();
		for(Integer i : list) {
			if(i%2==0) {
				finalList.add(i);
			}
		}
		System.out.println(finalList);
	}
	
	public static void filterEvenNumsTwo(List<Integer> list) {
		List<Integer> finalList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(finalList);
	}

}
