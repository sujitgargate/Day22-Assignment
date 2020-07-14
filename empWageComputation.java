
//This is Employee Daily Wage code

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
