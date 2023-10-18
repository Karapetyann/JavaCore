package homework.medicalCenter.model;

import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class Patient extends Person {
    private Date registerDateTime;
    private Date arrivingTime;
    private Doctor doctor;


    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Date getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(Date arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient(String id, String name, String surname, String phoneNumber, Date registerDateTime, Date arrivingTime, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.arrivingTime = arrivingTime;
        this.doctor = doctor;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "registerDateTime=" + DateUtil.dateToString(registerDateTime) +
                ", arrivingTime=" + DateUtil.dateToString(arrivingTime) +
                ", doctor=" + doctor +
                "} " + super.toString();
    }
}
