package step4;

public class Diamond {
	public static void main(String[] args) {
		int k =0;
		int[][] mtx = new int[5][5];
	
		for(int i=0;i<5;i++) {
			if (i == 0 || i == 4) {
					for (int j = 2; j <= 2; j++) {
						k++;
						mtx[i][j]=k;
					}System.out.println();
				}else if(i==1||i==3) {
					for(int j=1;j<=3;j++) {
						k++;
						mtx[i][j]=k;
				}System.out.println();
				}else {
					for(int j=0;j<=4;j++) {
						k++;
						mtx[i][j]=k;
					}
					System.out.println();
				}
			}
	
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mtx[i][j]+" ");
			}
			System.out.println();
		}
/*		for(int i=0;i<5;i++) {
			if(i==0 || i==4) {
				for(int j=2;j<=2;j++) {
					y++;
					System.out.print(y+" ");
				}
				System.out.println();
		}else if(i==1||i==3) {
				for(int j=1;j<=3;j++) {
					y++;
					System.out.print(y+" ");
				}
				System.out.println();
			}else {
				for(int j=0;j<=4;j++) {
					y++;
					System.out.print(y+" ");
				}
				System.out.println();
			}
		}
*/		 
	}
}
