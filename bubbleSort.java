/*
 * in java 
 * class-Arrays
 * method-sort()
 * by Arrays.sort() we can easily sort array. here i try bubble sort without using directly Arrays class.
 */

public class bubbleSort {
    public static void main(String[]args){
      
     int[] price={10,20,56,82,11,89,43,27,98,16};

    int length=price.length;

    for(int i=0;i<length-1;i++){

         for(int j=i+1;j<length;j++){

            if(price[i]>price[j]){
                int temp=price[j];
                price[j]=price[i];
                price[i]=temp;
            }
         }
    }
/* System.out.println(price);
by this  can't print array elements.That’s because arrays in Java are objects, and System.out.println() calls toString() on the array, which just prints the class type and hashcode.
solutions 
1.use for loop or for each loop
2.use toString()
3.use stream
 * 
 */
      for (int num : price) {
            System.out.print(num + " ");
        }
       
    }
}

