package brenda.datastruct.tree;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.add(10);
        tree.add(5);
        tree.add(2);
        tree.add(8);
        tree.add(1);
        tree.add(12);
        tree.add(11);
        tree.add(9);

        System.out.println("In order: ");
        tree.printInOrder(tree.getRoot());
    }
}
