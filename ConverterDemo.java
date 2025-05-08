/*
Type Conversion and Type casting

boolean
short
char
long
int
float
double
string

*/

class ConverterDemo{
	public static void main(String[] args){
		boolean bo =true;
		byte by=10;
		short sh = 45;
		char ch = 'a';
		long lo = 452;
		int in = 456;
		float fl = 88/8;
		double db = 78.25;
		String st= "Hi";
		
		lo=by; //type conversion(Widening)
		
		sh=(short)lo; //casting
		
		fl=in;
		
		in= (int)db;
		
		in=100;
		ch=(char)in;
		
		
		
		System.out.println("Value of boolean bo is "+bo);
		System.out.println("Value of short sh is "+sh);
		System.out.println("Value of character ch is "+ch);
		System.out.println("Value of long lo is "+lo);
		System.out.println("Value of int in is "+in);
		System.out.println("Value of float fl is "+fl);
		System.out.println("Value of double db is "+db);
		System.out.println("Value of string st is "+st);
		
	}
}
