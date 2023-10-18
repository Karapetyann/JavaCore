package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class medicalCenterMain implements Comand {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Storage doctor = new Storage();
    private static final Storage patient = new Storage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Comand.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_DOCTOR_PATIENT:
                    allPatientByDoctor();
                    break;
                case PRINT_ALL_PATIENT:
                    patient.printAllPatient();
                    break;
                case PRINT_ALL_DOCTORS:
                    doctor.printAllDoctors();
                default:
                    System.out.println("Invalid command. Try again");
            }
        }
    }


    private static void allPatientByDoctor() {
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctor1 = (Doctor) doctor.getById(doctorId);
        if (doctor1 == null) {
            System.out.println("doctor with does not exists!!!");
            return;
        }
        patient.printAllPatientByDoctor(doctor1);
    }

    private static void addPatient() throws ParseException {
        System.out.println("please input Doctor id");
        doctor.printAllDoctors();
        Doctor doctor1 = (Doctor) doctor.getById(scanner.nextLine());
        if (doctor1 == null) {
            System.out.println("doctor with does not exists!!!");
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
        System.out.println("please input Patient registred date time (dd/MM/yyyy HH/mm)");
        String arrivingTimeStr = scanner.nextLine();
        Date arrivingTime = DateUtil.stringToDate(arrivingTimeStr);
        if (patient.checkingAccuracy(doctor1, arrivingTime)) {
            System.out.println("that time already exist. tray again ");
            addPatient();
        }
        Date date = new Date();
        Patient patient2 = new Patient(patientId, patientName, patientSurname, patientPhone, date, arrivingTime, doctor1);
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


}

