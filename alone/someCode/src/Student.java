public class Student {
    private int age = 0;
    private int course = 0;
    private String name = "";
    public boolean isHeadGroup = false;
    public Student(String name, int age, int course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String isHead(Student student){
        if(student.isHeadGroup){
            return student.toString();
        }
        return null;
    }
    public void getHeadGroup(){
        this.isHeadGroup = true;
    }

    @Override
    public String toString() {
        return "Name - " + name + ". Age - " + age+ ". Course " + course+ ". Head? " + isHeadGroup;
    }
}
