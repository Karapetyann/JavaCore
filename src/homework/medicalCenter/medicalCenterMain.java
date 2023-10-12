package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.util.Scanner;

public class medicalCenterMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PatientStorage patientStorage = new PatientStorage();
    private static final DoctorStorage doctorStorage = new DoctorStorage();

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
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    addPatientByDoctor();
                    break;
                case "7":
                    allPatient();
                    break;
                case "8":
                   doctorStorage.print();
                default:
                    System.out.println("Invalid comand. Try again");
            }
        }
    }



    private static void allPatient() {
        patientStorage.print();
    }

    private static void addPatientByDoctor() {
        System.out.println("please  input Doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + doctorId + " does not exists!!!");
            return;
        }
        patientStorage.printPatient(doctorFromStorage);
    }

    private static void addPatient() {
        System.out.println("please input Doctor Id");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + doctorId + " does not exists!!!");
            return;
        }
        System.out.println("please input Patient Id");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getById(patientId);
        if (patientFromStorage != null) {
            System.out.println("patient with " + patientId + "id already exists!!!");
        }
        System.out.println("please input Patient name");
        String patientName = scanner.nextLine();
        System.out.println("please input Patient surname");
        String patientSurname = scanner.nextLine();
        System.out.println("please input Patient phone number");
        String patientPhone = scanner.nextLine();
        System.out.println("please input Patient registred date time (dd/MM/yyyy)");
        String patientDate = scanner.nextLine();
        Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, patientDate, doctorFromStorage);
        patientStorage.add(patient);
        System.out.println("Patient registred");
    }

    private static void changeDoctorById() {
        System.out.println("please input Doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + doctorId + " does not exists!!!");
            return;
        }
        System.out.println("please input Doctor name");
        doctorFromStorage.setName(scanner.nextLine());
        System.out.println("please input Doctor surname");
        doctorFromStorage.setSurname(scanner.nextLine());
        System.out.println("please input Doctor phone number");
        doctorFromStorage.setPhoneNumber(scanner.nextLine());
        System.out.println("please input Doctor email");
        doctorFromStorage.setEmail(scanner.nextLine());
        System.out.println("please input Doctor profession");
        doctorFromStorage.setProfession(scanner.nextLine());
        System.out.println("Doctor registred");
    }

    private static void deleteDoctorById() {
        System.out.println("please input Doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + doctorId + " does not exists!!!");
            return;
        }
        doctorStorage.deleteById(doctorFromStorage);
        System.out.println("successfully deleted");
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input Doctor profession");
        String doctorProfession = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByProf(doctorProfession);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + doctorProfession + " does not exists!!!");
        } else {
            System.out.println(doctorFromStorage);
        }
    }

    private static void addDoctor() {
        System.out.println("please input Doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Company with " + doctorId + " already exists!!!");
            return;
        }
        System.out.println("please input Doctor name");
        String doctorName = scanner.nextLine();
        System.out.println("please input Doctor surname");
        String doctorSurname = scanner.nextLine();
        System.out.println("please input Doctor phone number");
        String doctorPhone = scanner.nextLine();
        System.out.println("please input Doctor email");
        String doctorEmail = scanner.nextLine();
        System.out.println("please input Doctor profession");
        String doctorProfession = scanner.nextLine();
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorPhone, doctorEmail, doctorProfession);
        doctorStorage.add(doctor);
        System.out.println("Doctor registred");
    }


    private static void printCommand() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD DOCTOR");
        System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 for DELETE DOCTOR BY ID");
        System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 for ADD PATIENT");
        System.out.println("Please input 6 for PRINT DOCTOR'S PATIENTS");
        System.out.println("Please input 7 for PRINT ALL PATIENT");
        System.out.println("Please input 8 for PRINT ALL DOCTORS");
    }
}

