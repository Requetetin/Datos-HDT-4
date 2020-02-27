/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 4
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/singly-linked-list?module_item_id=195289

public abstract class aList<E> implements iList<E>, iStack<E>{

   public aList()
   // post: does nothing
   {
   }

   /**
    * devuelve verdadero si la lista esta vacia
    */
   public boolean empty() //Lo implementa de StackTraceElement
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  
}