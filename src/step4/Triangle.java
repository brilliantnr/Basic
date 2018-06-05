package step4;

public class Triangle {
public static void main(String[] args) {
	int k=0, up=0, down=0;
	int[][] mtx = new int[7][4];
	
	for(int i=3;up<i && i<down;i++) {
		for(int j=0;j<7;j++) {
			up=j-1;
			down=j+1;
				
			
			k++;
			mtx[j][i]=k;
		}
		System.out.println();
	}
	
	for(int i=0;i<7;i++) {
		for(int j=0;j<4;j++) {
			
			System.out.print(mtx[i][j]+" ");
		}
		System.out.println();
	}
}
}
