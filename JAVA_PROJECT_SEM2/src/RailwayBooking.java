import java.util.Scanner;

class train{
	String from;
	String to;
	String name;
	String time;
	String date;
	String categorySeats[][]=new String[5][];
	
	train( String from,String to,String name,String time,String date) {
		this.from=from;
		this.to=to;
		this.name=name;
		this.time=time;
		this.date=date;
	}
}



public class RailwayBooking {

	public static void main(String[] args) {
		train t1=new train("Rajkot", "Jamnagar", "Saurashta Express", "12:00 - 2:00", "2 February");
		train t2=new train("Rajkot", "Jamnagar", "Jamnagar Express", "2:50 - 3:50", "6 February");
		train t3=new train("Rajkot", "Jamnagar", "Veraval Okha Express", "4:00 - 5:15", "10 February");
		train t4=new train("Jamnagar", "Rajkot", "Saurashta Express", "2:00 - 4:00", "2 February");
		train t5=new train("Jamagar", "Rajkot", "Jamnagar Express", "3:50 - 4:50", "6 February");
		train t6=new train("Jamnagar", "Rajkot", "Veraval Okha Express", "5:00 - 6:15", "10 February");
		

	}

}
