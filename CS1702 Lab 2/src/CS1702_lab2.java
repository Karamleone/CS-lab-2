import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class CS1702_lab2 {

	public static void main(String args[])
	{
		
	double a;
	a = (double) 100;
	double b; 
	b = (double) 2.3;
	double c;
	c = (double) -52.2;
	boolean d;
	d = (boolean) true;
	String e;
	e = (String) "I am ";
	String f;
	f = (String) "a student";
	Double g;
	g = (double) 0;
	String h;
	h = (String) "!";
	String name; 
	name = (String) "Milan";
	double x;
	x = (double) 10;
	double pi;
	pi = (double) 22/7;
	
	
	
	System.out.println("question 1");
	double y; 
	y = (double) (a + b);
	
	System.out.println(y);
	
	System.out.println("question 2");
	//double y;
	//y = (double) (a + d);
	System.out.println("question 2 cannot work as mixes boolean with double");
	
	System.out.println("question 3");
	System.out.println(e+f);		
	
	System.out.println("question 4");
	double y1; 
	y1 = (double) (b * c);
	System.out.println(y1);
	
	System.out.println("question 5");
	System.out.println(pi);
	
	System.out.println("question 6");
	//String z1;
	//z1 = (name/g);
	//System.out.println(z1); 
	System.out.println("cannot work as mixing string with number");
	   
	System.out.println("question 7");
	double z2;
	z2 = (c / g);
	System.out.println(z2);
	    
	System.out.println("question 8");
	System.out.println(Math.pow(x,3));
	    
	System.out.println("question 9");
	System.out.println(name + " is " + f + h);
		
	System.out.println("question 10");
	//System.out.println(((name + 10)/ (name + h)));
	//mixing strings with numbers
		
	System.out.println("question 11");
	//System.out.println(((a+b)/(d+c)));
	//mixing boolean with double 
	
	System.out.println("question 12");
	double y2;
	y2 = (double) 100.3;
	System.out.println((y2/(a+b))-c);
	
	System.out.println("question 13");
	System.out.println("x^2= " + (Math.pow(y, 2)+Math.pow(z2, 2))); //assuming using question 7's "z" as z is not a user defined variable
	
	System.out.println("question 14");
	//System.out.println("is " + f - h);
	//cannot do "f - h" as both string
	
	System.out.println("question 15");
	System.out.println( ( (pi + 1)/(pi + 2) ) / (pi + 3) ) ;
	
	System.out.println("question 16");
	y = (double) -2;
	System.out.println("y = " + Math.cbrt((Math.pow(y,2))/b));
		
	System.out.println("question 17");
	y = (double) (b / g);
	System.out.println("z = " + y + name);
	
	System.out.println("question 18");
	String z1;
	z1 = (String) name;
	System.out.println("z = " + b/g + z1);
	
	System.out.println("question 19");
	y = (double) -2.3;
	System.out.println("y = " + (a*(Math.pow(y, 2)) + b* y + z1) ); //assuming z = z1 from q18
	
	System.out.println("question 20");
	//System.out.println("y = " + (y - (Math.pow((a-b), (Math.pow((b-c), (c - d)))))));
	//cannot work as d = boolean hence c - d =/= 

	System.out.println();
	System.out.println("2.4 - Variables with finch");
	
	int Red, Green, Blue, Duration;
	Red = 0;
	Green = 0;
	Blue = 255;
	Duration = 1000; //ms
	
	Finch myfinch = new Finch();
	myfinch.setLED(Red, Green, Blue, Duration);
	myfinch.quit();
	

	}


}


