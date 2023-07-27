package university;

public class Enrollment{
    Student student;
    Course course;


    public Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
    }
    public Student getStudent(){
        return this.student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Course getCourse(){
        return this.course;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public String getEnrollmentDetails(){
        return String.format("Student: %s, Course: %s", this.student.getName(), this.course.getCourseName());
    }
}

