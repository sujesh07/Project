
public class banana {
	 private int hour=24;
	 private  int minute=8;
	 private int second=9;
	 
	 
public void setTime(int hour,int minute,int second){
	this.hour=5;
	this.minute=9;
	this.second=13;
	
}

	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour,minute,second);
		}
	public String toString(){
		return String.format("%d:%02d:%02d %s",((hour==0 || hour ==12) ? 12 : hour%12),minute,second,(hour < 12 ? "AM" : "PM") );
		
		
				
	}

}
