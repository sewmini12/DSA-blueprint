/*by importing stack class can easily build stack - java.util.stack
 * operations of stacks are (first in last out)
* push()-
  pop()
  peek()
  empty()
  size()
 */
import java.util.Stack;
public class stack{
   public static void main(String[]args){
      Stack<String> name=new Stack<String>();

      name.push("sadu");
      name.push("nimali");
      name.push("sadali");

    System.out.println("poped element: "+name.pop());

    System.out.println("top element:"+name.peek());

    System.out.println("is empty: "+name.empty());

    System.out.println("now stack:"+name);



   }
}






     
    
  

