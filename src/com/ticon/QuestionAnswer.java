package com.ticon;

public class QuestionAnswer {

	public static void main(String[] args) {
		// how to convert integer to string
		Integer num = 2021;
		System.out.println(num+ " Type of variable "+num.getClass().getName());
		String str = num.toString();
		System.out.println(num.toString()+" Type of variable now "+str.getClass().getName());
		
		System.out.println("String"+8+8);  //String88
		System.out.println(8+8+"String");  //16String
		
		//reverse 2021, which is an array
		System.out.println("===========reverse 2021=============");
		int[] intArr = {3,0,2,1};
		int len = intArr.length;
		for (int i = len-1; i>=0; i--) {
			System.out.print(intArr[i]);
		}
		
		//fibonancy series first ten
		System.out.println("===========fibonancy series=============");
		int temp1=0,temp2=1,result=0;
		System.out.print(temp1+","+temp2);
		for (int i = 0; i < 10; i++) {
			result = temp1+temp2;
			temp1 = temp2;
			temp2 = result;
			System.out.print(","+result);
		}
		
		//

	}

}
