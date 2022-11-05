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

    public boolean remove(T value){
        Element<T> actualElement = this.root;
        Element<T> father = null;

        while(actualElement != null){
            if(actualElement.getValue().equals(value)){
              break;
            }else if (value.compareTo(actualElement.getValue()) == -1){ //actual is minor
                father = actualElement;
                actualElement = actualElement.getLeft();
            }else{
                father = actualElement;
                actualElement = actualElement.getRigth();
            }
        }

        if(actualElement != null){
            if(actualElement.getRigth() != null){//has two children

                Element<T> newElement = actualElement.getRigth();
                Element<T> fatherNewElement = actualElement;
                while(newElement.getLeft() != null){
                    fatherNewElement = newElement;
                    newElement = newElement.getRigth();
                }
                if(father != null) {
                    if (actualElement.getValue().compareTo(father.getValue()) == -1) {
                        father.setLeft(newElement);
                    } else {
                        father.setRigth(newElement);
                    }
                }else{
                    this.root = newElement;
                }

                if(newElement.getValue().compareTo(fatherNewElement.getValue()) == -1){
                    fatherNewElement.setLeft(null);
                }else{
                    fatherNewElement.setRigth(null);
                }

            }else if(actualElement.getLeft() != null){ //has children only on the left
                Element<T> newElement = actualElement.getLeft();
                Element<T> fatherNewElement = actualElement;
                while (newElement.getRigth() != null){
                    fatherNewElement = newElement;
                    newElement = newElement.getRigth();
                }

                if(father != null) {
                    if (actualElement.getValue().compareTo(father.getValue()) == -1) {
                        father.setLeft(newElement);
                    } else {
                        father.setRigth(newElement);
                    }
                }else{
                    this.root = newElement;
                }

                //remove element from tree
                if(newElement.getValue().compareTo(fatherNewElement.getValue()) == -1){
                    fatherNewElement.setLeft(null);
                }else{
                    fatherNewElement.setRigth(null);
                }
             }else{//has no children

                if(father != null) {
                    if (actualElement.getValue().compareTo(father.getValue()) == -1) {
                        father.setLeft(null);
                    } else {
                        father.setRigth(null);
                    }
                }else{
                    this.root = null;
                }
            }
            return true;
        }else{
            return false;
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
