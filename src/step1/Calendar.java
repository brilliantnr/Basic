package step1;
import java.util.Scanner;
public class Calendar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("해당 월의 마지막 날을 알려드립니다. \n 월을 입력하시오");
		int month = sc.nextInt();
		int end = 1;

		switch(month){
			case 2 : end = 28 ; break;
			case 4 : end = 30 ; break;
			case 6 : end = 30 ; break;
			case 9 : end = 30 ; break;
			case 11 : end = 30 ; break;
			default: end = 31 ; break;
		}

		System.out.println(month+"월 "+end+"일 입니다.");

	}
}