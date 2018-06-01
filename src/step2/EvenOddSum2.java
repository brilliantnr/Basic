package step2;
/**
 1부터 10까지 합을 구하시오
 출력은 1+2+...+10=55 입니다.
 
 기사 시험 출제 문제 :[수열012] 홀수짝수의 합
 변형된 요구사항
 정수를 입력받아 두 수 사이의 합을 구하는 
 프로그램을 구현하시오
 출력:  1+2+...+10=55
 * */
 
import java.util.Scanner;

public class EvenOddSum2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String result = "";
		int sum = 0;
		int num1 = 0, num2 = 0;
		int start = 0, end = 0;

		while (true) {
			System.out.println("0.종료  1.홀수의 합  2.짝수의 합");
			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("시작값");
				num1 = sc.nextInt();
				System.out.println("끝값");
				num2 = sc.nextInt();

				if (num1 < num2) {
					start = num1;
					end = num2;
				} else {
					start = num2;
					end = num1;
				}

				int count = 0, totalcount = 0;
		
				for (int i = start; i <= end; i++) {
					if(i%2 != 0 ) {
						count++;
				}
				
				totalcount = count;
				count = 0;   //리셋됨
				
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						count++;   //여기줘야함 으악
						sum += i;   
						if (count == totalcount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
					}
				}

				System.out.println(result + sum);
				break;
			case 2:
				System.out.println("시작값");
				num1 = sc.nextInt();
				System.out.println("끝값");
				num2 = sc.nextInt();

				if (num1 < num2) {
					start = num1;
					end = num2;
				} else {
					start = num2;
					end = num1;
				}

				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						sum += i;
						result += (i == end) ? i + "=" : i + "+";
					}
				}

				System.out.println(result + sum);
				break;
			default : return;
			}
		}
	}
}
