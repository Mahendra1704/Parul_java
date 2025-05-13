import java.util.ArrayList;
public class  ServerUPloadDownload{
  public static void main (String[] args) {
    ArrayList<Person>personList = new ArrayList<>();
    personList.add(new Person("john","new york"));
    personList.add(new Person("jane","London"));
    personList.add(new Person("jack","Paris"));
    personList.add(new Person("jill","tokyo"));
    System.out.println(personList);
    for (Person p : personList){
      System.out.println(p.name+" "+p.address);
    }
  }
}
class Person{
  String name;
  String address;
  Person(String name, String address){
    this.name = name;
    this.address = address;
  }
}