package step1;
/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)*/


import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1");
		int num1 =sc.nextInt();
		System.out.println("OPCODE");
		String op = sc.next();
		System.out.println("Enter Number2");
		int num2 = sc.nextInt();
		 
		int num3 = 0;
		String result ="";

		switch(op){
			case "+":num3 = num1 + num2;break;
			case "-":num3 = num1 - num2;break;
			case "*":num3 = num1 * num2;break;
			case "/":num3 = num1 / num2;break;
			case "%":num3 = num1 % num2;break;
			default : result = "ERROR"; break;
		}
		if(!result.equals("ERROR")){
			result = num1 + op + num2 + "=" + num3;
		}
		System.out.println(result);
	}
}