package step2;

import java.util.Scanner;

public class GradeReportIng {
	public static int[] input(Scanner scan) {
		int[] arr = new int[3];
		
		int kor = 0, eng = 0, math = 0;
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();
		
		arr[0] = kor ;
		arr[1] = eng ;
		arr[2] = math ;
		
		return arr ;
	}
	public static String[] getGrade(Scanner scan){
		int[] arr2 = input(scan) ;
		String[] result = new String[3];
		result[0] = String.valueOf(arr2[0] + arr2[1] + arr2[2]);
		result[1] = String.valueOf(Integer.parseInt(result[0])/3);
	    switch(Integer.parseInt(result[1])/10){
            case 9: result[2]="A"; break;
            case 8: result[2]="B"; break;
            case 7: result[2]="C"; break;
            case 6: result[2]="D"; break;
            case 5: result[2]="E"; break;
            default : result[2]="F"; break;
        }
	    return result;
	}
	public static void main(String[] args) {
		String[] params = new Sc(System.in);
		String name = "";  
		int kor = 0, eng = 0, math = 0, avg = 0, total = 0 ;
		String grade="";
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		name = scan.next();
		String[] arr = getGrade(scan);
		System.out.printf("************************************\n");
		System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
		System.out.printf("-------------------------------------");
		System.out.printf("| %s | %s | %s | %s |\n",
				name,arr[0],arr[1],arr[2]);
		System.out.print("************************************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}