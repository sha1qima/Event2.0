public class Attendee {
    
    private String name;
    private char gender;
    private String email;
    private int age;
    private String seatNo;
    
    public Attendee(String name, char gender, String email, int age, String seat) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        seatNo = seat;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seat) {
        seatNo = seat;
    }

    @Override
    public String toString() {
        return "Attendee [name=" + name + ", gender=" + gender + ", email=" + email + ", age=" + age + ", seat No."
                + seatNo + "]";
    }
}