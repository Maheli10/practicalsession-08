import java.util.Scanner;

class InputDemo{
	public static void main(String[] args){
		String name;
		int age;
		byte marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Hi Enter your name: ");
		name=sc.nextLine(); //read string until you press enter key
		System.out.println("Hello "+name+" ,How are you?");
		
		System.out.println("Enter your age: ");
		age= sc.nextInt(); //read the int value
		System.out.println("Oh god! Are you "+age+" years old?");
		
		System.out.println("Enter your marks: ");
		marks= sc.nextByte();
		System.out.println("You got "+marks+" marks");


	}
	
}