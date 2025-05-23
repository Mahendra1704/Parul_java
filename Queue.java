public class Queue {
    public static void main(String[] args) {
      
      
      // queue
      // 2 ways to make a queue in java
      // using an array
      // using a linkedlist
      
      MyQueue mq=new MyQueue(10);
      mq.enqueue(12);
      mq.enqueue(13);
      mq.enqueue(14);
      mq.enqueue(17);
      
      mq.print();
  }
}
class MyQueue{
  int[] arr;
  int front,rear,size,capacity;
  
  MyQueue(int capacity){
    this.capacity=capacity;
    arr=new int[capacity];
    size=0;
    front=0;
    rear=-1;
  }
  
  void enqueue(int data){
    if(size==capacity){
      System.out.println("Queue is full");
      return;
    }
    rear=(rear+1)% capacity;
    arr[rear]=data;
    size++;
  }
  
  void print(){
    for(int i=0;i<size;i++){
      System.out.println(arr[i]);
    }
  }
}