package brenda.datastruct.tree;

public class Tree<T extends Comparable> {

    private Element<T> root;

    public Tree(){
        this.root = null;
    }

    public void add(T aValue){
        Element<T> newElement = new Element<T>(aValue);
        if(this.root == null){
            this.root = newElement;
        }else{
            Element<T> actualElement = this.root;
            while(true){
                //compareTo return:
                //  0  -> equal
                // -1  -> smaller
                //  1  -> largest
                if(newElement.getValue().compareTo(actualElement.getValue()) == -1){
                    if(actualElement.getLeft() != null){
                        actualElement = actualElement.getLeft();
                    }else{
                      actualElement.setLeft(newElement);
                      break;
                    }
                }else{ // if greater than or equal to
                    if(actualElement.getRigth() != null){
                        actualElement = actualElement.getRigth();
                    }else{
                        actualElement.setRigth(newElement);
                        break;
                    }
                }
            }
        }
    }

    public void printInOrder(Element<T> anElement){
        if(anElement != null){
            printInOrder(anElement.getLeft());
            System.out.println(anElement.getValue());
            printInOrder(anElement.getRigth());
        }
    }

    public Element<T> getRoot() {
        return root;
    }


}
