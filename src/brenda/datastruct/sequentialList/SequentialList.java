package brenda.datastruct.sequentialList;

public class SequentialList {
    public static void main(String[] args) {
        List<Integer> list = new List<>(10);

        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(5, 1);

        System.out.println("Elements: ");
        list.list();
        System.out.println("Total of elements: " + list.size());
        System.out.println(list.searchElement(5));
    }
}
