package step2;

/**
[수열013]
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
* */

import java.util.Scanner;
public class Seq013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result ="";
		while(true) {
			System.out.println("0.종료 1.입력");
			int sum=0;
			int d=0;
			switch(sc.nextInt()) {
			
			case 0: return;
			case 1: 
				
				for(int i=0;i<=20;i++) {
					d+=1+i;
											
					if(i==20) {
						sum+=d+i;
						result += i+d+"=";
					}else {
						sum+=d+i;
						result += i+d+"+";
					}
				}
				break;
			default : return;
			}
			
			System.out.println(result+sum);
		}
	}
}
