
public class  Practice101{
  public static void main (String[] args) {
   Student s =new Student();
   s.st_name = "zoro";
   s.st_address ="one piece";
   s.clg = new College();
   s.clg.col_name = "EAST BULE";
   System.out.println(s.st_name+" "+s.st_address+" "+s.clg.col_name);
   
  }
}
class College{
  String col_name;
  
}
class Student{
  String st_name;
  String st_address;
  College clg;
}