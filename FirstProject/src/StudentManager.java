import java.util.*;

class Students {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addCourse(String course) {
        courses.add(course);
    }
    public String toString() {
        return "\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nCourses: " + courses ;
    }
}

public class StudentManager {
    private HashMap<Integer, Students> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public void addStudent(int id, String name, int age) {
        if (students.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists.");
            return;
        }
        students.put(id, new Students(id, name, age));
        System.out.println("Added student: " + name);
    }

    public void removeStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Removed student with ID: " + id);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public void updateStudentName(int id, String name) {
        Students student = students.get(id);
        if (student != null) {
            student.setName(name);
            System.out.println("Updated name to: " + name);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public void updateStudentAge(int id, int age) {
        Students student = students.get(id);
        if (student != null) {
            student.setAge(age);
            System.out.println("Updated age to: " + age);
        } else {
            System.out.println("No student found with ID: " +id);
        }
    }

    public void addCourseToStudent(int id, String course) {
        Students student = students.get(id);
        if (student != null) {
            student.addCourse(course);
            System.out.println("Added course "+ course+" to student ID " +id);
        } else {
            System.out.println("No student found with ID: "+ id);
        }
    }

    public void displayAllStudents() {
        for(Students i: students.values()){
            System.out.println(i.toString());
        }
    }

    public void searchStudentById(int id) {
        Students student = students.get(id);
        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public void listStudentsByCourse(String course) {
        System.out.println("Students enrolled in " +course + ":");
        for (Students student : students.values()) {
            if (student.getCourses().contains(course)) {
                System.out.println(student.getName());
            }
        }
    }
}

class MainStudent {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        
        manager.addStudent(3, "Alice", 20);
        manager.addStudent(2, "Bob", 22);
        manager.addStudent(1, "Charlie", 21);

        manager.addCourseToStudent(3, "Java Programming");
        manager.addCourseToStudent(3, "Data Structures");
        manager.addCourseToStudent(2, "Java Programming");
        manager.addCourseToStudent(1, "Algorithms");

        manager.displayAllStudents();
        manager.searchStudentById(2);
        
        manager.updateStudentAge(2, 23);
        manager.searchStudentById(2);

        manager.listStudentsByCourse("Java Programming");

        manager.removeStudent(3);
        manager.displayAllStudents();
    }
}
