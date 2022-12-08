package hiiiifarah;

import java.util.Random;

public class Repetition{
//public static void 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Random hey = new Random();
	int farah1 = hey.nextInt(10);
	int fara2 = hey.nextInt(10);
	int zaid = hey.nextInt(10);
	String sour = (farah1 +","+fara2+ ","+zaid);

	int count=0;
	int fara3, fara4, zaid1;
	do {
		
		fara3 = hey.nextInt(10);
		
		fara4 = hey.nextInt(10);
		
		zaid1 = hey.nextInt(10);
		count++;
	}while(farah1!=fara3|| fara2!=fara4 || zaid!=zaid1);
	System.out.println("It took: "+count+" tries to get the answer correct ");
	}
}
