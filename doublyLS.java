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

public static void main(String[]args){
insertBeg(34);
insertBeg(7);
insertBeg(87);


Node temp=head;
while (temp!=null) {
    System.out.println(temp.data);
    temp=temp.next;
}

}


}



