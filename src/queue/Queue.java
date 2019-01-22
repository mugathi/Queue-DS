
package queue;

/**
 * class for queue data structure.
 * @param <Type> type of specified data type.
 */
public class Queue<Type> {
    /**
     * first Node in queue.
     */
    private Node<Type> first;
    /**
     * last Node in queue.
     */
    private Node<Type> last;
    /**
     * length of queue.
     */
    private int length = 0;

    /**
     * checks if the queue is empty.
     * @return boolean.
     */
    boolean isEmpty() {
        return first == null;
    }

    /**
     * adds the element to the queue.
     * @param value given value of specified type.
     */
    void enQueue(final Type value) {
        Node<Type> newNode = new Node<Type>(value);
        if (isEmpty()) {
            first = newNode;
            last = first;
        } else {
            last.setNext(newNode);
            last = last.getNext();
        }
        length++;
    }

    /**
     * removes the element from the queue.
     * @return value is found else null.
     * @throws Exception when queue is empty
     */
    Type deQueue() throws Exception {
        Type value = null;
        if (isEmpty()) {
            throw new Exception("queue is empty");
        } else {
            value = first.getValue();
            first = first.getNext();
            if (isEmpty()) {
                last = null;
            }
            length--;
        }
        return value;
    }

    /**
     * get the size of queue.
     * @return length;
     */
    int size() {
        return length;
    }
}
