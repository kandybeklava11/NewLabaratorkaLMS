package Interfaces;

import Model.Group;
import Model.Student;

import java.util.List;

public interface GroupInterfaces {
List<Group>getAllGroups( List<Group>groups);
    void addNewGroup(List<Group> groups);
    void getGroupByName(List<Group> groups);
    void updateGroupName(List<Group> groups);
    void deleteGroupByName(List<Group> groups);
    void GetAllStudentsByGroupName(List<Group> groups);

}
