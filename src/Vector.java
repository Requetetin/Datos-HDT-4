import java.util.*;

public class Vector<E> extends aStack<E>{
	protected Vector lista;

	public Vector(){
		lista = new Vector();
	}

	public void push(E item){
		lista.add(item);
	}

	public E pop(){
		return lista.remove(size() -1);
	}

	public E peek(){
		return lista.get(size()-1);
	}
	public int size(){
		return lista.size();
	}
}