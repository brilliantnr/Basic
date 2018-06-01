package step1;
/**[요구사항] 평균 점수에 따라 A ~ F 까지 등급을 부여하는
프로그램을 작성해 주시오.
100 ~ 90 A
89 ~ 80 B
79 ~ 70 C
69 ~ 60 D
59 ~ 50 E
49 ~ 0 F
화면 출력은 다음과 같습니다.
********************************
| 이름 | 총점 | 평균 등급 |
--------------------------------
| 홍길동 | 270 | 90 | A |*/

import java.util.Scanner;
public class GradeReport {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : System.out.println("종료합니다"); return;
			case 1 : System.out.println("실행합니다"); 
				
				System.out.println("이름?");
				String name = sc.next();
	
				System.out.print("국어점수?\n");
				int k = sc.nextInt();	
				if ( k<0 || k>100){
					return ;
				}
				System.out.print("영어점수?\n");
				int e = sc.nextInt();		
				if ( e<0 || e>100){
					return ;
				}		
				System.out.print("수학점수?\n");
				int m = sc.nextInt();
				if ( m<0 || m>100){
					return ;
				}
				
				String grade = "";
				int ever = (k+e+m)/30;
				switch(ever){
					case 9 : grade = "A";break;
					case 8 : grade = "B";break;
					case 7 : grade = "C";break;
					case 6 : grade = "D";break;
					default : grade = "F";break;
				}
				System.out.println(name+"[평균] " + (k+e+m)/3 +" [학점] " + grade );	
			break;
			default : System.out.println("ERROR");break;
			}
		}
	}
}
