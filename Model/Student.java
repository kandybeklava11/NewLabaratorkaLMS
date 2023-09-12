package Model;

public class Student {
    private String StudentFirstName;
    private String StudentLastName;
    private int StudentAge;

    public Student(String studentFirstName, String studentLastName, int studentAge) {
        StudentFirstName = studentFirstName;
        StudentLastName = studentLastName;
        StudentAge = studentAge;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        StudentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Model.Student: " +
                "StudentFirstName= " + StudentFirstName +
                ", StudentLastName= " + StudentLastName +
                ", StudentAge= " + StudentAge ;
    }
}
