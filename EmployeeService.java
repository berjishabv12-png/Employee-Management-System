
package employeesource;

import java.util.ArrayList;

import employeebean.employee;
import employeeexception.EmployeeException;

@SuppressWarnings("unused")
public class EmployeeService {

    ArrayList<EmployeeService> employees = new ArrayList<>();

    public void addEmployee(EmployeeService emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    public EmployeeService findEmployee(int id) throws EmployeeException {

        for (EmployeeService emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }

        throw new EmployeeException("Employee with ID " + id + " not found.");
    }

    private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteEmployee(int id) throws EmployeeException {

        EmployeeService emp = findEmployee(id);

        employees.remove(emp);

        System.out.println("Employee deleted successfully.");
    }

    public void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for (EmployeeService emp : employees) {
            System.out.println(emp);
        }
    }
}
