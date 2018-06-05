package step3;
/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)*/

import javax.swing.JOptionPane;

public class Calc2 {
	public static void main(String[] args) {

		String result = "";
		String num1 = JOptionPane.showInputDialog("Enter Number");
		int sum= Integer.valueOf(num1);
		String num2 = "";
		while (true) {
			String op = JOptionPane.showInputDialog("OPCODE");
			
				switch (op) {
				case "+":
					num2 = JOptionPane.showInputDialog("Enter Number");
					sum += Integer.valueOf(num2);
						result+=op+num2;
						break;
				case "-":
					num2 = JOptionPane.showInputDialog("Enter Number");
					sum -= Integer.valueOf(num2);
						result+=op+num2;
						break;
				case "*":
					num2 = JOptionPane.showInputDialog("Enter Number");
					sum *= Integer.valueOf(num2);
						result+=op+num2;
						break;
				case "/":
					num2 = JOptionPane.showInputDialog("Enter Number");
					sum /= Integer.valueOf(num2);
						result+=op+num2;
						break;
				case "%":
					num2 = JOptionPane.showInputDialog("Enter Number");
					sum %= Integer.valueOf(num2);
						result+=op+num2;
						break;
				case "=":
					JOptionPane.showMessageDialog(null, num1+result+"="+sum);
					return;
				default:
					result= "ERROR";
					break;
			}
			
		}
	}
}