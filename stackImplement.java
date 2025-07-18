//stack implementation using linkedlist.
public class stackImplement {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node top;

public static void push(int data){
    Node newNode= new Node(data);
    newNode.data=data;
    newNode.next=null;

    if(top==null){
        top=newNode;
    }
    else{
        newNode.next=top;
        top=newNode;
    }
    

}
public static void pop(){
    if(top==null){
       System.out.println("nothing to delete");
    }
    else{
    System.out.println("poped element:"+top.data);
    top=top.next;
    }
}
public static int empty(){
    if(top==null)
        return 1;
    else    
        return 0;
    
}
public static void peek(){
    System.out.println("top element value:"+ top.data);
}

public static void main(String[]args){
   push(45);
   push(2);
   push(53);
   push(73);
   push(88);
   push(21);
   pop();
   System.out.println(empty());
   

}


}
