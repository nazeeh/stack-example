package classes;

import java.util.ArrayList;

//This is a pretty straight forward class definition of a stack which is based on a generic data type
public class MyStack<T> {
	ArrayList<T> mylist = new ArrayList<T>();

	// This constructor creates an empty stack
	public MyStack() {
		this.mylist = new ArrayList<T>();
	}

	// The usual push method
	public void Push(T object) {
		this.mylist.add(object);
	}

	// The usual pop method
	public T Pop() {
		T poppedElement = this.mylist.get(mylist.size() - 1);
		this.mylist.remove(mylist.size() - 1);
		return poppedElement;
	}

	public void DeleteTopElement() {
		this.mylist.remove(mylist.size() - 1);
	}

	// Returns the last pushed element (without removing it)
	public T Peek() {
		return this.mylist.get(mylist.size() - 1);
	}
}
