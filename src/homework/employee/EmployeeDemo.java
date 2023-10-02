package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isrun = true;


        while (isrun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    System.out.println("Please input employee NAME");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee SURNAME");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee EMPLOYEE-ID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input employee SALARY");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input employee COMPANY");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee POSITION");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee created!");
                    break;
                case "2":
                    System.out.println("---------------------");
                    employeeStorage.print();
                    System.out.println("---------------------");
                    break;
                case "3":
                    System.out.println("Please input Employee ID");
                    String ID = scanner.nextLine();
                    employeeStorage.ID(ID);
                    break;
                case "4":
                    System.out.println("Please input empluyee COMPANY");
                    System.out.println("---------------------");
                    String empC = scanner.nextLine();
                    employeeStorage.empC(empC);
                    System.out.println("---------------------");
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
                    break;
            }
        }
    }
}
