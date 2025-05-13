import java.util.Arrays;
public class Bubblesort{
  public static void main (String[] args) {
    // sort(bubble sort)
    int arr[] = {6,5,2,9,2,0,1,9,2};
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        if(arr[i]<arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = arr[i];
          arr[j] = temp;
        }
      }
      
    } 
    System.out.println(Arrays.toString(arr));
    
  }
}
