class  reverse
{
  public static void main (String[] args) {
    String name ="abcdcba";
    String another ="";
    for(int i=name.length()-1;i>=0;i--){
      another = another +name.charAt(i);
    }
    
    if(name.equals(another)){
      System.out.println("Palindrome");
    }else{
      System.out.println("not Palindrome");
    }
  }
}