
public class Main{
  public static void main(String[] args){
    // create prof object
    // im assuming id is netid
    Professor profSantos = new Professor("Prof. Santos", "jdasilv2", "jdasilv2@nd.edu", "Computer Science");
    
    //initialize TA objects
    TA ta1 = new TA("Ningzhi Tang", "ntang", "ntang@nd.edu");
    TA ta2 = new TA("Robert Wallace", "rwallac", "rwallac1@nd.edu");
    TA ta3 = new TA("Christian Northrup", "cnorthr2", "cnorthr2@nd.edu");
    TA ta4 = new TA("Tara Flannery", "tflanne2", "ntflanne2@nd.edu");
    TA ta5 = new TA("Daniel Shields", "dshield2", "dshield2@nd.edu");

    // reate programming paradimgs course object
    Course course = new Course("Programming Paradigms", "CSE30332", profSantos);
    
    //assign TAs to course
    ta1.assignToCourse(course);
    
    ta2.assignToCourse(course);
    ta3.assignToCourse(course);
    ta4.assignToCourse(course);
    ta5.assignToCourse(course);

    // create student objects
    Student student1 = new Student("Matthew Eleazar", "meleazar", "meleazar@nd.edu", "Computer Science");
    Student student2 = new Student("Marcellus Wilson", "mwilso36", "mwilso36@nd.edu", "Computer Science");
    Student student3 = new Student("Liam Gibson", "lgibson2", "lgibson2@nd.edu", "History/Russian");

    //enroll students in course
    course.addStudent(student1);
    course.addStudent(student2);
    course.addStudent(student3);

    //print out people
    System.out.println(profSantos);
    System.out.println(ta1);
    System.out.println(ta2);
    System.out.println(ta3);
    System.out.println(ta4);
    System.out.println(ta5);
    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
    
  }


}
