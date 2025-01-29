import java.util.Random;
import java.util.Scanner;

class train{
	String startingPoint;
	String destination;
	int trainNo;
	int  S1, S2, B1, A1, H1;
	
	void printdetails(train a) {
		System.out.println(a.trainNo+" "+a.startingPoint+" "+a.destination+" S1-"+a.S1+" S2-"+a.S2+" B1-"+a.B1+" A1-"+a.A1+" H1-"+a.H1);
	}
	train[] init(){
		train trains[]=new train[10];
		trains[0].startingPoint="Rajkot";
		trains[0].destination="Mumbai";
		trains[0].trainNo=17726;
		trains[1].startingPoint="Rajkot";
		trains[1].destination="Mumbai";
		trains[1].trainNo=17728;
		trains[2].startingPoint="Mumbai";
		trains[2].destination="Rajkot";
		trains[2].trainNo=17730;
		trains[3].startingPoint="Mumbai";
		trains[3].destination="Rajkot";
		trains[3].trainNo=17732;
		trains[4].startingPoint="Rajkot";
		trains[4].destination="Banglore";
		trains[4].trainNo=17734;
		trains[5].startingPoint="Rajkot";
		trains[5].destination="Banglore";
		trains[5].trainNo=17736;
		trains[6].startingPoint="Baglore";
		trains[6].destination="Rajkot";
		trains[6].trainNo=17738;
		trains[7].startingPoint="Banglore";
		trains[7].destination="Rajkot";
		trains[7].trainNo=17740;
		trains[8].startingPoint="Rajkot";
		trains[8].destination="Pune";
		trains[8].trainNo=17742;
		trains[9].startingPoint="Pune";
		trains[9].destination="Rajkot";
		trains[9].trainNo=17744;
		Random seats=new Random();
		for(int i=0;i<10;i++) {
			trains[i].S1=seats.nextInt(73);
			trains[i].S2=seats.nextInt(73);
			trains[i].B1=seats.nextInt(73);
			trains[i].A1=seats.nextInt(49);
			trains[i].H1=seats.nextInt(25);	
		}
		return trains;
	}
	
	void findTrain(String startingPoint,String destiation,train trains[]) {
		train o=new train();
		int j=1;
		for(int i=0;i<10;i++) {
			if(trains[i].startingPoint==startingPoint && trains[i].destination==destiation) {
				System.out.println(j+". ");
				o.printdetails(trains[i]);
				j++;
			}
		}
	}
	int findTrainNo(int trainNo,train trains[]) {
		int index=0;
		for(int i=0;i<10;i++) {
			if(trains[i].trainNo==trainNo) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	void book(train t,int noOfPassengers,char Class) {
		
	}
	
}

public class RailwayBooking {

	public static void main(String[] args) {
		train o=new train();
		train[] trains;
		trains=o.init();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Point : ");
		String startingPoint=s.next();
		System.out.println("Enter Destination: ");
		String destination=s.next();
		o.findTrain(startingPoint, destination, trains);
		System.out.println("Enter Train Number : ");
		int trainNo=s.nextInt();
		System.out.println("Enter class: \nS - Sleeper (SL)\nB - 3 Tier AC (3A)\nA - 2 Tier AC (2A)\nH - 1st class AC (1A)");
		char Class=s.next().charAt(0);
		System.out.println("Enter No.of Passengers : ");
		int noOfPass=s.nextInt();
		o.book(trains[o.findTrainNo(trainNo, trains)], noOfPass, Class);
	}

}
