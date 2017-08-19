package Heap;

import Helpers.Helper;

/**
 * Created by artur on 19.08.2017.
 */
public class Heap {
    private HeapElement top = null;

    public void addToHeap(int value) {

        HeapElement temp = new HeapElement(value, this.top);
        this.top = temp;
    }

    public void ptintHeap() {
        if (this.top != null) {
            HeapElement temp = new HeapElement(this.top);
            while (temp != null) {
                Helper.printInt(temp.getValue());
                temp = temp.getPrev();
            }
        }
    }

    public int removeFromHeap() {

        if (this.top != null) {
            int temp = top.getValue();
            this.top = top.getPrev();
            return temp;

        }
        return -1;
    }

    public int getPickOfHeap() {
        if (this.top != null) {
            return this.top.getValue();

        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }

}
