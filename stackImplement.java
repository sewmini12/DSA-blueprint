//stack implementation using linkedlist.
public class stackImplement {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        static Node top;
    }

public static void push(int data){
    Node newNode=new Node(data);
    newNode.data=data;
    newNode.next=null;

    if(top==null){
        top=newNode;
    }
    else{
        top++;
        newNode.next=top;
        top=newNode;
    }
    

}
public static void pop(){
    System.out.println("deleted element:"+top);
    
}
public static void empty(){
    
}
public static void peek(){
    
}





    }
