package brenda.datastruct.queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Brenda");
        queue.add("Olga");
        queue.add("Aldair");
        queue.add("Luiz");
        queue.add("Priscila");
        queue.add("Demétria");

        System.out.println("First on queue: " + queue.get());
        queue.remove();
        System.out.println("First on queue after remove Brenda: " + queue.get());
    }
}
