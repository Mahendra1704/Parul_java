class Parul{
  public static void main (String[] args) {
    String s1 = new String(" Parul");
    String s2 = "University";
    
    System.out.println(s1);
    System.out.println(s2);
    
    System.out.println((s2.length()));
    System.out.println((s1.charAt(3)));
    System.out.println((s1.substring(1,3)));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.toUpperCase());
    System.out.println(s2.toUpperCase());
    System.out.println(s1.trim());
    System.out.println(s1.indexOf('r'));
    System.out.println(s1.replace('P','F'));
    System.out.println(s2.contains("y"));
    String s3 ="programming";
    System.out.println((s3.lastIndexOf('m')));
    System.out.println((s3.startsWith("pro")));
    System.out.println((s3.endsWith("ing")));
  }
}