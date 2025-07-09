
/*singly linkedlist operations.using LinkedList inbuiltclasses easily can do inser,delete,update.
but for better understanding firstly i code 
 all codes without using LinkedList class*/

public class singlyLS{
static class Node{
    int data;
    Node next;
//constructor
    Node(int data){
        this.data=data;
        this.next= null;
    }
}
static Node head;//class level variable

  
public static void insertBeginning(int data){
    
   Node newNode= new Node(data);
   newNode.data= data;
   newNode.next=null;
//when list is empty
if(head==null){
    head=newNode;
}
else{

newNode.next=head;
head=newNode;
}
    
}

public static void main(String[] args){

 insertBeginning(5);
 insertBeginning(6);
insertBeginning(7);
Node currentNode=head;    
while(currentNode!=null){
    System.out.println(currentNode.data);
    currentNode=currentNode.next;

}

    }
}