 
package payrollsystemapp;
 
abstract class Employee 
{
    
protected String id;
protected String name;
protected  double basicSalary;

    public Employee(String id, String name, double basicSalary) 
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public  abstract double calculateSalary();
    
    public void displayDetails()
    {
        System.out.println("ID: "+id+ " , Name: "+name+", Salary: "+calculateSalary()); 
    }

    public String getId() 
    {
        return id;
    }
    
   

}
