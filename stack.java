/*
 * operations of stacks are (first in last out)
* push()
  pop()
  peek()
  isEmpty()
  size()
 */
public class stack {
     int capacity;
     int top;
     char[] stack;

     public stack(int capacity){
      this.capacity=capacity;
      this.top=-1;
      this.stack=new char[capacity]; 

     }
  public static void push(char data){
    if(top==capacity-1){
      system.out.println("stack is already full");

    }
    stack[top++]=data;

  }






     
    
  public static void main(String[]args){
          
  }

}

