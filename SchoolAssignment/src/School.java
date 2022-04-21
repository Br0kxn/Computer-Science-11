import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private String schoolType;
    private static int schoolNumber;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, String schoolName, String schoolType) {
        this.teachers = teachers;
        this.students = students;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        schoolNumber++;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public static int getSchoolNumber() {
        return schoolNumber;
    }

    public static void setSchoolNumber(int schoolNumber) {
        School.schoolNumber = schoolNumber;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addTeacher(Teacher add){
        teachers.add(add);
    }

    public void addStudent(Student add){
        students.add(add);
    }

    public void removeTeacher(Teacher delete){
        teachers.remove(delete);
    }
    public void removeStudent(Student delete){
        students.remove(delete);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void showTeachers(){
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }

    public void showStudents(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

}
