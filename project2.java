package MyCaptain;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// matrix addition
		int a [][]= { {1,3,4}, {2,3,4}, {3,4,5}};
		
		int b [][]= {{1,3,4},{2,3,4},{1,2,4}};
		
		int k[] [] = {{0,0,0},{0,0,0},{0,0,0}};
		
		for(int i=0 ;i<a.length;i++) { 
			for (int j= 0;j<a[i].length;j++) {
				k[i][j] = a[i][j] + b[i][j];
				System.out.print(k[i][j]+" ");
				
			}System.out.print("\n");
		}

	}

}

