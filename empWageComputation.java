//This is Hello Message Printing 

public class HelloMessage{

	public static void main(String args[]){
		System.out.println("Hello message");
	}
}

//End of Hello Message//

//This is Employee Daily Wage code


//This is EmpPresentAbsent //

public class EmpPresentAbsent{

	public static void main(String args[]){
	int IS_FULL_TIME=1;
	double empCheck=Math.floor(Math.random()*10)%2;
	if(empCheck==IS_FULL_TIME){
		System.out.println("Employee is present ");
		
	}else{
		System.out.println("Employee is absent ");
	}
	}
}

//This is end of FIle EmpPresentAbsent //



public class EmpDailyWage{

	public static void main(String args[]){
		//Constants
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//Variables
		int empHrs=0;
		int empWage=0;
		//COMPUTATION
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME){
			empHrs=8;
		}else{
			empHrs=0;
		}
		empWage=EMP_RATE_PER_HOUR*empHrs;
		System.out.println(" Employee Wage "+empWage);
	}
}

//This is Employee daily wage end


//This is Part_Full time  //

public class EmpPartFullTime{

	public static void main(String args[]){
		//Constants
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		//Variables
		int empHrs=0;
		int empWage=0;
		//COMPUTATION
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck==IS_FULL_TIME){
			empHrs=8;

		}else if(empCheck==IS_PART_TIME){
                        empHrs=4;
                }

		else{
			empHrs=0;
		}
		empWage=EMP_RATE_PER_HOUR*empHrs;
		System.out.println(" Employee Wage "+empWage);
	}
}

//This is end of Part_Full time  //

