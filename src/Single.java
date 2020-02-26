<<<<<<< HEAD
import java.util.*;
=======
import java.util.Iterator;
>>>>>>> 1c76c6a2e9661c40a74778f9b6097611618ec17f

public class Single<E> extends aList<E>{
	protected int count; // list size
   protected Node<E> head; // ref. to first element
   

   public Single()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }

  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }

  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
  {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }

  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
  	 
         finger.setNext(temp);
      } else head = temp;
    
    count++;
    
   }

   public E removeLast(){
      if(head == null){
        return null;
      }
      if(head.next() == null){
        return null;
      }

      Node<E> temp = head;
      while(temp.next().next() !=null) temp = temp.next();
      
      temp.setNext(null);
      count --;
      return head.value();
   }

   public E getLast(){
      return head.value();
   }
   
   


  public void push(E item){
    addLast(item);
  }
  public E pop(){
    return removeLast();
  }
  public E peek(){
    return getLast();
  }

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public E getLast() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E removeLast() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E remove(E value) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(E value) {
	// TODO Auto-generated method stub
	
}

@Override
public E remove() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E get() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int lastIndexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public E get(int i) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E set(int i, E o) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(int i, E o) {
	// TODO Auto-generated method stub
	
}

@Override
public E remove(int i) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterator<E> iterator() {
	// TODO Auto-generated method stub
	return null;
}
}