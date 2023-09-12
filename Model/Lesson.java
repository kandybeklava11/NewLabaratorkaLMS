package Model;

public class Lesson {
    private String LessonName;

    public Lesson(String lessonName) {
        LessonName = lessonName;
    }

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String lessonName) {
        LessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Model.Lesson:" +
                "LessonName= " + LessonName ;
    }
}
