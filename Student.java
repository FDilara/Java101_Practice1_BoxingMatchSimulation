package student_point_system;

public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        averageCalculation();
        this.isPass = false;
    }


    public void addExamNote(int math, int mathVerbal, int physics, int physicsVerbal, int chemical, int chemicalVerbal) {

        if (math >= 0 && math <= 100 && mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.note = math;
            this.math.verbalNote = mathVerbal;
        }

        if (physics >= 0 && physics <= 100 && physicsVerbal >= 0 && physicsVerbal <= 100) {
            this.physics.note = physics;
            this.physics.verbalNote = physicsVerbal;
        }

        if (chemical >= 0 && chemical <= 100 && chemicalVerbal >= 0 && chemicalVerbal <= 100) {
            this.chemical.note = chemical;
            this.physics.verbalNote = chemicalVerbal;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0) {
            System.out.println("Did not enter all notes");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void averageCalculation() {
        this.average = ((this.physics.note + this.chemical.note + this.math.note) * 0.80)
                       + (((this.physics.verbalNote + this.chemical.verbalNote + this.math.verbalNote))* 0.20);
    }

    public boolean isCheckPass() {
        averageCalculation();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematical Note: " + this.math.note);
        System.out.println("Physics Note : " + this.physics.note);
        System.out.println("Chemical Note : " + this.chemical.note);
    }

}
