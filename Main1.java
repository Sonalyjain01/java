
    import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + "\n" +
               "ID: " + id + "\n" +
               "Grade: " + grade + "\n";
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void updateGrade(int id, double grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setGrade(grade);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void printAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("1. Add student\n2. Remove student\n3. Update grade\n4. Print all students\n5. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                sms.addStudent(new Student(name, id, grade));
            } else if (choice == 2) {
                System.out.print("Enter student ID: ");
              Integer id = scanner.nextInt();
                sms.removeStudent(id);
            } else if (choice == 3) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter new grade: ");
                Double grade = scanner.nextDouble();
                sms.updateGrade(id, grade);
            } else if (choice == 4) {
                sms.printAllStudents();
            } else if (choice == 5) {
                break;
            }
        }
    }
}


