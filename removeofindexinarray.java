import java.util.Arrays;
public class removeofindexinarray{
  public static void main (String[] args) {
   int arr[]={12,14,15,78,6785,57,4,5};
   int index = 3;
   int count =0;
   int newArr[] =new int[arr.length-1];
   for(int i=0;i<arr.length;i++){
     if(i!=index){
       newArr[count]=arr[i];
       count++;
     }
   }
   System.out.println(Arrays.toString(newArr));
   
  }
}
