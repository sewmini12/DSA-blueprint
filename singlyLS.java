
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
public static void insertEnd(int data){
    Node newNode=new Node(data);
    newNode.data=data;
    newNode.next=null;

    if(head==null){
        head=newNode;
    }
    else{
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;

        }
        currentNode.next=newNode;
    }

}
//insert data for certain position.position is count from the baginning.
public static void insertPosAtBeg(int data,int position){
Node newNode=new Node(data);
newNode.data=data;
newNode.next=null;

Node temp=head;
for(int i=0;i<position-1;i++){
    temp=temp.next;

}
newNode.next=temp.next;
temp.next=null;
temp.next=newNode;

}
public static void insertPosiEnd(int data,int position){
Node newNode=new Node(data);
newNode.data=data;
newNode.next=null;

Node prev=head;
Node past=head;
for(int i=0;i<position-1;i++){
    prev=prev.next;
}
while(prev.next!=null){
    prev=prev.next;
    past=past.next;
}
newNode.next=past.next;
past.next=null;
past.next=newNode;



}



public static void main(String[] args){

insertBeginning(5);
insertBeginning(6);
insertBeginning(7);
insertEnd(4);
insertEnd(3);
insertEnd(6);
insertEnd(9);
insertPosAtBeg(56,1);
insertPosAtBeg(21,4);
insertPosAtBeg(11,5);
insertPosiEnd(22,5);
insertPosiEnd(32,4);
insertPosiEnd(33,1);

Node currentNode=head;    
while(currentNode!=null){
    System.out.println(currentNode.data);
    currentNode=currentNode.next;

}

}


}