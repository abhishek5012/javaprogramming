package MyCaptain;
class Employ{
	int id;
	String name;
	String address;
	
	Employ(String h,int j, String f){
		this.name=h;
		this.id=j;
		this.address=f;
		
	}
	public void print() {
		System.out.printf("%s		%d		%s",name,id,address);
		System.out.print("\n");
		
	}
	
	
}

public class project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ emp1 = new  Employ("robert",1994,"64-WallsStreet");
		Employ emp2 = new  Employ("Sam",2000,"64-WallsStreet");
		Employ emp3 = new  Employ("John",1999,"64-WallsStreet");
		System.out.println("NAME		ROOLNO		ADDRESS");
		emp1.print();			
		emp2.print();
		emp3.print();		
	}																	

}

