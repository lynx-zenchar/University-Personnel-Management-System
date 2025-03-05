
public abstract class UniversityMember{
  // Attributes
  private String name;
  private String id;
  private String email;

  public UniversityMember(String n, String i, String e){ //constructor
    this.name = n;
    this.id = i;
    this.email = e;
  }

  public abstract String getRole();

  public String getName(){
    return this.name;
  }

  public String getId(){
    return this.id;
  }

  public String getEmail(){
    return this.email;
  }


}
