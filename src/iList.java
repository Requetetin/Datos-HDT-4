<<<<<<< HEAD
import java.util.*;
=======
import java.util.Iterator;
>>>>>>> 1c76c6a2e9661c40a74778f9b6097611618ec17f

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