public class  exception{
  public static void main (String[] args) {
    System.out.println("dtart of program");
    try{
      int[] arr = {1,2,3,4};
      System.out.println(arr[5]);
      System.out.println(12/0);
    }catch(Exception e){
      System.out.println("can not divide with zero");
    }finally{
     System.out.println("end of program"); 
    }
    
  }
}