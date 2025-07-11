import java.util.LinkedList;
/*
 * by LinkedList in built class have methods-(rag)
 * addFirst()
 * addLast()
 * getFirst()
 * getLast()
 * removeFirst()
 * removeLast()
 * size()
 * set(data,position)
 * add->add to the end of the list
 * 
 */


 //can't add top level class inside another class ex-can't Main class add inside anonther one.

    public class Main{
     public static void main (String[]args){
        LinkedList<String> name=new LinkedList<String>();
            name.addFirst("sewmini");
            name.addFirst("kavindya");
            name.addFirst("sadali");
            name.addLast("ravindu");
            name.addLast("satha");
            System.out.println(name.getFirst());
            System.out.println(name.getLast());
            name.removeFirst();
            name.removeLast();
            System.out.println(name.size());
            name.set(2,"amal");
            name.add("nayana");


System.out.println(name);
      

     }
    }

