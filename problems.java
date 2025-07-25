//reverse the singy linkedlist
import java.util.LinkedList;
public class problems {
    public static void reverse(LinkedList marks){
      LinkedList<Integer> Node=new  LinkedList<Integer> ();
          Node temp=head;
          Node prev;
          Node after;
          while(temp!=null){
            temp.next=after;
            temp.next=prev;
            after=after.next;
            temp=after;
            prev=temp;
          }
          
    System.out.println(marks);
    }
   public static void main(String[]args){
    LinkedList<Integer> marks=new  LinkedList<Integer> ();
    marks.add(1);
    marks.add(2);
    marks.add(3);
    marks.add(4);
    marks.add(5);
    marks.add(6);
    marks.add(7);
    marks.add(8); 

System.out.println(marks);

reverse(marks);

   }
}
