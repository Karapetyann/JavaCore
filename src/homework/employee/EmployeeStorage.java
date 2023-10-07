package homework.employee;

import static homework.employee.EmployeeDemo.addEmplyee;
import static homework.employee.EmployeeDemo.changID;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;
    public static int index;

    public void add(Employee employee) {
        if (employees.length == 10) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        System.out.println("---------------------");
        for (int i = 0; i < size; i++) {
            System.out.println("| Name: " + employees[i].getName() + "| Surname: " + employees[i].getSurname() + "| EmployeeID: " +
                    employees[i].getEmployeeID() + "| Salary: " + employees[i].getSalary() + "| Company: " + employees[i].getCompany()
                    + "| Position: " + employees[i].getPosition());
        }
        System.out.println("---------------------");
    }

    public void searchEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(id)) {
                System.out.println(employees[i].getEmployeeID());
            }
        }
    }

    public void searchEmployeeByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println("| Name: " + employees[i].getName() + "| Surname: " + employees[i].getSurname() + "| EmployeeID: " +
                        employees[i].getEmployeeID() + "| Salary: " + employees[i].getSalary() + "| Company: " + employees[i].getCompany()
                        + "| Position: " + employees[i].getPosition());
            }
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

     public void deletebyId(String id){
         for (int i = 0; i < size; i++) {
             if (employees[i].getEmployeeID().contains(id)){
                 for (int j = i; j < size; j++) {
                     employees[i]=employees[i+1];
                 }
                 size--;
             }else {
                 System.out.println("Sorry this ID was not found");
             }
         }
     }

    public void changeEmployeeById(String id){
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(id)){
               index = i;
               changID();
            }
        }
    }
    public void addid(Employee employeed) {
        employees[index] = employeed;
    }


}
