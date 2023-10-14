package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

import java.util.Scanner;

public class medicalCenterMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Storage doctor = new Storage();
    private static final Storage patient = new Storage();

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
                    allPatientByDoctor();
                    break;
                case "7":
                    patient.printAllPatient();
                    break;
                case "8":
                    doctor.printAllDoctors();
                default:
                    System.out.println("Invalid comand. Try again");
            }
        }
    }


    private static void allPatientByDoctor() {
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctor1 = (Doctor) doctor.getById(doctorId);
        if (doctor1 == null) {
            System.out.println("doctor with " + doctor1 + " does not exists!!!");
            return;
        }
        patient.printAllPatientByDoctor(doctor1);
    }

    private static void addPatient() {
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        Doctor doctor1 = (Doctor) doctor.getById(scanner.nextLine());
        if (doctor1 == null) {
            System.out.println("doctor with " + doctor1 + " does not exists!!!");
            return;
        }
        System.out.println("please input Patient id");
        patient.printAllPatient();
        String patientId = scanner.nextLine();
        Patient patient1 = (Patient) patient.getById(patientId);
        if (patient1 != null) {
            System.out.println("patient with " + patientId + "id already exists!!!");
            return;
        }
        System.out.println("please input Patient name");
        String patientName = scanner.nextLine();
        System.out.println("please input Patient surname");
        String patientSurname = scanner.nextLine();
        System.out.println("please input Patient phone number");
        String patientPhone = scanner.nextLine();
        System.out.println("please input Patient registred date time (dd/MM/yyyy)");
        String patientDate = scanner.nextLine();
        Patient patient2 = new Patient(patientId, patientName, patientSurname, patientPhone, patientDate, doctor1);
        patient.add(patient2);
        System.out.println("Patient registred");


    }

    private static void changeDoctorById() {
        System.out.println("please input Doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = (Doctor) doctor.getById(doctorId);
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
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctor1 = (Doctor) doctor.getById(doctorId);
        doctor.deleteById(doctor1);
        doctor.printAllDoctors();
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input Doctor profession");
        doctor.printAllDoctors();
        String doctorProfession = scanner.nextLine();
        doctor.getByProf(doctorProfession);
    }

    private static void addDoctor() {
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctor1 = (Doctor) doctor.getById(doctorId);
        if (doctor1 != null) {
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
        Doctor doctor2 = new Doctor(doctorId, doctorName, doctorSurname, doctorPhone, doctorEmail, doctorProfession);
        doctor.add(doctor2);
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

