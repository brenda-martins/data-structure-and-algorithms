package brenda.datastruct.commom;

public class LinkedList {

    private Element firstElement;
    private Element lastElement;
    private int size;


    public LinkedList(){
        this.size = 0;
    }

    public void add(final String aValue){
        Element newElement = new Element(aValue);
        if(this.firstElement == null && this.lastElement == null){
            this.firstElement = newElement;
            this.lastElement = newElement;
        }else{
            this.lastElement.setNextElement(newElement);
            this.lastElement = newElement;
        }

        this.size++;
    }

    public void addAtBeginning(final String aValue){
        Element newElement = new Element(aValue);
        if(this.firstElement == null && this.lastElement == null){
            this.firstElement = newElement;
            this.lastElement = newElement;
        }else{
            newElement.setNextElement(this.firstElement);
            this.firstElement = newElement;
        }
        this.size++;
    }

    public void remove(String aValue){
        Element procedingElement = null;
        Element actualElement = this.firstElement;

        for(int i = 0; i < this.getSize(); i++){
            if (actualElement.getValue().equalsIgnoreCase(aValue)){
                if (this.size == 1){
                    this.firstElement = null;
                    this.lastElement = null;
                }else if (actualElement == this.firstElement){
                    this.firstElement = actualElement.getNextElement();
                    actualElement.setNextElement(null);
                }else if (actualElement == this.lastElement){
                    this.lastElement = procedingElement;
                    procedingElement.setNextElement(null);
                }else{
                    procedingElement.setNextElement(actualElement.getNextElement());
                    actualElement = null;
                }
                this.size--;
                break;
            }
            procedingElement = actualElement;
            actualElement = lastElement.getNextElement();
        }
    }

    public Element get(int posicao){
        Element actualElement = this.firstElement;
        for(int i=0; i < posicao; i++){
            if (actualElement.getNextElement() != null){
                actualElement = actualElement.getNextElement();
            }
        }
        return actualElement;
    }


    public Element getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Element firstElement) {
        this.firstElement = firstElement;
    }

    public Element getLastElement() {
        return lastElement;
    }

    public void setLastElement(Element lastElement) {
        this.lastElement = lastElement;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
