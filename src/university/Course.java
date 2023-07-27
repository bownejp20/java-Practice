package university;

public class Course{
    int courseId;
    String courseName;


    public Course(int courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public int getCourseId(){
        return this.courseId;
    }
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseDetails(){
        return String.format("CourseId: %d Course Name : %s", this.courseId, this.courseName);
    }
}

