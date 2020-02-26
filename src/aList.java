

public abstract class aList<E> implements iList<E>, iStack<E>{

   public aList()
   // post: does nothing
   {
   }

   public boolean empty() //Lo implementa de StackTraceElement
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  
}