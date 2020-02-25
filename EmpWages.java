class EmpWages {
	//constants
	public static final int wagePerHr = 20;
   public static final int fullDayHr = 8;
	public static final int partTimeHr = 4;
	public static final int monthlyWorkingDays = 20;

 public static void main(String args[]){
	int empHr = 0;
	int random = (int)(Math.floor( Math.random()*10)%3 );

	switch ( (int)random ){
	case 1:
		System.out.println("Employee present full time: ");
		empHr = fullDayHr;
		break;
	case 2:
		System.out.println("Employee present part time: ");
		empHr = partTimeHr;
		break;
	default :
		System.out.println("Employee is Absent!!");
		empHr = 0 ;
		break;
	}

	int dailyEmpWages = wagePerHr * empHr;
	int monthlyEmployeeWages = dailyEmpWages * monthlyWorkingDays;
	System.out.println("Monthly employee wages: "+monthlyEmployeeWages);
 }
}
