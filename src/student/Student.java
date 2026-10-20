package student;

public class Student {
    private final String studentId;
    private String fullName;
    private String email;

    public Student(String studentId, String fullName, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
    }

    // display profile method
    public void displayProfile() {
        System.out.println("[Student Profile] ID: " + studentId + " | Name: " + fullName + " | Email: " + email);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
