class EmpWages {
	//constants
	public static final int wagePerHr = 20;
   public static final int fullDayHr = 8;
   public static final int partTimeHr = 4;
 public static void main(String args[]){
	long random = Math.round( Math.random() )  ;
	if( random == 1 ){
		System.out.println("Employee is present..");
		long dailyWages = wagePerHr * partTimeHr;
		System.out.println("Part Time Employee Wage = "+dailyWages);
	}
	else
	{
		System.out.println("Employee is absent!!");
	}
 }
}
