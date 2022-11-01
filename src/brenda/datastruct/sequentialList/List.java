package brenda.datastruct.sequentialList;

public class List<T> {
    private T elements[];
    private int totalOfElements;


    public List(final int aSize){
        this.elements = (T[]) new Object[aSize];
        this.totalOfElements = 0;
    }

    public void list(){
        for(int i = 0; i < this.totalOfElements; i++){
            System.out.println(elements[i]);
        }
    }

    public int size(){
        return this.totalOfElements;
    }

    public boolean insert(T element, int position){
        if(position >= 0 && position < this.elements.length){
            for (int i = this.totalOfElements; i > position; i--){
                this.elements[i] = this.elements[i-1];
            }
            this.elements[position] = element;
            this.totalOfElements++;
            return true;
        }
        return false;
    }

    public boolean insert(T element){
        if(this.totalOfElements < this.elements.length){
            this.elements[this.totalOfElements] = element;
            this.totalOfElements++;
            return true;
        }
        return false;
    }

    public T searchElement(T element){
        int i = 0;
        while(i < this.totalOfElements){
            if(element == this.elements[i]) return this.elements[i];
            else i++;
        }
        return null;
    }
}
