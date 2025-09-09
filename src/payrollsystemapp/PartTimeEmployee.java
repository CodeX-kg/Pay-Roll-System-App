 
package payrollsystemapp;

 
public class PartTimeEmployee extends  Employee
{

    private   int hoursWorked;
    private double hourlyRate;
    
    public PartTimeEmployee(String id, String name, double basicSalary,int hoursWorked,double hourlyRate)
    {
        super(id, name, basicSalary);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary() 
    {
          
        return hourlyRate*hoursWorked;
          
    }
        
}
