package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class Storage {
    private Person[] persons = new Person[10];
    private int size;

    public void add(Person patient) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = patient;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }


    public Person getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (persons[i].getId().equals(doctorId)) {
                return persons[i];
            }
        }
        return null;
    }

    public void getByProf(String doctorProfession) {
        if (persons[0] instanceof Doctor) {
            for (int i = 0; i < size; i++) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getProfession().equals(doctorProfession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void printAllDoctors() {
        if (persons[0] instanceof Doctor) {
            for (int i = 0; i < size; i++) {
                Doctor doctor = (Doctor) persons[i];
                System.out.println(doctor);
            }
        }
    }

    public void deleteById(Person doctorFromStorage) {
        for (int i = 0; i < size - 1; i++) {
            if (persons[i].getId().equals(doctorFromStorage.getId())) {
                for (int j = i; j < size; j++) {
                    persons[i] = persons[i + 1];
                }
                break;
            }
        }
        size--;
    }

    public void printAllPatientByDoctor(Doctor doctor) {
        if (persons[0] instanceof Patient) {
            for (int i = 0; i < size; i++) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printAllPatient() {
        if (persons[0] instanceof Patient) {
            for (int i = 0; i < size; i++) {
                Patient patient = (Patient) persons[i];
                System.out.println(patient);
            }
        }
    }


    public boolean checkingAccuracy(Doctor doctor, Date arrivingTime) {
        for (int i = size; i > 0; i++) {
            if (persons[i] instanceof Patient) {
                if (((Patient) persons[i]).getDoctor() == doctor) {
                    Patient patient = (Patient) persons[i];
                    if (DateUtil.byMinut(patient.getArrivingTime()) - DateUtil.byMinut(arrivingTime) < 30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
