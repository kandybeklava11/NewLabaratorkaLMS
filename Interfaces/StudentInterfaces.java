package Interfaces;

import Model.Group;
import Model.Student;

import java.util.List;

public interface StudentInterfaces {
    List<Group> getAllStudents(List<Group>groups);
    void addNewStudentToGroup(List<Group> groups);
    void FindStudentByFirstName(List<Group> groups);
    void GetAllStudentsLesson(List<Group> groups);
    void updateStudent(List<Group> groups);
    void deleteStudent(List<Group> groups);
}
