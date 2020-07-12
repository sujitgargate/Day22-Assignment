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


//This is EmpSwitchCase

public class EmpSwitchCase{

	 //Constants
         public static final int IS_FULL_TIME=1;
         public static final int IS_PART_TIME=2;
         public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String args[]){
		//Variables
		int empHrs=0;
		int empWage=0;
		//COMPUTATION
		double empCheck=Math.floor(Math.random()*10)%3;
		switch ((int)empCheck){
		
		case IS_FULL_TIME:
			empHrs=8;
			break;

		case IS_PART_TIME:
                        empHrs=4;
			 break;

		default:
			empHrs=0;
		}
		empWage=EMP_RATE_PER_HOUR*empHrs;
		System.out.println(" Employee Wage "+empWage);
	}
}

//This is end of EmpSwitchCase


// This is Emp20DayWage

public class Emp20DayWage{

	 //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	
	public static void main(String args[]){
		
		//Variables
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
		
		
			//COMPUTATION
			double empCheck=Math.floor(Math.random()*10)%3;
			switch ((int)empCheck){

			case IS_FULL_TIME:
				empHrs=8;
				break;

			case IS_PART_TIME:
	                        empHrs=4;
				 break;

			default:
				empHrs=0;
			}
			empWage=EMP_RATE_PER_HOUR*empHrs;
			totalEmpWage+=empWage;
			System.out.println(" Employee Wage "+empWage);
		}
			System.out.println(" Total Employee Wage "+totalEmpWage);
	}
}


// This is end Emp20DayWage

//This is Employee 100 hours and 20 days limit

public class empTotalWage
{
	//Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

public static void main(String[ ] args)
{
	//variables
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0, totalWorkingDays=0, totalEmpHrs=0;
	while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
	{
		totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck)
		{
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
		}
		totalEmpHrs += empHrs;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Employee Wage : "+empWage);
	}
	System.out.println("Total Employee Wage: "+totalEmpWage);
	}
}

//This end of limit to 100 hours file 