package homework.medicalCenter.model;

public class Patient extends Person {
    private String registerDateTime;
    private Doctor doctor;

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }


    public Patient(String id, String name, String surname, String phoneNumber, String registerDateTime, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "registerDateTime='" + registerDateTime + '\'' +
                ", doctor=" + doctor +
                "} " + super.toString();
    }
}
