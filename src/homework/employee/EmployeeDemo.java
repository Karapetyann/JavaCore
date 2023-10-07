package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    public static void main(String[] args) {

        boolean isrun = true;


        while (isrun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    addEmplyee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input Employee by ID");
                    employeeStorage.searchEmployeeById(scanner.nextLine());
                    break;
                case "4":
                    searchCompany();
                    break;
                case "5":
                    System.out.println("Please input Delete by ID");
                    employeeStorage.deletebyId(scanner.nextLine());
                    break;
                case "6":
                    System.out.println("Please input Change employee by id");
                    employeeStorage.changeEmployeeById(scanner.nextLine());

                    break;
                default:
                    System.out.println("Invalid command. Try again!");
                    break;
            }
        }
    }

    private static void searchCompany() {
        System.out.println("Please input empluyee by COMPANY");
        System.out.println("---------------------");
        String companyName = scanner.nextLine();
        employeeStorage.searchEmployeeByCompany(companyName);
        System.out.println("---------------------");
    }

    public static void addEmplyee() {
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
    }

    private static void printCommand() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Please input 5 for DELETE EMPLUYEE BY ID");
        System.out.println("Please input 6 for CHANGE ADD EMPLOYEE");
    }
    public static void changID(){
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
        Employee employeed = new Employee(name, surname, employeeID, salary, company, position);
        employeeStorage.addid(employeed);
        System.out.println("Employee created!");
    }
}
