package university;

public class Student{
    int studentId;
    String name;
    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStudentDetails(){
        return String.format("studentId: %d student name: %s ", this.studentId, this.name);
// return this.studentId + " " + this.name;
    }


}

