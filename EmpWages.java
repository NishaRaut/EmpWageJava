class EmpWages {

 public static void main(String args[]){
	int wagePerHr = 20;
	int fullDayHr = 8;
	
	long random = Math.round( Math.random() )  ;
	if( random == 1 ){
		System.out.println("Employee is present..");
		long dailyWages = wagePerHr * fullDayHr;
		System.out.println("Daily Employee Wage = "+dailyWages);
	}
	else
	{
		System.out.println("Employee is absent!!");
	}
 }
}
