package Queue;

/**
 * Created by artur on 20.08.2017.
 */

public class QueueElement {
    private int value;
    private QueueElement next = null;

    public QueueElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}