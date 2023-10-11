package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;

    }

    public Patient getById(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return patients[i];
            }
        }
        return null;
    }

    public void printPatient(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorFromStorage)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }
}
