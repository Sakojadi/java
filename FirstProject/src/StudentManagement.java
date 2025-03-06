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

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
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
            System.out.println("No student found with ID: " + id);
        }
    }

    public void addCourseToStudent(int id, String course) {
        Students student = students.get(id);
        if (student != null) {
            student.addCourse(course);
            System.out.println("Added course " + course + " to student ID " + id);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public void displayAllStudents() {
        students.values().stream().sorted(Comparator.comparingInt(Students::getId)).forEach(System.out::println);
    }

    public void searchStudentById(int id) {
        Students student = students.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public void listStudentsByCourse(String course) {
        System.out.println("Students enrolled in " + course + ":");
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
        
        manager.addStudent(1, "Alice", 20);
        manager.addStudent(2, "Bob", 22);
        manager.addStudent(3, "Charlie", 21);

        manager.addCourseToStudent(1, "Java Programming");
        manager.addCourseToStudent(1, "Data Structures");
        manager.addCourseToStudent(2, "Java Programming");
        manager.addCourseToStudent(3, "Algorithms");

        System.out.println("\nAll students:");
        manager.displayAllStudents();

        System.out.println("\nSearching for student with ID 2:");
        manager.searchStudentById(2);
        
        System.out.println("\nUpdating Bob's age:");
        manager.updateStudentAge(2, 23);
        manager.searchStudentById(2);

        System.out.println("\nStudents enrolled in Java Programming:");
        manager.listStudentsByCourse("Java Programming");

        System.out.println("\nRemoving student with ID 3:");
        manager.removeStudent(3);
        manager.displayAllStudents();
    }
}
