public class Opps{
  public static void main (String[] args) {
  Student s1 = new Student();
  s1.roll = 45;
  s1.name ="mahendra";
  s1.height=123.23f;
  s1.weight= 44.45;
  s1.study();
  System.out.println(s1.roll);
  System.out.println(s1.name);
  System.out.println(s1.height);
  System.out.println(s1.weight);
  Student s2 = new Student();
  s2.roll = 411;
  s2.name ="mahi";
  s2.height=6.3f;
  s2.weight= 52.5;
  s2.study();
  System.out.println(s2.roll);
  System.out.println(s2.name);
  System.out.println(s2.height);
  System.out.println(s2.weight);
  }
}
class Student{
  int roll;
  String name;
  float height;
  double weight;
  void study(){
    System.out.println("student is studing");
  }
  
}