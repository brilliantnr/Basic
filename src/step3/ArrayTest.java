package step3;

import javax.swing.JOptionPane;

public class ArrayTest {
	public static int getTotal(String[] arrs) {
		int total =Integer.parseInt(arrs[1])+Integer.parseInt(arrs[2])+Integer.parseInt(arrs[3]);
		return total;
	}
	
	public static String getGrade(int avg) {
		String grade = "F";
		switch(avg/10){
		case 10 :grade = "A";break;
		case 9 :grade = "B";break;
		case 8 :grade = "C";break;
		case 7 :grade = "D";break;
		default : grade = "F";break;
		} 
		return grade;
	}
	
	public static void main(String[] args) {
		String[] students = new String[5];
		String[] ranking = new String[5];
		int count =0;
		String student="";
		
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력");
			switch(menu) {
			case "0": ;return;
			
			case "1": 
				String input = JOptionPane.showInputDialog("이름/ 국어/ 영어/ 수학\n");
				String[] arr = input.split("/");
				
				int avg = getTotal(arr)/3;
				String grade = getGrade(avg); 
				student = arr[0]+"|"+arr[1]+"|"+arr[2]+"|"+arr[3]+"|"+getTotal(arr)+"|"+avg+"|"+grade+"|";
				students[count] = student;
				count++;
				break;
				 
			case "2":
//				 | 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 학점|
//				 |홍길동|  100 |  100 |  100 |  300 |  100 |  A  |
//				  arr[0]|arr[1]|arr[2]|arr[3]|
				
				String result = " 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 학점|\n";
				for(int i=0;i<students.length;i++) {
					result += students[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
				
			case "3":
				String[] temp = students[0].split("\\|");
				int a= Integer.parseInt(temp[4]);
				temp = students[1].split("\\|");
				int b= Integer.parseInt(temp[4]);
				temp = students[2].split("\\|");
				int c= Integer.parseInt(temp[4]);
				
				if(a>b && a>c) {
					if(b>c) {//a1 b가 2등, c가 3등	
						ranking[0] = students[0];
						ranking[1] = students[1];
						ranking[2] = students[2];
					}else { //a1,c가 2등 b가3등
						ranking[0] = students[0];
						ranking[1] = students[2];
						ranking[2] = students[1];
					}
				}else if(b>a &&b>c) { 
					if(a>c) {//b1, a2, c3
						ranking[0] = students[1];
						ranking[1] = students[0];
						ranking[2] = students[2];
					}else {//b1, c2, a3
						ranking[0] = students[1];
						ranking[1] = students[2];
						ranking[2] = students[0];
					}
				}else if(c>a&&c>b) {//c1, a2,b3
					if(a>b) {
						ranking[0] = students[2];
						ranking[1] = students[0];
						ranking[2] = students[1];
					}else {//c1, b2,a3
						ranking[0] = students[2];
						ranking[1] = students[1];
						ranking[2] = students[0];
					}		
				}
				 
				JOptionPane.showMessageDialog(null, ranking);
				break;
				}  //switch
				
			
		}
	}
}
