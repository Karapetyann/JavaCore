package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;

    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }


    public Doctor getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }

    public Doctor getByProf(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(doctorProfession)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public void deleteById(Doctor doctorFromStorage) {
        for (int i = 0; i < size-1; i++) {
            if (doctors[i].equals(doctorFromStorage)) {
                for (int j = i; j < size; j++) {
                    doctors[i] = doctors[i + 1];
                }
                break;
            }
        }
        size--;
    }

}
