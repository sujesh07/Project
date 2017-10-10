public class Test1 {
	private int month;
	private int day;
	private int year;
	
public Test1(int m,int d,int y){
	month=m;
	day=d;
	year=y;
	
	System.out.print("the constructor is:");
	
}

public String toString(){
	return String.format("%d/%d/%d",month,day,year);
	
}
}
