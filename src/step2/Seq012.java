package step2;

import java.util.Scanner;
/**
[수열012] 홀수짝수의 합계
* */
public class Seq012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = "";
        
            System.out.println("0.종료 1.홀수의 합 2.짝수의 합");
            switch (sc.nextInt()) {
            case 0:
                return;
            case 1:
				System.out.println("시작값을 입력하시오.");
				int num1 = sc.nextInt();
				System.out.println("끝값을 입력하시오");
				int num2 = sc.nextInt();

				int start = 0, end = 0, sum = 0, 
						count = 0, totalCount = 0;
				if (num1 > num2) {
					start = num2;
					end = num1;
				} else {
					start = num1;
					end = num2;
				}

				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
						if (count == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
            case 2:
                System.out.println("시작값을 입력하시오.");
                int first = sc.nextInt();
                System.out.println("끝값을 입력하시오");
                int second = sc.nextInt();
                break;
            default:
                return;
            }
        }
    }
}