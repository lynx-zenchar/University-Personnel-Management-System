public class Course {
  private String name;
  private String code;
  private Professor instructor;
  private Student[] enrolledStudents = new Student[50];
  private int studentCount = 0;

  public Course(String name, String code, Professor instructor){
    this.name = name;
    this.code = code;
    this.instructor = instructor;
  }

  public String getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  public Professor getInstructor(){
    return instructor;
  }

  public void addStudent(Student s){
    if(studentCount < 50){
      enrolledStudents[studentCount++] = s;
    }
  }

  public void removeStudent(Student s){
    for(int i = 0; i < studentCount; i++){
      if( enrolledStudents[i].equals(s)){
        // shift all elements to the left
        for (int j = 1; j < studentCount -1; i++){
          enrolledStudents[j] = enrolledStudents[j + 1];
        }
        studentCount--;
        break;
      }
    }
  }

}
