 
package payrollsystemapp;
 
public class FullTimeEmployee extends  Employee
{
private double bonus;

    public FullTimeEmployee(String id, String name, double basicSalary,double bonus) {
        super(id, name, basicSalary);
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary()
    {
        
        return basicSalary + bonus ;
    }
    
@Override
       public void displayDetails()
    {
        System.out.println("ID: "+id+ " , Name: "+name+", Salary: "+calculateSalary()); 
    }

}
