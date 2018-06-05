package step3;
/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)*/

import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {
		String result1 = "";
		String num1 = JOptionPane.showInputDialog("Enter Number1");
		int result2 = Integer.valueOf(num1);
		String num2 = "";
		while (true) {
			switch (JOptionPane.showInputDialog("OPCODE")) {
			case "=":
				result1 += "=";
				JOptionPane.showMessageDialog(null, num1+result1+result2);
				return;
			case "+":
				num2=JOptionPane.showInputDialog("Enter Number2");
				result1 += "+"+ num2;
				result2 += Integer.valueOf(num2);
				break;
			case "-":
				num2=JOptionPane.showInputDialog("Enter Number2");
				result1 += "-"+ num2;
				result2 -= Integer.valueOf(num2);
				break;
			case "*":
				num2=JOptionPane.showInputDialog("Enter Number2");
				result1 += "*"+ num2; 
				result2 *= Integer.valueOf(num2);
				break;
			case "/":
				num2=JOptionPane.showInputDialog("Enter Number2");
				result1 += "/"+ num2;
				result2 /= Integer.valueOf(num2);
				break;
			case "%":
				num2=JOptionPane.showInputDialog("Enter Number2");
				result1 += "%"+ num2;
				result2 %= Integer.valueOf(num2);
				break;
			default:
				result1 = "ERROR";
				break;
			}
		}
	}
}