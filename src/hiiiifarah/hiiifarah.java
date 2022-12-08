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
//number2
public class Nested {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("What's the first value?");
		int arrays= in.nextInt();
		System.out.println("What's the second value?");
		int moustache= in.nextInt();
		for(int i=1; i<=moustache; i++) {
			for (int j=1; j<=arrays; j++) {
				System.out.print(j*i+"\t");
			}
			System.out.println("\n");
		}
	}

}
//number3
public class Operator {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = in.nextInt();
		int tem1= x;
		x=x-1;
		System.out.println(tem1+"-1="+x);
		int arrays=x;
		x=x*3;
		System.out.println(arrays+"x3="+x);
		int farah1=x;
		x=x+12;
		System.out.println(farah1+"+12="+x);
		int girl=x;
		x=x/3;
		System.out.println(girl+"/3="+x);
		int naa=x;
		x=x+5;
		System.out.println(naa+"+5="+x);
		int y=x;
		y=x-tem1;
		System.out.println(arrays+"-"+tem1+"="+x);
		System.out.println("It's 8!!");
	}

}
  // NUMBER 4
public class Repetition {

//number 5 
//number5public class Selection {
//public static void 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in= new Scanner(System.in);
	System.out.println("Please state how much you made:");
	int hey= in.nextInt();
	double farah1=0;
	double tem1;
	if ( hey > 5000 && hey <= 49020) {
		farah1= hey*0.15;
		System.out.println("This is how much you owe: \n" +farah1);
	} else if (hey >49020 && hey <= 98040) {
		tem1 = 49020*0.15;
		farah1= tem1; 
		hey= hey-98040;
		tem1 = hey*0.205;
		farah1= farah1 +tem1;
		System.out.println("This is how much you owe: \n" +farah1);
	} else if(hey >98040 && hey <=151978 ) {
		tem1 = hey*0.15;
		farah1= tem1; 
		tem1 = hey*0.205;
		farah1= farah1 +tem1;
		tem1 = hey*0.26;
		farah1 = farah1+tem1;
		System.out.println("This is how much you owe: \n" +farah1);
	} else if(hey >151978 && hey <=216511 ) {
		tem1 = hey*0.15;
		farah1= tem1; 
		tem1 = hey*0.205;
		farah1= farah1 +tem1;
		tem1 = hey*0.26;
		farah1= farah1+tem1;
		tem1 = hey*0.29;
		farah1= farah1+tem1;
		System.out.println("This is how much you owe: \n" +farah1);
	} else if(hey > 216511 ) {
		tem1 = 49020*0.15;
		farah1= tem1;
		tem1 = (98040-49020)*0.205;
		farah1= farah1 +tem1;
		tem1 = (151978-98040)*0.26;
		farah1= farah1+tem1;
		tem1 = (216511-151978)*0.29;
		farah1= farah1+tem1;
		tem1 = (hey-216511)*0.33;
		farah1= farah1+tem1;
		System.out.println("This is how much you owe: \n" +farah1);
	}else {
		System.out.println("You sir, are broke. \nhere, take some: \n$9999");
	}
}

}
//number 6
public class Subprograms {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("What is the first string:");
		String hey = in.next();
		System.out.println("What is the second string:");
		String farah1 = in.next();
		System.out.println(combine(hey,farah1));
	}
	public static String combine(String s1,String s2) {
		String girl2 = "";
		for (int i=0; i<Math.max(s1.length(),s2.length()); i++) {
			if(i<s1.length()) {
				girl2+=s1.charAt(i);
			} 
			girl2+=s2.charAt(i);
		}
		return girl2;
		
	}
}











