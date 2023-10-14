package homework.medicalCenter.model;

public class Doctor extends Person {
    private String email;
    private String profession;

    public String getEmail() {
        return email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                "} " + super.toString();
    }
}
