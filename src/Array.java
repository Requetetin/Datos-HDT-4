import java.util.*;

public class Array<E> extends aStack<E>{

	protected ArrayList<E> lista;

	public Array(){
		lista = new ArrayList<E>();
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