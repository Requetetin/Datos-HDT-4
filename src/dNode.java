//Esta se llama diferente la douglas, habria que ver vien lo del nombre

public class dNode<E>{
	protected E data;
	protected dNode<E> nextElement;
	protected dNode<E> previousElement;

	public dNode(E v,
	                        dNode<E> next,
	                        dNode<E> previous)
	{
	    data = v;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}

	public dNode(E v)
	// post: constructs a single element
	{
	    this(v,null,null);
	}
}