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
        if(position < this.data.length && position >= 0){
            for (int i = this.totalOfElements; i > position; i--){
                data[i] = data[i-1];
            }
            data[position] = element;
            totalOfElements++;
        }
    }

}
