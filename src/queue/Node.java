package queue;

/**
 * It contains value and link to next Node.
 * @param <Type> type of specified data type.
 */
public class Node<Type> {
    /**
     * store the value of specified type.
     */
    private Type value;
    /**
     * Link to next node.
     */
    private Node<Type> next;

    /**
     * creates an instance with value of specified type.
     * @param givenValue given value
     */
    Node(final Type givenValue) {
        value = givenValue;
    }

    /**
     * @return the value
     */
    public Type getValue() {
        return value;
    }

    /**
     * @return the next
     */
    public Node<Type> getNext() {
        return next;
    }

    /**
     * @param nextLink the next to set
     */
    public void setNext(final Node<Type> nextLink) {
        this.next = nextLink;
    }

}
