package step3;
/*몇전 몇패*
 * */

import javax.swing.JOptionPane;

public class RPSGameRandom {
	public static void main(String[] args) {

		while (true) {
			switch (JOptionPane.showInputDialog("컴퓨터와의 가위바위보게임을 실행합니다. 0-결과보기. 1-실행")) {
			case "0":
				JOptionPane.showMessageDialog(null, "이김");
				return;
			case "1":
				int time = Integer.valueOf(JOptionPane.showInputDialog("몇 판 하시겠습니까?"));
				int user = 0; 
				int ran =0;
				int count = 0;
				for (int i = 0; i < time; i++) {
					user = Integer.valueOf(JOptionPane.showInputDialog(" 가위1,바위2,보3 입력하시오"));
				ran =(int)((Math.random())*10%3)+1 ;
					switch (user - ran) {
					case 0:
						JOptionPane.showMessageDialog(null, "DRAW");
						break;
					case 1:case -2:
						JOptionPane.showMessageDialog(null, "WIN");
						count ++;
						break;
					case -1:case 2:
						JOptionPane.showMessageDialog(null, "LOSE");
						break;
					}
				}
				JOptionPane.showMessageDialog(null, time+"판 "+count +"승");
			}
		}
	}
}