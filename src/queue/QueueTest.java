/**
 * 
 */
package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Pavan_Mugathi
 *
 */
class QueueTest {
    /**
     * creates an instance of queue.
     */
    private static Queue<Integer> queue = new Queue<Integer>();;

    /**
     * test for removing from empty queue.
     */
    @Test
    void removeFromEmptyQueueTest() {
        Assertions.assertThrows(Exception.class, () -> queue.deQueue());
    }

    /**
     * test for order of removing elements from the queue.
     * @throws Exception when removing from empty queue.
     */
    @Test
    void deQueueOrderTest() throws Exception {
        queue.enQueue(10);
        queue.enQueue(20);
        assertEquals(Integer.valueOf(10), queue.deQueue());
        assertEquals(Integer.valueOf(20), queue.deQueue());
    }

    /**
     * when elements are added and removed test for removing from empty queue .
     * @throws Exception when removing from empty queue.
     */
    @Test
    void emptyQueuewhenElementsRemovedTest() throws Exception {
        queue.enQueue(10);
        assertEquals(Integer.valueOf(10), queue.deQueue());
        Assertions.assertThrows(Exception.class, () -> queue.deQueue());
    }

    /**
     * To test for size of queue.
     * @throws Exception when removing from empty queue.
     */
    @Test
    void queueSizeTest() throws Exception {
        queue.enQueue(40);
        queue.deQueue();
        assertEquals(0, queue.size());
    }

    /**
     * test for the empty Queue.
     */
    @Test
    void isQueueEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    /**
     * test for the queue when  not empty.
     * @throws Exception when removing from empty queue.
     */
    @Test
    void queueNotEmptyTest() throws Exception {
        queue.enQueue(10);
        assertFalse(queue.isEmpty());
        queue.deQueue();
    }
}
