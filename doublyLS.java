public class doublyLS {
    static class Node{
        int data;
        Node next;
        Node prev;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
static Node head;
static Node tail;

public static void insertBeg(int data){
    Node newNode=new Node(data);
    newNode.data=data;
    newNode.next=null;
    newNode.prev=null;

    if(head==null){
       head=newNode;
       tail=newNode;
    }
    else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
}

}
public static void insertEnd(int data){
    Node newNode=new Node(data);
    newNode.data=data;
    newNode.next=null;
    newNode.prev=null;

    if(head==null){
         head=newNode;
         tail=newNode;
    }
    else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
}
//position is count from the front
public static void insertposfront(int position,int data){
        Node newNode=new Node(data);
    newNode.data=data;
    newNode.next=null;
    newNode.prev=null;

    if(head==null){
         head=newNode;
         tail=newNode;
    }
    else{
        Node temp=head;
        for(int i=0;i<position-2;i++){
             temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next.prev=newNode;
         temp.next=newNode;
         newNode.prev=temp;
          

    }
}

public static void insertPosEnd(int data,int position){
         Node newNode=new Node(data);
         newNode.data=data;
         newNode.next=null;
         newNode.prev=null;

         if(head==null){
            head=newNode;
            tail=newNode;
         }
         else{
            Node temp=tail;
            for(int i=0;i<position-2;i++){
                temp=temp.prev;
            }
            newNode.prev=temp.prev;
            temp.prev.next=newNode;
            newNode.next=temp;
            temp.prev=newNode;


         }

}
public static void deleteFront(){
        if(head==null){
           System.out.println("nothinfg to delete");
        }
        else{
           Node temp=head;
           head=head.next;
           head.prev=null;
           temp.next=null;
        }
}
public static void deleteEnd(){
        if(head==null){
           System.out.println("nothinfg to delete");
        }
        else{
           Node temp=tail;
           tail=tail.prev;
           temp.prev=null;
           tail.next=null;
        }
}




public static void main(String[]args){
insertBeg(34);
insertBeg(7);
insertBeg(87);
insertEnd(34);
insertEnd(21);
insertEnd(11);
insertposfront(2,22);
insertposfront(5,11);
insertPosEnd(56,4);
insertPosEnd(90,3);
deleteFront();
deleteFront();
deleteEnd();
deleteEnd();


Node temp=head;
while (temp!=null) {
    System.out.println(temp.data);
    temp=temp.next;
}

}


}



