
public class parulday6{
  public static void main (String[] args) {
    //binary search
    int[]arr={1,2,3,45,6,123,4};
    int e =19;
  
    int start=0;
    int end =arr.length-1;
      int flag=0;
    whlie(start<=end){
      int mid = (start+mid)/2;
      if(arr[mid]==e){
      flag =1;
      break;
    }
    if(e>arr[mid]){
     start = mid +1;
     
    }
    if(e<arr[mid]){
      end = mid-1;
    }
  }
  if(flag==1){
    System.out.println("found");
  }else{
    System.out.println("not found");
  }
}
}
