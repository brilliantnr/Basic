package step1;
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하시오");

		int year = sc.nextInt();
		char p1 = year.char();
		
		String result = "";

		if(year%4==0){
			result = "윤년";
		}else if(p1=='00'){
			result = "평년";
		}
		System.out.println(result);
	}
}
