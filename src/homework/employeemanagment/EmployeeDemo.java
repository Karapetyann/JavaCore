package homework.employeemanagment;

import homework.employeemanagment.model.Company;
import homework.employeemanagment.model.Employee;
import homework.employeemanagment.storage.CompanyStorage;
import homework.employeemanagment.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    employeeStorage.print();
                    break;
                case "5":
                    searchEmployeeByid();
                    break;
                case "6":
                    searchEmployeeByCompany();
                    break;
                case "7":
                    deleteCompany();
                    break;
                case "8":
                    deleteEmployee();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changeEmployee();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
                    break;
            }
        }
    }

    private static void changeEmployee() {
        System.out.println("Please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee with " + employeeId + "id does not exists!!!");
            return;
        }
        System.out.println("please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("please input employee surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("please input employee phone");
        String employeePhone = scanner.nextLine();
        System.out.println("please input employee position");
        String employeePosition = scanner.nextLine();
        System.out.println("please input employee salary AMD");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        employeeFromStorage.setName(employeeName);
        employeeFromStorage.setSurname(employeeSurname);
        employeeFromStorage.setPosition(employeePosition);
        employeeFromStorage.setSalary(employeeSalary);
        employeeFromStorage.setPhone(employeePhone);
        System.out.println("Employee updated");
    }

    private static void changeCompany() {
        System.out.println("Please input company id");
        String companyid = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyid);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyid + " does not exists!!!");
            return;
        }
        System.out.println("please input new company name");
        String companyName = scanner.nextLine();
        System.out.println("please input new company addres");
        String companyAddres = scanner.nextLine();
        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddres);
        System.out.println("company updated");
    }

    private static void deleteEmployee() {
        System.out.println("Please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);

        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee does not exists!!!");
            return;
        }
        if (!employeeFromStorage.getCompany().equals(companyFromStorage)) {
            System.out.println("Wrong employee id");
            return;
        }
        employeeStorage.deleteById(employeeId);
    }

    private static void deleteCompany() {
        System.out.println("Please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        companyStorage.deleteById(companyId);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
    }

    private static void searchEmployeeByid() {
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee byId = employeeStorage.getById(employeeId);
        if (byId == null) {
            System.out.println("Employee does not exists");
        } else {
            System.out.println(byId);
        }
    }

    private static void addEmployee() {
        System.out.println("Please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage != null) {
            System.out.println("employee with " + employeeId + "id already exists!!!");
            return;
        }
        System.out.println("please input employee name");
        String employeeNmae = scanner.nextLine();
        System.out.println("please input employee surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("please input employee phone");
        String employeePhone = scanner.nextLine();
        System.out.println("please input employee position");
        String employeePosition = scanner.nextLine();
        System.out.println("please input employee salary AMD");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeId, employeeNmae, employeeSurname, employeePhone, employeeSalary, employeePosition, companyFromStorage);
        employeeStorage.add(employee);
        System.out.println("Employee registred");
    }

    private static void addCompany() {
        System.out.println("Please input company id");
        String companyid = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyid);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyid + " already exists!!!");
            return;
        }
        System.out.println("please input company name");
        String companyName = scanner.nextLine();
        System.out.println("please input company addres");
        String companyAddres = scanner.nextLine();
        Company company = new Company(companyid, companyName, companyAddres);
        companyStorage.add(company);
        System.out.println("company registred");
    }

    private static void printCommand() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD COMPANY");
        System.out.println("Please input 2 for ADD EMPLOYEE");
        System.out.println("Please input 3 for PRINT ALL COMPANIES");
        System.out.println("Please input 4 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 5 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 6 for SEARCH EMPLOYEE BY COMPANY");
        System.out.println("Please input 7 for DELETE COMPANY");
        System.out.println("Please input 8 for DELETE EMPLOYEE");
        System.out.println("Please input 9 for CHANGE COMPANY");
        System.out.println("Please input 10 for CHANGE EMPLOYEE");
    }

}
