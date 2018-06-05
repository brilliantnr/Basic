package step3;
/*몇전 몇패*
 * */

import javax.swing.JOptionPane;

public class RPSGame {
	public static void main(String[] args) {

		while (true) {
			switch (JOptionPane.showInputDialog("가위바위보게임을 실행합니다. 0-결과보기. 1-실행")) {
			case "0":
				JOptionPane.showMessageDialog(null, "이김");
				return;
			case "1":
				int a = Integer.valueOf(JOptionPane.showInputDialog("A :가위1,바위2,보3 입력하시오"));
				int b = Integer.valueOf(JOptionPane.showInputDialog("B :가위1,바위2,보3 입력하시오"));
				switch (a - b) {
				case 0:
					JOptionPane.showMessageDialog(null, "비김");break;
				case 1:
					JOptionPane.showMessageDialog(null, "A이김");break;
				case -2:
					JOptionPane.showMessageDialog(null, "A이김");break;
				case -1:
					JOptionPane.showMessageDialog(null, "B이김");break;
				case 2:
					JOptionPane.showMessageDialog(null, "B이김");break;
				}
			}
		}
	}
}