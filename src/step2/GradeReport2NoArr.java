package step2;
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
//
/**split 쓰기*/


import java.util.Scanner;
public class GradeReport2NoArr {
	public static String input(Scanner sc) {
		String result = "";
		
		int k=0, e=0, m=0;
			System.out.print("국어점수, 영어점수, 수학점수 순으로 입력하라");
			result=s.next().split(",") ;
		
		
		
			System.out.print("국어점수?\n");
			k = sc.nextInt();	
			System.out.print("영어점수?\n");
			e = sc.nextInt();		
			System.out.print("수학점수?\n");
			m = sc.nextInt();
		result[0] = k;
		result[1] = e;
		result[2] = m;
		return result;
	}
	public static void grade(Scanner sc) {
		
		int k=0, e=0, m=0, avg=0, total=0;
		int [] arr = input(sc);
		k=arr[0];
		e=arr[1];
		m=arr[2];
		
		total = k+e+m;
		avg = total/3;
		
		String gr = "";
		String[] grade = new String[5];
		
		
		grade[0]="A";
		grade[1]="B";
		grade[2]="C";
		grade[3]="D";
		grade[4]="E";
		return grade;
		
		switch((avg/10)){
			case 9 : grade = "A";break;
			case 8 : grade = "B";break;
			case 7 : grade = "C";break;
			case 6 : grade = "D";break;
			default : grade = "F";break;
		}		
		
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : System.out.println("종료합니다"); return;
			case 1 : System.out.println("실행합니다"); 
				System.out.println("이름?");
				String name="";
				name = sc.next();
				
				
				
				
				
				int avg=0, total=0;
				System.out.printf("******************************** \n"+"| 이름 | 총점 | 평균 | 등급 |\n");
				System.out.printf("| "+name+" | "+total+" | "+avg+" | "+grade+" |\n");	
				System.out.printf("| %s | %d | %d | %s |\n", name,total,avg,grade);
				System.out.println("******************************** \n");
				System.out.println("" );	
			break;
			default : System.out.println("ERROR");break;
			}
		}
	}
}