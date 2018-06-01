package step2;
import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("가위바위보게임을 실행합니다. 0-종료. 1-실행");
		switch(sc.nextInt()) {
		case 0 : System.out.println("종료합니다."); return;
		case 1 : System.out.println("진행합니다."); 
			break;
		}
		System.out.println("A - R,P,S.");
		String a = sc.next();
		System.out.println("B - R,P,S.");
		String b = sc.next();

		String result = "";
		if(a.equals(b)){
			result = "DRAW";
		}else if(
			(a.equals("R") && b.equals("S"))
				||
			(a.equals("P") && b.equals("R"))
				||
			(a.equals("S") && b.equals("P"))
			){
			result = "A WIN";
		}else{
			result = "B WIN";
		}
		
		System.out.println(result);	
	}
	}
}