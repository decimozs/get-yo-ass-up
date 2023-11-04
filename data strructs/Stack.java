public class Stack {
    private int maxSize;
    private int top;
    private int[] stack;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top < maxSize - 1) {
            stack[++top] = item;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    } 

    public int size() {
        return top + 1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println("[ " + stack[i] + " ]");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        System.out.println("Stack: ");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // pop the last item you insert on the stack
        stack.pop(); // this will pop the 50

        int peek = stack.peek();

        boolean isempty = stack.isEmpty();

        int size = stack.size();

        stack.print();

        System.out.println("Peek the last item you insert on the stack = " + peek + ".");
        System.out.println("Does the stack empty? " + isempty + ".");
        System.out.println("The stack length is " + size + ".");
    }
}
