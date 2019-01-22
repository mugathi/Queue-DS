
package queue;

/**
 * entry level class.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enQueue(10);
        queue.enQueue(10);
        System.out.println(queue.deQueue());
        queue.deQueue();
        System.out.println(queue.size());
        queue.enQueue(20);
        System.out.println(queue.size());
    }
}
