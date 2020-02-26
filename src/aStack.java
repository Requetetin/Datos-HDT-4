import java.util.ArrayList;

public abstract class aStack<E> implements iStack<E>{
	
protected ArrayList<E> lista;
	

	/**
	 * Constructor
	 */
	public aStack() {
		lista = new ArrayList<E>();
		
	}
	
	/**
	 * pushear un elemento
	 */
	public void push(E item){
		lista.add(item);
	}

	/**
	 * Ver ultimo dato que entro al array
	 */
	public E pop(){
		
		return lista.remove(size()-1);
	}

	/**
	 * Ver el siguiente valor al que se le hara pop
	 */
	public E peek(){

		return lista.get(size()-1);
	}

	/**
	 * Ver si el stack esta vacio
	 */
	public boolean empty(){

		return size()==0;
	}

	/**
	 * Tamaño del stack
	 */
	public int size(){

		return lista.size();
	}
}