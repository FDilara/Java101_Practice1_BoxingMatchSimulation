package student_point_system;

public class StudentPointSystem {
    public static void main(String[] args) {

        Course math = new Course("Mathematical", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemical = new Course("Chemical", "CHE101", "CHC");

        Teacher t1 = new Teacher("Ahmet Teacher", "000001", "MATH");
        Teacher t2 = new Teacher("Fatma Teacher", "000002", "PHY");
        Teacher t3 = new Teacher("Ali Teacher", "000003", "CHC");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("Ayşe", 4, "1234567", math, physics, chemical);
        s1.addExamNote(50,60, 20, 50, 40, 50);
        s1.isPass();

        Student s2 = new Student("Hatice", 4, "1234568", math, physics, chemical);
        s2.addExamNote(100, 80,50,45, 40, 80);
        s2.isPass();

        Student s3 = new Student("Sare", 4, "1234569", math, physics, chemical);
        s3.addExamNote(50, 70, 20,40, 40, 60);
        s3.isPass();

    }
}
