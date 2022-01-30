package MyCaptain;
import java.util.Scanner;
public class Project5 {

	public static void fibo(int n) {

		int arr[]=new int [n];
		arr[0]=0;
		arr[1]=1;
		
		if(n>2) {
			for(int i=2;i<n;i++) {
				arr[i]=arr[i-1]+arr[i-2];
				
				
			}
			for(int y:arr) {
				System.out.print( y+" " );
			}
			
		}
		else if(n==1) {
			
				System.out.print(arr[0]);
			}
		else if(n==2) {
			
			for(int k: arr) {
				System.out.print(k+" ,");
			}
		}
		else { 
			System.out.println("the series you want to finds is not able to process please look into the number of the series you need : ");
		}
		
		
				}
	
	
	
	
	public static void fibo2(int w) {
		if(w>1) {
			fibo(w);
			
		}
		
		else if(w>=0 && w<2) {
			System.out.println("0");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the main logic about the fibonacci series is that two numbers is the 0 and 1 and the other numbers can be derived using the sum of the two number
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number you want to finmd the fibonacchi series :");
		int s =sc.nextInt();
		System.out.println("\nthe fiboncci series of the following numbers are : ");
		fibo2(s);
		

	}

}



