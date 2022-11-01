package brenda.datastruct.tree;

public class Element<T> {

    private T value;
    private Element<T> left;
    private Element<T> rigth;


    public Element(final T aValue){
        this.value = aValue;
        this.left = null;
        this.rigth = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getLeft() {
        return left;
    }

    public void setLeft(Element<T> left) {
        this.left = left;
    }

    public Element<T> getRigth() {
        return rigth;
    }

    public void setRigth(Element<T> rigth) {
        this.rigth = rigth;
    }
}
