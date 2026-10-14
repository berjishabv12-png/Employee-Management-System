package employeecontroller;


	
	import java.util.Scanner;

import employeebean.employee;
import employeeexception.EmployeeException;
import employeesource.EmployeeService;

	@SuppressWarnings("unused")
	public class EmployeeController {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        EmployeeService service = new EmployeeService();

	        while (true) {

	            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Find Employee");
	            System.out.println("3. Delete Employee");
	            System.out.println("4. Display Employees");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            try {

	                switch (choice) {

	                    case 1:

	                        System.out.print("Enter ID: ");
	                        int id = sc.nextInt();

	                        sc.nextLine();

	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();

	                        System.out.print("Enter Salary: ");
	                        double salary = sc.nextDouble();

	                        EmployeeService emp =
	                                new EmployeeService();

	                        service.addEmployee(emp);

	                        break;

	                    case 2:

	                        System.out.print("Enter Employee ID: ");
	                        int searchId = sc.nextInt();

	                        EmployeeService found =
	                                service.findEmployee(searchId);

	                        System.out.println(found);

	                        break;

	                    case 3:

	                        System.out.print("Enter Employee ID: ");
	                        int deleteId = sc.nextInt();

	                        service.deleteEmployee(deleteId);

	                        break;

	                    case 4:

	                        service.displayEmployees();

	                        break;

	                    case 5:

	                        System.out.println("Program terminated.");
	                        sc.close();
	                        return;

	                    default:

	                        System.out.println("Invalid choice.");
	                }

	            } catch (EmployeeException e) {

	                System.out.println("Error: " + e.getMessage());

	            }
	        }
	    }
	}
	
