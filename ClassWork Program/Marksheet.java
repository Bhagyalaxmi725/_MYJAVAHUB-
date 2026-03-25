// Base class
class Student {
    int rollNo;
    String name;

    void getStudentData(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayStudentData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
    }
}

// Derived class
class Marksheet extends Student {
    int marks1, marks2, marks3;
    int total;
    float percentage;

    void getMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculate() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0f;
    }

    void displayMarksheet() {
        displayStudentData();
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage);
    }

    public static void main(String[] args) {
        Marksheet m = new Marksheet();
        m.getStudentData(101, "Ravi");
        m.getMarks(75, 80, 85);
        m.calculate();
        m.displayMarksheet();
    }
}
