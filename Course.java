package student_point_system;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String symbol;
    int note;

    int verbalNote;

    public Course(String name, String code, String symbol) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.symbol.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Successful");
        } else {
            System.out.println(t.name + "can not give this course, did not match.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Teacher of lesson " + this.name + " " + courseTeacher.name);
        } else {
            System.out.println("Class "+ this.name +" does not have a teacher.");
        }
    }
}
