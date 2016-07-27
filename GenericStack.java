
// this class simulates a stack by creating methods for an arraylist
public class GenericStack<E> {
    private java.util.ArrayList<E> myList = new java.util.ArrayList<>();
    
    public int getSize() {
        return myList.size();
    }
    
    public E peek() {
        return myList.get(getSize() - 1);
    }
    
    // adding to end of list - like adding to top of stack
    public void push (E object) {
        myList.add(object);
    }
    
    // removes from end of list - like removing from top of stack
    public E pop() {
        E object = myList.get(getSize() - 1);
        myList.remove(getSize() - 1);
        return object;
    }
    
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Stack: " + myList.toString();
    }
    
    // prints out a generic stack passed to method
    public static void printList(GenericStack<?> list) {
        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Apple");
        stringStack.push("Orange");
        stringStack.push("Pear");
        System.out.println("Objected popped from the stack is: " + stringStack.pop());
        printList(stringStack);
        
        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println("Is integerStack empty?: " + integerStack.isEmpty());
        printList(integerStack);
    }
}
