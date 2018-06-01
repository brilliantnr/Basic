package step2;
/**
 [수열012] 홀수짝수의 합계
 * */
 
import java.util.Scanner;

public class EvenOddSum012 {
	public static void input(Scanner sc) {   //중복부분   모듈화=refactoring
		int sum = 0;
		int num1 = 0, num2 = 0;
		int start = 0, end = 0;
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
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String result = "";
		

		while (true) {
			System.out.println("0.종료  1.홀수의 합  2.짝수의 합");
			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				input(sc);
				int sum = 0;
				int num1 = 0, num2 = 0;
				int start = 0, end = 0;

				int count = 0, totalcount = 0;
		
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
					}
				}

				totalcount = count;
				count = 0;   //리셋됨
				
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						count++;   //여기줘야함 으악
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
