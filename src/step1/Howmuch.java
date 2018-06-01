package step1;
/**
 * "얼마에요?
100
100원 입니다.
몇개 드릴까요?
5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
int dc = total / 10;
total = total - dc;
그럼 450원만 주세요"
*/

import java.util.Scanner;
public class Howmuch {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : System.out.println("종료합니다"); return;
			case 1 : 
				System.out.println("얼마에요?");
				
				int n1 = sc.nextInt();
				System.out.println(n1+"원입니다");
				System.out.println("몇개 드릴까요");

				int n2 = sc.nextInt();
				System.out.println(n2+"개 주세요");

				int n3 = n1 * n2;
				System.out.println("총 금액은 "+n3 +"원 입니다.");
				System.out.println("비싸요 깎아주세요");
				System.out.println("몇 퍼센트 DC 할까요?");	

				int n4 = sc.nextInt();
				String result = "안 팔아요."; 
				if(n4 < 10){
					result = n3*(100-n4)/100 + "원 입니다";
				}
				System.out.println(result);
				break;				
			}
		}
	}
}