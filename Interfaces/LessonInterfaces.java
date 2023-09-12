package Interfaces;

import Model.Group;
import Model.Lesson;
import Model.Student;

import java.util.List;

public interface LessonInterfaces {
    List<Group> getAllLessons(List<Group>groups);
    void addNewLessonToGroup(List<Group> groups);
    void GetLessonByName(List<Group> groups);
    void GetAllLessonByGroupName(List<Group> groups);
    void deleteLesson(List<Group> groups);
}
