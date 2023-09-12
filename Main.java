import Model.Group;
import Model.Lesson;
import Model.Student;
import Services.Methoods;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Muktar", "Nurpazyl Uulu", 17));
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Zalkar", "Mamanov", 16));
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(new Student("Erkin", "Toigonbaev", 21));

        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("Verable"));
        List<Lesson> lessonList2 = new ArrayList<>();
        lessonList2.add(new Lesson("Mathod"));
        List<Lesson> lessonList3 = new ArrayList<>();
        lessonList3.add(new Lesson("HashSet"));

        List<Student>s=new ArrayList<>();
        s.addAll( studentList);
        s.addAll( studentList2);
        s.addAll( studentList3);

        List<Lesson>l=new ArrayList<>();
        l.addAll(lessonList);
        l.addAll(lessonList2);
        l.addAll(lessonList3);


        List<Group> groupList = new ArrayList<>();
        groupList.add(new Group("Java 11", studentList, lessonList));
        groupList.add(new Group("Java 10", studentList2, lessonList2));
        groupList.add(new Group("Java 9", studentList3, lessonList3));



        System.out.print(LocalDate.now()+";"+"\n"+ LocalTime.now()+";"+"\n");
                        int choise = 0;
                        do {
                            System.out.println("\n"+"Please selects choice\uD83D\uDC47" + "\n" + "\n" +
                                    "1 .\uD83D\uDC49Add new group" + "\n" +
                                    "2 .\uD83D\uDC49Get group by name" + "\n" +
                                    "3 .\uD83D\uDC49Update group name" + "\n" +
                                    "4 .\uD83D\uDC49Get all groups" + "\n" +
                                    "5 .\uD83D\uDC49Add new student to group" + "\n" +
                                    "6 .\uD83D\uDC49Update student" + "\n" +
                                    "7 .\uD83D\uDC49Find student by first name" + "\n" +
                                    "8 .\uD83D\uDC49Get all student by group name" + "\n" +
                                    "9 .\uD83D\uDC49Get all student's lesson" + "\n" +
                                    "10.\uD83D\uDC49Delete student" + "\n" +
                                    "11.\uD83D\uDC49Add new lesson to group" + "\n" +
                                    "12.\uD83D\uDC49Get lesson by name" + "\n" +
                                    "13.\uD83D\uDC49Get all lesson by group name" + "\n" +
                                    "14.\uD83D\uDC49Delete lesson" + "\n" +
                                    "15.\uD83D\uDC49Delete group"+"\n" +
                                    "16.\uD83D\uDC49Get all lessons"+"\n"+
                                    "17.\uD83D\uDC49Get all students"+"\n"+
                                    "18.\uD83D\uDC49Exit");


                            Methoods methoods =new Methoods();
                            choise = scanner.nextInt();
                            switch (choise){
                                case 1:
                                    methoods.addNewGroup(groupList);
                                    break;
                                case 2:
                                    methoods.getGroupByName(groupList);
                                    break;
                                case 3:
                                    methoods.updateGroupName(groupList);
                                    break;
                                case 4:
                                    methoods.getAllGroups(groupList);
                                    break;
                                case 5:
                                    methoods.addNewStudentToGroup(groupList);
                                    break;
                                case 6:
                                    methoods.updateStudent(groupList);
                                    break;
                                case 7:
                                    methoods.FindStudentByFirstName(groupList);
                                    break;
                                case 8:
                                    methoods.GetAllStudentsByGroupName(groupList);
                                    break;
                                case 9:
                                    methoods.GetAllStudentsLesson(groupList);
                                    break;
                                case 10:
                                    methoods.deleteStudent(groupList);
                                    break;
                                case 11:
                                    methoods.addNewLessonToGroup(groupList);
                                    break;
                                case 12:
                                    methoods.GetLessonByName(groupList);
                                    break;
                                case 13:
                                    methoods.GetAllLessonByGroupName(groupList);
                                    break;
                                case 14:
                                    methoods.deleteLesson(groupList);
                                    break;
                                case 15:
                                    methoods.deleteGroupByName(groupList);
                                    break;
                                case 16:
                                    methoods.getAllLessons(groupList);
                                    break;
                                case 17:
                                    methoods.getAllStudents(groupList);
                                    break;
                                case 18:
                                    System.out.println("Exiting...");
                                    break;
                                default:
                                    System.out.println("err");
                                    break;
                            }
                        }while (choise!=18);

        }

    }
