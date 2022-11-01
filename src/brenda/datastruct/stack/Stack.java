package brenda.datastruct.stack;


import brenda.datastruct.commom.LinkedList;

public class Stack {

    private LinkedList linkedList;

    public Stack(){
        this.linkedList = new LinkedList();
    }


    public void add(String aValue){
        this.linkedList.addAtBeginning(aValue);
    }

    public void remove(){
        this.linkedList.remove(this.get());
    }

    public String get(){
         return this.linkedList.getFirstElement().getValue();
    }
}
