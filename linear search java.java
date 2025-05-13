
public class parulday6{
  public static void main (String[] args) {
    //check if the element is inise a array or not 
    //using linear search
  int arr[] ={45,234,23,54,53,12};
  int e= 66;
  int flag =0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==e){
      flag =1;
      break;
    }
  }
  if(flag==1){
    System.out.println("element found");
  }else{
    System.out.println("element not found");
  }
  
  }
}