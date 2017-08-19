package Heap;

import Helpers.Helper;

/**
 * Created by artur on 19.08.2017.
 */
public class InvokeHeap {
    public static void main(String[] args) {
        invokeHeapOnArray();

    }
    private static void invokeHeap(){
        Heap heap = new Heap();
        heap.addToHeap(10);
        heap.addToHeap(11);
        heap.addToHeap(5);
        heap.ptintHeap();
        Helper.printString(String. valueOf (heap.isEmpty()));
        Helper.printString(String.valueOf(heap.getPickOfHeap()));
        Helper.printString(String.valueOf(heap.removeFromHeap()));
        Helper.printString(String.valueOf(heap.isEmpty()));

    }
    private static void invokeHeapOnArray (){
        HeapOnArray heap = new HeapOnArray(5);
        heap.addToHeap(10);
        heap.addToHeap(11);
        heap.addToHeap(5);
        heap.printHeap();
        Helper.printString(String. valueOf (heap.isEmpty()));
        Helper.printString(String.valueOf(heap.getPickOfHeap()));
        Helper.printString(String.valueOf(heap.removeFromHeap()));
        Helper.printString(String.valueOf(heap.isEmpty()));
    }
}
