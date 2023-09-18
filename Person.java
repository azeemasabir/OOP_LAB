package lab03;

public class Person {
    private String name;
    private String gender;
    private String nationality;
    private Date debutYear;

    public Person(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getDebutYear() {
        return debutYear;
    }

    // toString method
    @Override

    public String toString() {
        return String.format("Name: %s\nGender: %s\nNationality: %s\nDebut Year: %s",
                name, gender, nationality, debutYear);
    }

}
