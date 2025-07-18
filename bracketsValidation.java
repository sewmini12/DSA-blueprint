/*
 * question-check given statement bracket validation 
 * solution-using stack firstly get opening bracket and check is it matcjh with closig bracket
 * when using pop need to check empty()
 */
import java.util.Stack;
import java.util.Scanner;
public class bracketsValidation {

  public static void check(String example){
    Stack<Character> exampleStack=new Stack<Character>();
      for(int i=0;i<example.length();i++){
        char x=example.charAt(i);
       if(x=='['||  x=='{'  || x=='('){
            exampleStack.push(x);
        }
      else{
        if(x==']'){
            if(exampleStack.peek()=='['){
                exampleStack.pop();
            
            }
        }
        else if(x=='}'){
             if(exampleStack.peek()=='{'){
                exampleStack.pop();
        
            }

        }
         else if(x==')'){
             if(exampleStack.peek()=='('){
                exampleStack.pop();
            
            }

        }
        
      }

  }
  if(exampleStack.empty())
    System.out.println("correct brackets usage");
  else
    System.out.println("incorrect brackets usage");
  
}

  public static void main(String[]args){
           
           Scanner input=new Scanner(System.in);

           System.out.println("enter expression");
           String example=input.nextLine();
            
           check(example);
    }
    

}
