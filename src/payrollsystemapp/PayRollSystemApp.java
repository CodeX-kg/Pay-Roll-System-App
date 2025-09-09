 
package payrollsystemapp;

 import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PayRollSystemApp
{
 private static  ArrayList<Employee> employees= new ArrayList<>();
 private static Scanner kb = new Scanner(System.in);
 
    public static void main(String[] args) 
    {
     
    int choice;
     
        System.out.println("====================Menu====================");
        System.out.println("1.Add full-time employee \n"
                + "2.Add part-time employee \n"
                + "3.Display all employee \n"
                + "4.Search employee by ID \n"
                + "5.Find highest paid employee \n"
                + "6.Exit. ");
        choice=kb.nextInt();
 
        while(choice !=6)
        {
     switch(choice)
     {
         case 1:
        addFullTimeEmployee();
        break;
       
        case 2:
        addPartTimeEmployee();
        break;
        
         case 3:
        displayAllEmployees();
        break;
        
        case 4:
        searchEmployeeById();
        break;
        
        case 5:
        showHighestSalary();
        break;
        
         case 6:
        System.exit(0);
        break;
        
         default:
        System.out.println("invalid choice");
        
        System.out.println("====================Menu====================");
        System.out.println("1.Add full-time employee \n"
                + "2.Add part-time employee \n"
                + "3.Display all employee \n"
                + "4.Search employee by ID \n"
                + "5.Find highest paid employee \n"
                + "6.Exit. ");
        choice=kb.nextInt();
        break;
     }
     System.out.println("====================Menu====================");
        System.out.println("1.Add full-time employee \n"
                + "2.Add part-time employee \n"
                + "3.Display all employee \n"
                + "4.Search employee by ID \n"
                + "5.Find highest paid employee \n"
                + "6.Exit. ");
        choice=kb.nextInt();
    }
    }
    private static void addFullTimeEmployee()
    {
        System.out.println("Enter ID:");
        String id = kb.next();
        
        if(employeeExists(id))
        {
            System.out.println("Employee with this ID already exists!");
            return;
        }
        System.out.println("Enter name:");
        String name=kb.next();
        
        System.out.println("Enter base salary R:");
        double salary=kb.nextDouble();
        
        System.out.println("Enter bonus R: ");
        double bonus=kb.nextDouble();
        
        employees.add(new FullTimeEmployee(id, name, salary,bonus));
        System.out.println("Full-time employee added successsfully!");
    }
    
    private static boolean employeeExists(String id)
    {
    for(Employee e : employees )
    {
        if(e.getId().equalsIgnoreCase(id))
        {
            return true;
        }
    }
        
     return false;
        
    }

    private static void addPartTimeEmployee() 
    {
         System.out.println("Enter ID:");
        String id = kb.next();
        
        if(employeeExists(id))
        {
            System.out.println("Employee with this ID already exists!");
            return;
        }
        
         System.out.println("Enter name:");
        String name=kb.next();
        
        System.out.println("Enter base salary R:");
        double salary=kb.nextDouble();
        
        System.out.println("Enter hours Work R: ");
        int  hourlyWork=kb.nextInt();
        
        System.out.println("Enter hourly rate R: ");
        double  hourlyRate=kb.nextDouble();
        
        employees.add(new PartTimeEmployee(id, name, salary ,hourlyWork,hourlyRate));
        
        System.out.println("Part-time employee added successsfully!");
    }

    private static void displayAllEmployees() 
    {
     if(employees.isEmpty())
     {
         System.out.println("No employees found.");
         return;
     }
     for(Employee e : employees )
     {
       e.displayDetails();
     }
    }

    private static void searchEmployeeById() 
    {
        System.out.println("Enter employee ID: ");
        String id=kb.next();
        
        for(Employee e : employees)
        {
            if(e.getId().equalsIgnoreCase(id))
            {
                e.displayDetails();
                return;
            }
        }
        System.out.println("Employee not found ");
    }

    private static void showHighestSalary()
    {
      if(employees.isEmpty())
      {
          System.out.println("No employees to compare.");
          return;
          
      }
      Employee highest=employees.get(0);
      
      for(Employee e: employees)
      {
        if(e.calculateSalary()>highest.calculateSalary())
        {
           highest=e; 
        }
      }
        System.out.println("Employees with highest salary: ");
        highest.displayDetails();
    }
    
}
