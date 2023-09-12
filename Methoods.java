package Services;

import Interfaces.GroupInterfaces;
import Interfaces.LessonInterfaces;
import Interfaces.StudentInterfaces;
import Model.Group;
import Model.Lesson;
import Model.Student;

import javax.crypto.spec.PSource;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Methoods implements GroupInterfaces,LessonInterfaces, StudentInterfaces {
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Group> getAllGroups(List<Group> groups) {
        for (Group group : groups) {
            System.out.println(group);
        }
        return groups;
    }

    @Override
    public void addNewGroup(List<Group> groups) {
        System.out.println("Write the new group's name:");
        String newGroupName = scanner.nextLine();

        List<Student> students = new ArrayList<>();
        List<Lesson> lessons = new ArrayList<>();

        Group group = new Group(newGroupName, students, lessons);
        groups.add(group);

        System.out.println("New group added successfully.");
        System.out.println("Group Name: " + group.getGroupName());
    }


    @Override
    public void getGroupByName(List<Group> groups) {
        System.out.println("Write the group's name:");
        String searchQuery = scanner.nextLine();
        List<Group> foundGroups = new ArrayList<>();

        for (Group group : groups) {
            if (group.getGroupName().toLowerCase().contains(searchQuery.toLowerCase())) {
                foundGroups.add(group);
            }
        }

        if (foundGroups.isEmpty()) {
            System.out.println("No groups found with the specified query.");
        } else {
            System.out.println("Search results:");
            for (Group group : foundGroups) {
                System.out.println(group);
            }
        }
    }

    @Override
    public void updateGroupName(List<Group> groups) {
        System.out.println("Write the group's name to update:");
        String searchQuery = scanner.nextLine();

        for (Group group : groups) {
            if (group.getGroupName().toLowerCase().equals(searchQuery.toLowerCase())) {
                System.out.println("Write the new name for the group:");
                String newGroupName = scanner.nextLine();
                group.setGroupName(newGroupName);
                System.out.println("Group name updated.");
                return;
            }
        }

        System.out.println("Group not found.");
    }


    @Override
    public void deleteGroupByName(List<Group> groups) {
        System.out.println("Write the group's name to delete:");
        String searchQuery = scanner.nextLine();

        for (Iterator<Group> iterator = groups.iterator(); iterator.hasNext(); ) {
            Group group = iterator.next();
            if (group.getGroupName().toLowerCase().equals(searchQuery.toLowerCase())) {
                iterator.remove();
                System.out.println("Group deleted.");
                return;
            }
        }

        System.out.println("Group not found.");
    }

    @Override
    public void GetAllStudentsByGroupName(List<Group> groups) {
        System.out.println("Write the group's name:");
        String searchQuery = scanner.nextLine();

        for (Group group : groups) {
            if (group.getGroupName().toLowerCase().equals(searchQuery.toLowerCase())) {
                List<Student> students = group.getStudents();
                if (students.isEmpty()) {
                    System.out.println("No students found in the group.");
                } else {
                    System.out.println("Students in the group:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
                return;
            }
        }
        System.out.println("Group not found.");
    }

    @Override
    public List<Group> getAllLessons(List<Group> groups) {
        for (Group group : groups) {
            group.getLessons();
            System.out.println(group);
        }
        return groups;
    }

    @Override
    public void addNewLessonToGroup(List<Group> groups) {
        System.out.println("Write the group to add the lesson:");
        String groupName = scanner.nextLine();

        boolean groupFound = false;

        for (Group group : groups) {
            if (groupName.equalsIgnoreCase(group.getGroupName())) {
                groupFound = true;
                System.out.println("Write the new lesson's name:");
                String newLessonName = scanner.nextLine();

                Lesson newLesson = new Lesson(newLessonName);

                List<Lesson> groupLessons = group.getLessons();
                if (groupLessons == null) {
                    groupLessons = new ArrayList<>();
                    group.setLessons(groupLessons);
                }

                groupLessons.add(newLesson);

                System.out.println("Successfully added lesson to " + groupName);
                break;
            }
        }

        if (!groupFound) {
            System.out.println("Group with the name " + groupName + " not found.");
        }
    }

    @Override
    public void GetLessonByName(List<Group> groups) {
        System.out.println("Write the lesson's name:");
        String searchQuery = scanner.nextLine();

        for (Group group : groups) {
            List<Lesson> lessons = group.getLessons();
            for (Lesson lesson : lessons) {
                if (lesson.getLessonName().equalsIgnoreCase(searchQuery)) {
                    System.out.println("Lesson found in group: " + group.getGroupName());
                    System.out.println(lesson.toString());
                    return;
                }
            }
        }

        System.out.println("Lesson not found.");
    }


    @Override
    public void GetAllLessonByGroupName(List<Group> groups) {
        System.out.println("write group's name");
        String groupName = scanner.nextLine();
        for (Group groo : groups) {
            if (!groupName.equals(groo.getGroupName())) {
                System.out.println("Not found");
            } else {
                System.out.println(groo.getLessons());
            }
        }
    }


    @Override
    public void deleteLesson(List<Group> groups) {
        System.out.println("Write lesson's name:");
        String lessonName = scanner.nextLine();
        boolean lessonFound = false;

        for (Group group : groups) {
            List<Lesson> lessons = group.getLessons();
            Iterator<Lesson> iterator = lessons.iterator();

            while (iterator.hasNext()) {
                Lesson lesson = iterator.next();
                if (lesson.getLessonName().equalsIgnoreCase(lessonName)) {
                    iterator.remove();
                    lessonFound = true;
                    System.out.println("Lesson deleted: " + lesson);
                    break;
                }
            }

            if (lessonFound) {
                break; // Если урок найден и удален, выходим из цикла по группам
            }
        }

        if (!lessonFound) {
            System.out.println("Lesson not found.");
        }
    }

    @Override
    public List<Group> getAllStudents(List<Group> groups) {
        for (Group groo:groups) {
            System.out.println("Students"+groo.getStudents());
        }
        return groups;
    }

    @Override
    public void addNewStudentToGroup(List<Group> groups) {
        System.out.println(" Write group's name to add new student");
        String searchGroup = scanner.nextLine();
        boolean stuFound = false;
        for (Group groo : groups) {
            if (groo.getGroupName().equalsIgnoreCase(searchGroup)) {
                stuFound = true;
                System.out.println("Write new student's first name");
                String newStuFirsName = scanner.nextLine();
                System.out.println("Write new student's last name");
                String newStuLastName = scanner.nextLine();
                System.out.println("Write new student's age");
                int newStuAge = scanner.nextInt();
                Student student = new Student(newStuFirsName, newStuLastName, newStuAge);
                groo.getStudents().add(student);
                System.out.println(" New student:" + " First name=" + newStuFirsName + ";  Last name=" + newStuLastName + ";  Age=" + newStuAge + ", Successfully added to droup " + searchGroup);
            }
        }
        if (!stuFound) {
            System.out.println(" Not found");
        }
    }


    @Override
    public void FindStudentByFirstName(List<Group> groups) {
        System.out.println(" write student's first name");
        String foundStedent = scanner.nextLine();
        for (Group groo : groups) {
            List<Student> students = groo.getStudents();
            for (Student stuu : students) {
                if (!stuu.getStudentFirstName().equalsIgnoreCase(foundStedent)) {
                    System.out.println(" Not found");
                } else {
                    System.out.println(stuu);
                }
            }
        }
    }

    @Override
    public void GetAllStudentsLesson(List<Group> groups) {
        System.out.println(" Write correct student's name to get all student's lesson");

        String stuName = scanner.nextLine();
        boolean found = false;

        for (Group group : groups) {
            List<Student> students = group.getStudents();
            for (Student student : students) {
                if (student.getStudentFirstName().equalsIgnoreCase(stuName)) {
                    System.out.println("Student: " + student.getStudentFirstName() + " " + student.getStudentLastName());
                    System.out.println("Lessons: " + group.getLessons());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }


    @Override
    public void updateStudent(List<Group> groups) {
        System.out.println("Updated Successfully");
        for (Group group : groups) {
            List<Student>students=group.getStudents();
            for (Student stuu:students)
                System.out.println(stuu);
            }
        }



    @Override
    public void deleteStudent(List<Group> groups) {
        System.out.println("Write the student's name:");
        String studentName = scanner.nextLine();
        boolean studentFound = false;

        for (Group group : groups) {
            List<Student> students = group.getStudents();
            Iterator<Student> iterator = students.iterator();

            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getStudentFirstName().equalsIgnoreCase(studentName)) {
                    iterator.remove();
                    studentFound = true;
                    System.out.println("Student deleted: " + student);
                    break;
                }
            }

            if (studentFound) {
                break; // Если студент найден и удален, выходим из цикла по группам
            }
        }

        if (!studentFound) {
            System.out.println("Student not found.");
        }
    }
}

