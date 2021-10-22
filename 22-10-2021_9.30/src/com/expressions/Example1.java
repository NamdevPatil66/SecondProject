package com.expressions;

public class Example1 {

	public static void main(String[] args) {


		int result = 0;
		
		int a1 = 30, b2 = 36, c2 = 300;
		
		result = a1 + c2++ - b2;
		
		/*
			from the above instruction line number: 12
			result = a1 + c2++ - b2; it is an expression
			result, a1, b2 and c2 are operands
			=, +, ++ and - are operators*/
		
		System.out.println(result);		

	}

}
