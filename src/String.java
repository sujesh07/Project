
public class String {
	private int month;
	private int day;
	private int year;
	
public String(int m,int d,int y){
	month=m;
	day=d;
	year=y;
	
	System.out.println("the constructor is");
	
}

public String toString(){
	return String.format("%d/%d/%d",month,day,year);
	
}
}
