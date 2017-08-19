package Heap;

import Helpers.Helper;

/**
 * Created by artur on 19.08.2017.
 */
public class HeapOnArray {

    private int[] heap;
    private int currentIndex = 0;


    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void addToHeap(int item) {
        if (currentIndex < this.heap.length - 1) {
            this.heap[this.currentIndex] = item;
            currentIndex++;
        }
    }

    public int removeFromHeap() {
        if (currentIndex > 0) {
            currentIndex--;
            return this.heap[this.currentIndex];
        }
        return 0;
    }

    public boolean isEmpty() {

        if (this.currentIndex == 0) {
            return true;
        }
        return false;
    }

    public int getPickOfHeap() {
        return this.heap[this.currentIndex - 1];
    }

    public void printHeap() {
        for (int i = 0; i < this.currentIndex; i++) {
            Helper.printInt(this.heap[i]);
        }
    }

}
