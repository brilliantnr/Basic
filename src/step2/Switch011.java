package step2;
/**
 * [수열011] 
 * 1-2+3-4+5-6.....-100=-50 합계(스캐너 없음)
 * */
import java.util.Scanner;
public class Switch011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result ="";
		int sum = 0;	
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : return;
			case 1 : 
			
				for(int i=0; i<=100;i++) {
					if(i%2 ==1) {
						sum -=i;
						result += i+"-";
					}else if(i==100){
						result += i+"=";
					}else {
						sum +=i;
						result += i+"+";
					}
				}
				break;
			}
			System.out.println(result+sum);
			
		}		
	}
}
