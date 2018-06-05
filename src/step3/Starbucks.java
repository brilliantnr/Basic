package step3;
/**결제금액 나오게 하기ㅠㅠ*/
import javax.swing.JOptionPane;

public class Starbucks {

	public static int getTotal(String[] count,int i) {
		int total = 0;
		int[] price = {3000,3500,4000};
		total =price[i] * Integer.parseInt(count[i]);
		return total;
	}

	public static void main(String[] args) {
		String result = ""; 

		while (true) {
			String option = JOptionPane.showInputDialog("0.주문완료 "
									+ " 1.아메리카노3000 \n"
									+ " 2.라떼3500\n" 
									+ " 3.카푸치노4000\n");

			String[] name = { "아메리카노", "라떼", "카푸치노" };
		
			String count="";
			int totalprice =0;
			switch(option) {
			case "0" : JOptionPane.showMessageDialog(null,"주문완료"); return;
			case "1" :  		
			case "2" : 		
			case "3" : 
				count=JOptionPane.showInputDialog("몇 잔?");
				
				
			}
		
			
			result = "총 결제금액은 " +totalprice + "원 입니다.";
			JOptionPane.showMessageDialog(null, result);
		}
		
	}
}
	

