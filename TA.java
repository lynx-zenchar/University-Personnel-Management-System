
public class TA extends UniversityMember{
  private Course[] coursesAssisting = new Course[2];
  private int courseCount = 0;

  public TA(String name, String id, String email){
    super(name, id, email);
  }

  @Override
  public String getRole(){
    return "TA";
  }

  public void assignToCourse(Course c){
    if (courseCount < 2){
      coursesAssisting[courseCount++] = c;
    }
  }

  @Override
  public String toString(){
    String courseCodes = "";
    for (int i = 0; i < courseCount; i++){
      courseCodes += coursesAssisting[i].getCode() + ", ";
    }
    courseCodes = courseCodes.substring(0, courseCodes.length() - 2); // remove trailing comma and space
    return getName() + " (" + getEmail() + "). TA for Courses: " + courseCodes;
  }

}
