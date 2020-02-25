class EmpWages {
	//constants
	public static final int wagePerHr = 20;
   public static final int fullDayHr = 8;
	public static final int partTimeHr = 4;
	public static final int monthlyWorkingDays = 20;

	public int calculateDailyWages(){
		int empHr = 0;
		int random = (int)(Math.floor( Math.random()*10)%3 );

		switch ( (int)random ){
			case 1:
			empHr = fullDayHr;
			break;
		case 2:
			empHr = partTimeHr;
			break;
		default :
			empHr = 0 ;
			break;
		}
		int dailyEmpWages = empHr * wagePerHr; 
	return dailyEmpWages;
	}
	public static void main(String args[]){
		EmpWages emp = new EmpWages();
		int monthlyWages = 0;
			for( int i=0; i<wagePerHr; i++ ){
 				monthlyWages += emp.calculateDailyWages();
				System.out.println("Monthly wages: "+monthlyWages);
			}
	}
}
