package step2;
/**
 *  [수열010]
 기사 시험 출제 문제 :[수열1] 1~100까지 합계
 변형된 요구사항
 정수를 입력받아 두 수 사이의 합을 구하는 
 프로그램을 구현하시오
 출력:  1+2+...+10=55
 * */
 
import java.util.Scanner;
public class Seq010Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start=0; 
		int end=0;
		int sum=0;
		String result ="";
		
		while(true) {
			System.out.println("0.종료 1.실행");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료합니다");
				return;
			case 1:
				System.out.println("첫번째 숫자를 입력하시오");
				int a = sc.nextInt();
				System.out.println("두번째 숫자를 입력하시오");
				int b = sc.nextInt();

				/*
				 * if (a < b) { 
				 * start =a; end =b; 
				 * } else { end=a; start=b; }
				 */

				start = (a < b) ? a : b;
				end = (a < b) ? b : a;

				for (int i = start; i <= end; i++) {
					/*
					 * if (i == end) { 
					 * result += i + "="; 
					 * } else { result += i + "+"; }
					 */
					result += (i == end) ? i + "=" : i + "+";
					sum += i;
				}
				System.out.println(result + sum);
				break;
			default:
				System.out.println("ERROR");
			}
			
		}
	}
}
