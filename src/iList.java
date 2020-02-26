import java.util.*;


interface iList<E>{

   public void addLast(E value); //Como push
   // post: value is added to end of list

   public E getLast(); //Como peek
   // pre: list is not empty
   // post: returns last value in list

   public E removeLast(); //Como pop
   // pre: list is not empty
   // post: removes last value from list

   
}