package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (employees.length == 10) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("| Name: " + employees[i].getName() + "| Surname: " + employees[i].getSurname() + "| EmployeeID: " +
                    employees[i].getEmplyeeID() + "| Salary: " + employees[i].getSalary() + "| Company: " + employees[i].getCompany()
                    + "| Position: " + employees[i].getPosition());
        }
    }

    public void searchEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(id)) {
                System.out.println(employees[i].getEmplyeeID());
            }
        }
    }

    public void searchEmployeeByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println("| Name: " + employees[i].getName() + "| Surname: " + employees[i].getSurname() + "| EmployeeID: " +
                        employees[i].getEmplyeeID() + "| Salary: " + employees[i].getSalary() + "| Company: " + employees[i].getCompany()
                        + "| Position: " + employees[i].getPosition());
            }
        }
    }


    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }


}
