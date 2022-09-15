package com.java8.lambda.expression.assignment;

	import java.util.Arrays;
	import java.util.List;

	public class Problem4StringIntoAnotherString4 {

	public static void main(String[] args) {


	List<String> list = Arrays.asList("Prashant", "Phalke");


	StringBuilder sb = new StringBuilder();
	list.forEach(sb::append);
	// System.out.println(sb);
	System.out.println(sb.insert(2, ""));
	// String con = sb.toString();


	System.out.println(sb);
	}


	}
	
