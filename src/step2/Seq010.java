package step2;

import java.util.Scanner;

/**
* 기사시험문제: [수열010]
* 1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을
* 구현하시오 출력 : 1+2+3+...+10=55 
*/
public class Seq010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("0종료 1실행");
            switch (s.nextInt()) {
            case 0:
                return;
            case 1:
                System.out.println("시작값?");
                int num1 = s.nextInt();
                System.out.println("끝값?");
                int num2 = s.nextInt();
                int start = 0;
                int end = 0;
                int sum = 0;
                String result = "";
                if(num1 > num2){
                    end = num1;
                    start = num2;
                }else{
                    end = num2;
                    start = num1;
                }
                for(int i=start;i<=end;i++){
                    /*if(i==end){
                        result += i+"=";
                    }else{
                        result += i+"+";
                    }*/
                    result += (i==end)?i+"=":i+"+";
                    sum += i;
                }
                System.out.println(result+sum);
                break;
            default:
                return;
            }

        }
    }
}