package ArrayList;
*
* @author fadhlinqistina
*/
public class Employee {
    static int getSalary;
    String name;
    int empId;
    int hireYear;
    int hourWork;
    double rate;

    //default constructor
    public Employee(){
        name = " ";
        empId = 0;
        hireYear = 0;
        hourWork = 0;
        rate = 0;
    }

    //normal constructor
    public Employee(String name, int empId, int hireYear, int hourWork, double rate, double salary){
        this.name = name;
        this.empId = empId;
        this.hireYear = hireYear;
        this.hourWork = hourWork;
        this.rate = rate;
    }

    //mutator
    public void Employee(String nm, int id, int year, int hour, double rm, double sal){
        name = nm;
        empId = id;
        hireYear = year;
        hourWork = hour;
        rate = rm;
        double salary = sal;
    }

    //accessor
    public String getName(){
        return name;
    }

    public int getEmpId(){
        return empId;
    }

    public int getHireYear(){
        return hireYear;
    }

    public int getHourWork(){
        return hourWork;
    }

    public double getRate(){
        return rate;
    }

    public int getSalary(){
        int salary = 0;
        return salary;
    }

    //print
    public String toString(){
        return " \n Name : " + name + "\n Employee Id : " + empId + "\n Hire Year : " +
        hireYear + "\n Hour Work : " + hourWork + "\n Rate : RM " + rate;
    }

    //calSalary
    public void calSalary(int salary,int hourWork, int rate){
        salary = (int) (hourWork * rate);
        System.out.println(salary);
    }
}