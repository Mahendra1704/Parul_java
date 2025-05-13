import java.util.ArrayList;
public class  mycoolectionFramework{
  public static void main (String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(13);
    arr.add(14);
    arr.add(15);
    
    System.out.println(arr);
    for(Integer i : arr){
      System.out.println(i);
    }
    arr.add(100);
    arr.add(50);
    System.out.println(arr);
    arr.add(2,77);
    System.out.println(arr);
  }
}