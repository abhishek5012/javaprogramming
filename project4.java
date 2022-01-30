package MyCaptain;
import java.util.Scanner;


class prime{
	int y;
	boolean m=false;
	prime(int u){
		this.y=u;
		
	}
	public boolean isprime() {
		for(int i=2;i<y;i++) {
			if(y%i==0) {
				m=true;
			}
			
		}
		return m;
		
		
	}
	void result(){
		if(m) {
			System.out.println("no, it is not a prime number:");
		}
		else {
			System.out.println("yes,it is a prime number :");
		}
		
	}
}

public class Project4 {
	public static void main(String[] args) {
		//whether prime number or not
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to find the prime or not : ");
		int p=sc.nextInt();
		prime pi = new prime(p);
		pi.isprime();
		pi.result();
		
		
		
	}

}

