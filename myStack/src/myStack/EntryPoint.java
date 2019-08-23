package myStack;

import classes.MyStack;

public class EntryPoint {

	public static void main(String[] args) {

		UsageExampleWithString();

		UsageExampleWithInt();
	}

	private static void UsageExampleWithString() {
		MyStack<String> myStackTest = new MyStack<String>();
		myStackTest.Push("First string");
		myStackTest.Push("Second string");
		myStackTest.DeleteTopElement();
		myStackTest.Push("Third string");

		// In this case we should see the elements "Third string" then "First string"
		System.out.print("Popping " + myStackTest.Pop() + "\n");
		System.out.print("Popping " + myStackTest.Pop() + "\n");
	}

	private static void UsageExampleWithInt() {
		MyStack<Integer> myStackTest = new MyStack<Integer>();
		myStackTest.Push(0);
		myStackTest.Push(1);
		myStackTest.Push(2);
		myStackTest.DeleteTopElement();
		myStackTest.Push(3);
		myStackTest.Push(4);

		// In this case we should see the elements 4 then 3 then 1 then 1 again then 0
		System.out.print("Popping " + myStackTest.Pop() + "\n");
		System.out.print("Popping " + myStackTest.Pop() + "\n");
		System.out.print("Peeking " + myStackTest.Peek() + "\n");
		System.out.print("Popping " + myStackTest.Pop() + "\n");
		System.out.print("Peeking " + myStackTest.Peek() + "\n");

	}
}
