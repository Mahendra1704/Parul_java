class  reversechar
{
  public static void main (String[] args) {
    String name ="Parul University";
    String another ="";
    for(int i=name.length()-1;i>=0;i--){
      another = another +name.charAt(i);
    }
    System.out.println(another);
  }
}