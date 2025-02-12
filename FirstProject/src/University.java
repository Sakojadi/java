import java.util.Scanner;

public class University {
    Student[] students;
    int studCount;
    Course[] courses;
    int courseCount;
    public University(){
        this.students = new Student[100];
        this.courses = new Course[100];
        this.studCount = 0;
        this.courseCount = 0;
    }

    public void addStudent(String firstName, String lastName, int studentID, String major, int year){
        Student student = new Student(firstName, lastName, studentID, major, year);
        this.students[studCount] = student;
        studCount+=1;
    }

    public void addCourse(String professorName, String courseName, String courseID, int maxStrudentQuata,int credits){
        Course course = new Course(professorName, courseName, courseID, credits);
        this.courses[courseCount] = course;
        courseCount+=1;
    }
    public int findStudent(int studId){
        int st = -1;
        for(int i = 0; i< 100; i++) {
            if (students[i] != null) {
                if (students[i].getStudentID() == studId) {
                    st = i;
                }
            }
        }
        return st;
    }

    public int findCourse(String courseId){
        int cr = -1;
        for(int i = 0; i<100; i++){
            if(courses[i]!=null){
                if(courses[i].getCourseID().equals(courseId)){
                    cr = i;
                }
            }
        }
        return cr;
    }

    public void registerToCourse(int studId, String courseID){
        int st = findCourse(courseID);
        int cr = findStudent(studId);
        if(st == -1 || cr == -1) {
            System.out.println("Invalid ID's");
        }
        else{
            int t = students[st].addCourse(courses[cr]);
            if(t == 0){
                courses[cr].addStudent(students[st]);
                System.out.println("Yay added student: " + students[st].getFirstName() + "to course" + courses[cr].getCourseName());
            }
            else{
                System.out.println("Couldnt do it");
            }

        }
    }
    public void listAllForStud(int studId){
        students[findStudent(studId)].getCourseList();
    }
    public void listAllForCourse(String courseId){
        courses[findCourse(courseId)].getStudentList();
    }

}




class Student{
    private String firstName;
    private String lastName;
    private int studentID;
    private String major;
    private int year;
    private Course[] courseList;
    private int courseCount;
    private int maxCredit;

    private String[] course;
    public Student(String firstName, String lastName, int studentID, String major, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.major = major;
        this.year = year;
        this.courseList = new Course[10];
        this.maxCredit = 0;
        this.courseCount = 0;
    }

    public int addCourse(Course course){
        int cred = course.getCredits();
        if (maxCredit+cred>12 && course.getStudCount()>100){
            return 1;
        }
        else {
            maxCredit+=cred;
            courseList[courseCount] = course;
            courseCount += 1;
            return 0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void getCourseList() {
        for(Course i: courseList){
            if(i!=null) {
                System.out.println(i.getCourseName());
            }
        }
    }

    public int getCourseCount() {
        return courseCount;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    public String[] getCourse() {
        return course;
    }

}



class Course{
    private String professorName;
    private String courseName;
    private String courseID;
    private Student[] studentList;
    private int studCount;
    private int credits;

    public Course(String professorName, String courseName, String courseID,int credits){
        this.professorName = professorName;
        this.courseName = courseName;
        this.courseID = courseID;
        this.studentList = new Student[100];
        this.credits = credits;
        this.studCount = 0;
    }

    public int addStudent(Student student){
        if(studCount>100) {
            this.studentList[studCount] = student;
            studCount += 1;
            return 0;
        }
        else{
            return 1;
        }
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void getStudentList() {
        for(Student i: studentList){
            if(i!=null){
                System.out.println(i.getFirstName());
            }
        }
    }

    public int getStudCount() {
        return studCount;
    }

    public int getCredits() {
        return credits;
    }
}


class MainUni{
    public static void main(String[] args) {
        University uni = new University();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1. Add a Student\n2. Add a course\n3. Register a Student for a course\n4. List all courses\n5. List all Students in a Course\n6. Exit");
            int c = scan.nextInt();
            scan.nextLine();
            int studID;
            String courseID;
            switch(c){
                case 1:
                    System.out.println("Enter the first name: ");
                    String fname = scan.nextLine();
                    System.out.println("Enter the first name: ");
                    System.out.println("Enter the first name: ");
                    System.out.println("Enter the first name: ");
                    System.out.println("Enter the first name: ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
