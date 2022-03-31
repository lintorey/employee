package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeApp {
public static void main(String[] args) {
//Declare one sequential list name empList
ArrayList<Employee> empList = new ArrayList(); //default value 10
Scanner scan = new Scanner(System.in);
Employee myEmp = new Employee();

int type = 1;
double salary = 0;
int duration = 0;

//insert 10 Employee objects into the list
for(int i = 0; i < 10; i++){
System.out.println("\nNo Of Employee : "+ type);
type++;
System.out.print("\nEnter Employee Name : ");
String nm = scan.next();
System.out.print("Enter Employee ID : ");
int id = scan.nextInt();
System.out.print("Enter Hire Year : ");
int year = scan.nextInt();
System.out.print("Enter Hour Work : ");
int hour = scan.nextInt();
System.out.print("Enter Rate Per Hour : RM ");
double rm = scan.nextDouble();
System.out.println("=========================================");
//Display all the information about the Employee objects.
salary = hour * rm;
duration = 2020 - year;
empList.add(new Employee(nm,id,year,hour,rm,salary));
}//for
//Calculate and display the lowest and highest salary.
Employee empObj = empList.get(0);
double minValue = empObj.getSalary();
double maxValue = Integer.MIN_VALUE;
for(int i = 1; i<empList.size(); i++){
myEmp = empList.get(i);
if(myEmp.getSalary() < minValue){
minValue = empObj.getSalary();
}
}
if (myEmp.getSalary()>maxValue) {
maxValue = myEmp.getSalary();
}
System.out.println("\nHighest Salary : RM " + minValue);
System.out.println("Lower Salary : RM " + maxValue );

//Calculate and display the total number of employee with salary > RM2500 &
//copy the information into another list name newList
int totalEmp = 0;
ArrayList newList = new ArrayList();
for(int m=0; m<empList.size(); m++){
Employee u = (Employee) empList.get(m);
if(u.getSalary() > 2500){
totalEmp++;
newList.add(u);
System.out.print("\nNumber Employee High Salary More Than RM 2500 : "
+ totalEmp);
System.out.println(u);
}
}
System.out.println("=========================================");
//Display the name and empId that serve the company for more than 7 years.
String name = " ";
int id = 0;
for(int m=0; m<empList.size(); m++){
Employee e = (Employee) empList.get(m);
if(duration > 7){
name = e.getName();
id = e.getEmpId();
}
System.out.println("\nList Of Employee Served More Than 7 Years:");
System.out.println("Employee Name : " + e.getName());
System.out.println("Employee ID : " + e.getEmpId());
}
}//main
}//class