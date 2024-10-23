public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;


    public Student(){
        studentId = "";
        firstName = "";
        lastName = "";
        age = 0;
        major = "";
    }

    public Student(String studentId, String firstName, String lastName, int age, String major){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String getStudentId(){
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Major: " + major;
    }
}
