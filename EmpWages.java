class EmpWages {
	//constants
	static final int  fullDayHr = 8;
	static final int partTimeHr = 4;

	//variabels
	final int wagePerHr;
	final int monthWorkingHrs;
	final int numOfWorkingDays;
	final String companyName;

 	public EmpWages(int wage_Per_Hr,int month_Working_Hrs,int numof_Working_Days,String company_Name){
		wagePerHr = wage_Per_Hr;
		monthWorkingHrs = month_Working_Hrs;
		numOfWorkingDays = numof_Working_Days;
		companyName = company_Name;
	}
}

public class EmployeeWage {

 public int calculateDailyWages(EmployeeWage emp){
	int empHr = 0;
	int num=0;
	int day=0;
	EmpWages companyArray[] = new EmpWages[5];
  
	while(day<=emp.numOfWorkingDays)
	int random = (int)(Math.floor( Math.random()*10)%3 );
	day++
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
		int dailyEmpWages = empHr * emp.wagePerHr; 
		System.out.println(">>>>>>>"+dailyEmpWages);
	return dailyEmpWages;
	}

   public void addCompany(int wage_Per_Hr,int month_Working_Hrs,int numof_Working_Days,String company_Name){
	 companyArray[num++] = new EmpWages(wage_Per_Hr, month_Working_Hrs, numof_Working_Days, company_Name);
	}

	public static void main(String args[]){
		EmployeeWage  empWage=new EmployeeWage();
		empWage.addCompany(20,2,2,"Dmart");	
		empWage.calculateWage(empWage);
	}
}
