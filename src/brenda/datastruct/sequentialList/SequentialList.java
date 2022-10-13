package brenda.datastruct.sequentialList;

public class SequentialList {
    public static void main(String[] args) {
        List<Integer> list = new List<>(10);

        list.list();
        list.insert(1, 0);
        list.insert(2, 1);
        System.out.println("Elements: ");
        list.list();
        list.insert(5, 1);
        System.out.println("Total of elements: " + list.size());
    }
}
