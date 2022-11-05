package brenda.datastruct.tree;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.add(10);
        tree.add(8);
        tree.add(5);
        tree.add(9);
        tree.add(7);
        tree.add(18);
        tree.add(13);
        tree.add(20);

        System.out.println("In order: ");
        tree.printInOrder(tree.getRoot());

        tree.remove(13);
        tree.remove(5);
        tree.remove(8);
        tree.remove(9);
        tree.remove(10);



        System.out.println("After remove: ");
        tree.printInOrder(tree.getRoot());
    }
}
