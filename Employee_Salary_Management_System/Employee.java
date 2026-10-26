package Employee_Salary_Management_System;

public class Employee {
    int EmployeeID;
    String name;
    String DepartmentName;
    double basic_Salary;
    private final String category;

    Employee(int EmployeeID, String name,String DepartmentName, double basic_Salary,String category){
        this.EmployeeID=EmployeeID;
        this.name=name;
        this.DepartmentName=DepartmentName;
        this.basic_Salary=basic_Salary;
        this.category=category;
    }
    void display(){
        System.out.println("Employee ID: "+ EmployeeID);
        System.out.println("name: "+ name);
        System.out.println("department name: "+ DepartmentName);
        System.out.println("category :"+ getCategory());
        System.out.println("monthly salary:"+calculateSalary());
    }
    public String getCategory() {
        return category;
    }
    public double calculateSalary(){
          return basic_Salary;
    }
}
class FullTimeEmployee extends Employee{
    double Allowance;
    FullTimeEmployee(int EmployeeID, String name,String DepartmentName, double basic_Salary,String category,
               double Allowance){
        super(EmployeeID,name,DepartmentName,basic_Salary,category);
      this.Allowance=Allowance;
    }

    @Override
    public double calculateSalary() {
       return basic_Salary + Allowance;
    }
}
class Part_TimeEmployee extends Employee{
    double hours_Work;
    double hourly_Rate;
    Part_TimeEmployee(int EmployeeID,String name ,String DepartmentName, double basic_Salary,String category,
              double hours_work, double hourly_Rate){
        super(EmployeeID,name,DepartmentName,basic_Salary,category);
        this.hours_Work=hours_work;
        this.hourly_Rate=hourly_Rate;
    }

    @Override
    public double calculateSalary() {
        return hours_Work * hourly_Rate;
    }
}

class Manager extends Employee{
    double bonus;
    Manager(int EmployeeID,String name,String DepartmentName, double basic_Salary,String category,
                double bonus){
        super(EmployeeID,name,DepartmentName,basic_Salary,category);
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
         return basic_Salary + bonus;
    }

    static void main() {
        Employee[] employees={
                new FullTimeEmployee(111,"ebyan","computer Application",500,
                        "full Time",150),
                new Part_TimeEmployee(112,"kowther","Networking",600,
                        "part Time",30,8),
                new Manager(113,"bushra","Multimedia",600,
                        "manager",60)
        };
        System.out.println("====== Employee Information ======");
        System.out.println();
        for( Employee E: employees){
            E.display();
            System.out.println();
        }
    }
}