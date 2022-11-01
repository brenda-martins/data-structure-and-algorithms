package brenda.queue;


public class Queue {

    private final LinkedList linkedList;
    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void add(String aValue){
        this.linkedList.add(aValue);
    }

    public void remove(){
        this.linkedList.remove(this.get());
    }

    public String get(){
        return this.linkedList.getFirstElement().getValue();
    }


}
