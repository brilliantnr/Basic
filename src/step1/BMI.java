package step1;
import java.util.Scanner;
/**
BMI = 몸무게 / 키² 로서, 
여기서 몸무게는 kg, 키는 m 단위이다. 
예를 들자면, 
몸무게 55kg에 키 1.68m인 사람의 BMI는 
55kg/(1.68m)^2 = 19.4이다.
2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 
18.5 미만이면 저체중, 
18.5∼23은 정상, 
23~25이면 '비만 전단계'[5], 
25∼30은 '1단계 비만', 
30∼35는 '2단계 비만' , 
35 이상이면 '3단계 비만'으로 구분한다.
 * */ 
public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("0.종료 1.실행");
			int flag = s.nextInt();
		
			switch(flag){
				case 0 :
					System.out.println("종료합니다");
					return;
				case 1 :
					System.out.println("실행합니다");
					break;
				default: break;
			}
		
		System.out.println("키(cm)를 입력하시오");
		double h = s.nextDouble();		
		System.out.println("몸무게(kg)를 입력하시오");
		double w = s.nextDouble();
 
		double bmi = w/(h*h/10000) ;

		String result = "";
		if(bmi<18.5){
			result = "저체중";
		}else if(bmi>=18.5 && bmi<23){
			result = "정상";
		}else if(bmi>=23 && bmi<25){
			result = "비만 전단계";
		}else if(bmi>=25 && bmi<30){
			result = "1단계 비만";
		}else if(bmi>=30 && bmi<35){
			result = "2단계 비만";
		}else{
			result = "3단계 비만";
		}
		System.out.println("당신의 BMI는 "+bmi +"입니다.\n 그 결과 "+ result+" 입니다.");
		}
	}
}
