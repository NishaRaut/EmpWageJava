class EmpWages {
	//constants
	static final int  fulDayHr = 8;
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

	EmpWages companyArray[] = new EmpWages[2];
	int  num=0;
	int empHr=0;

   public void  calculateWages(){
	
		for(int i=0;i<companyArray.length;i++)
		{
			int day=0;
			System.out.println(companyArray[i].companyName);
			while(day<=companyArray[i].numOfWorkingDays && empHr<=companyArray[i].monthWorkingHrs)
			{
				int random = (int)(Math.floor( Math.random()*10)%3 );
				day++;
				switch ( (int)random ){
				case 1:
					empHr = 8;
					break;
				case 2:
					empHr = 4;
					break;
				default :
					empHr = 0 ;
					break;
				}
		int dailyEmpWages = empHr * companyArray[i].wagePerHr; 
		System.out.println(">>>>>>>"+dailyEmpWages);
		}
	}
}

   public void addCompany(int wage_Per_Hr,int month_Working_Hrs,int numof_Working_Days,String company_Name){
	 companyArray[num++] = new EmpWages(wage_Per_Hr, month_Working_Hrs, numof_Working_Days, company_Name);
	}

	public static void main(String args[]){
		EmployeeWage  empWage=new EmployeeWage();
		empWage.addCompany(20,100,20,"Dmart");
		empWage.addCompany(20,100,10,"Relince");	
		empWage.calculateWages();
	}
}




