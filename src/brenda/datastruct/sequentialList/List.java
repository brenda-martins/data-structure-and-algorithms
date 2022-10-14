package brenda.datastruct.sequentialList;

public class List<T> {
    T data[];
    int totalOfElements;


    public List(final int aSize){
        this.data = (T[]) new Object[aSize];
        this.totalOfElements = 0;
    }

    public void list(){
        for(int i = 0; i < this.totalOfElements; i++){
            System.out.println(data[i]);
        }
    }

    public int size(){
        return this.totalOfElements;
    }

    public void insert(T element, int position){
        if(position >= 0 && position < this.data.length){
            for (int i = this.totalOfElements; i > position; i--){
                data[i] = data[i-1];
            }
            data[position] = element;
            totalOfElements++;
        }
    }

    public T searchElement(T element){
        int i = 0;
        while(i < this.totalOfElements){
            if(element == this.data[i]) return this.data[i];
            else i++;
        }

        return null;
    }

}
