/*
 * why we implement hashSet instead of array or linkedlist
 * what are the differences?
 * hashset doesn't allow duplicates but list(arraylist or linkedlist) allow duplicates
 * but hashset doesn't maintain order.because set store elemnts according to hash code. list maintain order what order we entered it consisit in list but sets data is here and there not in order
 * 
 * 
 * by import HashSet class can implement methods easily
 * add()
 * remove()
 * contains()
 * size()
 * clear()
 * but for deep understanding I practise methods without import HashSet class
 * 
 */

import java.util.HashSet;
public class Hashset {
   
    public static void main (String[]args){
         HashSet<String> name=new HashSet<String>();
         name.add("sew");
         name.add("kavindya");
         name.add("naduni");
         name.add("senani");
         name.add("dahami");
         name.add("dehemi");
         name.add("kaushani");
         name.add("shen");
         name.add("naduni");
         name.add("FB");
         name.add("Ea");
         name.add("senaka");
         name.add("canada");
         System.out.println("remove if it exist-sew");
         System.out.println(name.contains("sew"));
         
         name.remove("sew");
         System.out.println(name.size());
         name.clear();


         System.out.println(name);
    }
}
