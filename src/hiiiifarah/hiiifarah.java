package hiiiifarah;

import java.util.Scanner;

public class hiiifarah {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int userChoice; 
// TODO Auto-generated method stub
		System.out.println("Please Select a program!");
		System.out.println("1.Arrays");
		System.out.println("2.Nested");
		System.out.println("3.Operators");
		System.out.println("4.Repition");
		System.out.println("5.Selection");
		System.out.println("6.Sub-Programs");
		System.out.println("7.Variables");
System.out.println("what is your choice ?");
     userChoice=in.nextInt();
      if(userChoice==1) {
     System.out.println("what size of arrays would you like?");
     int x;
    x=in.nextInt();
    double total=0;
     double[] arrays = new double[x];
    System.out.println("what value of Arrays ");
    	for(int i=0; i<arrays.length; i++) {
    		arrays[i]=in.nextDouble();
    			
    			total=total+arrays[i];
    	}
    	System.out.println("total number "+total);
    
    
      }
	}

}













