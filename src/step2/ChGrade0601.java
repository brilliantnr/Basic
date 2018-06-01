package step2;

import java.util.Scanner;

public class ChGrade0601 {
	public static boolean input(int score) {
		/*if (score>=0 && score<=100) {
			flag = true;
		}else {
			flag = false;
		}
		*/
		
		return (score>=0 && score<=100);
	} 
	
	
	public static String[] getTotal(String[] score) {
		String[] result = new String[3];
		result[0]= String.valueOf(Integer.parseInt(score[0])+
				Integer.parseInt(score[1])+
				Integer.parseInt(score[2]));
		result[1]= String.valueOf(Integer.parseInt(result[0])/3) ;
		return result;
	}
	
	public static String[] getGrade(String[] score) {
		String[] result= new String[3];
		result[0] = score[0]; 
		result[1] = score[1];
		
		switch(Integer.parseInt(result[1])/10){
			case 9 : result[2] = "A";break;
			case 8 : result[2] = "B";break;
			case 7 : result[2] = "C";break;
			case 6 : result[2] = "D";break;
			default : result[2] = "F";break;
		}
		return result;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : System.out.println("종료합니다"); return;
			case 1 : System.out.println("실행합니다"); 
				
				System.out.println("이름?");
				String name = sc.next();
	
			String[] sub= {"국어","영어","수학"};
			String[] score = new String[3];
			
			for(int i=0;i<sub.length;i++) {
				System.out.print(sub[i]+"점수?\n");
				int temp=Integer.parseInt(sc.next());
				if (input(temp)) {
					score [i]=String.valueOf(temp);
				}else {
					i--;
				}
			}
				
				String[] arr = getGrade(getTotal(score));
				
				System.out.printf("************************************\n");
				System.out.printf("| 이름 |  총점  |  평균  | 등급 |\n");
				System.out.printf("-------------------------------------\n");
				System.out.printf("| %s | %s | %s | %s |\n",
						name,arr[0],arr[1],arr[2]);
				System.out.print("************************************\n");	
			break;
			default : System.out.println("ERROR");break;
			}
		}
	}
}
