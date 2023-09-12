package Model;

import java.security.SecureRandom;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;
    private List<Lesson> lessons;

    public Group(String groupName, List<Student> students, List<Lesson> lessons) {
        this.groupName = groupName;
        this.students = students;
        this.lessons = lessons;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Group: " +
                "groupName= " + groupName +
                "\nstudents= " + students +
                "\nlessons= " + lessons +"\n";
    }
}
