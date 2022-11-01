package brenda.datastruct.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add("E");
        stack.add("D");
        stack.add("C");
        stack.add("B");
        stack.add("A");

        System.out.println("Topo: " + stack.get());

        stack.remove();

        System.out.println("New topo: " + stack.get());
    }
}
