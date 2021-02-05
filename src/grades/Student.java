package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    //Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setName (String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName(String name) {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student brandon = new Student("Brandon");
        System.out.println(brandon.name);
        brandon.addGrade(100);
        brandon.addGrade(95);
        brandon.addGrade(80);
        System.out.println(brandon.getGradeAverage());

    }

}
