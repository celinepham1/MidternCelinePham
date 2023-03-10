package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee {


 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */
 	static int monthlySalary, yearlySalary;
	String name;
	String department;
	private int phoneno;
	/*
	 * declare few static and final fields and some non-static fields
	 */

	static String companyName;
	public int getPhoneno(){
		return phoneno;
	}
	public void setPhoneno(int phoneno){
		this.phoneno = phoneno;
	}
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		
	}
    public EmployeeInfo(String name, int employeeId){
		System.out.println("Employee name: "+ name);
		System.out.println("EmployeeID: "+ employeeId);
	}

	public EmployeeInfo() {

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
		int total = 0;
		return total;
		/*int salary;
		int answer;
		double addedBonus;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Choose performance level:");
			System.out.println("10- Best Performance");
			System.out.println("8- Average Performance");
			System.out.println("4- Below average Performance");
			answer = sc.nextInt();
			return total;
		}while (answer != 10 && answer != 8 && answer != 6){
			System.out.println("Pick only 10,8,4");
		}
		if(answer ==10){
			System.out.println("Enter salary: ");
			salary = sc.nextInt();
			addedBonus = salary*.10;
			System.out.println("Bonus is:");
		}else if (answer==8){
			System.out.println("Enter salary: ");
			salary = sc.nextInt();
			addedBonus = salary*.08;
			System.out.println("Bonus is:");
		}else{
			System.out.println("Enter salary: ");
			salary = sc.nextInt();
			addedBonus = salary*.04;
			System.out.println("Bonus is:");
		}
		while(answer==1);*/
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		//
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);

        String convertedTodaysDate = DateConversion.convertDate(todaysDate);



        //implement numbers of year from above two dates
		//Calculate pension



		return total;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}


	@Override
	public int employeeAge() {
		int age = 45;
		System.out.println("Employee Age: " + age);
		return age;
	}

	@Override
	public void assignDepartment() {

		System.out.println();
	}

	@Override
	public int calculateSalary() {
		monthlySalary = 7000;
		yearlySalary=monthlySalary*12;
		System.out.println("Calculated Salary:" + yearlySalary);
		return yearlySalary;
	}

	@Override
	public void benefitLayout() {

	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
