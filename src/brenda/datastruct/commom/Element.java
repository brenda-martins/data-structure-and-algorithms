package brenda.datastruct.commom;

public class Element {

    private String value;
    private Element nextElement;


    public Element(String aValue){
        this.value = aValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }
}
