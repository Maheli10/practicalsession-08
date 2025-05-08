import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gp=0;
		
		return gp;
		
		/*if(grade.equals("A+") || grade.equals("A"));
		{
			gp=4;
		}
		elif(grade.equals("A+")){
			gp=3.7;
		}
		elif(grade.equals("B+")){
			gp=3.3;
		}
		elif(grade.equals("B")){
			gp=3.0;
		}
		elif(grade.equals("B-")){
			gp=2.7;
		}
		elif(grade.equals("C+")){
			gp=2.3;
		}
		elif(grade.equals("C")){
			gp=2;
		}
		elif(grade.equals("C-")){
			gp=1.7;
		}
		elif(grade.equals("D+")){
			gp=1.3;
		}
		*/
		
		switch(grade){
			case"A+":
				gp=4;
				break;
			case"A":
				gp=4;
				break;
			case"A-":
				gp=3.7;
				break;
			case"B+":
				gp=3.3;
				break;
			case"B":
				gp=3;
				break;
			case"B-":
				gp=2.7;
				break;
			case"C+":
				gp=2.3;
				break;
			case"C":
				gp=2;
				break;
			case"C-":
				gp=1.7;
				break;
			case"D+":
				gp=1.3;
				break;
		}
		
		
	}
}

class Demo{
	
	public static void main(String [] args){
		String name;
		float ogpa;
		String grade;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name= sc.nextLine();
		System.out.println("Hi "+name);
		
		System.out.println("Enter the grade fot IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		System.out.println("Grade point value of the grade"+grade+ " is "+point);
		
	}
}