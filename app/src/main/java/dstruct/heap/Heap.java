package dstruct.heap;

/*
 * Heap backed by array
 */
public class Heap {

    private int[] heap;
    private int size;

    public Heap (int capacity) {

        heap = new int[capacity];
    }

    /*
     * Use rightmost leaf as replacement value so that the tree remain complete
     * Then we must heapify
     * When replacement value greater than parent, fix heap above, else fix heap below
     */
    public int delete (int index) {

        if (isEmpty()) throw new IndexOutOfBoundsException("Heap is full");

        int parent = getParent(index);
        int deleteValue = heap[index];
        heap[index] = heap[size - 1];
        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size -1);
        }
        else {
            fixHeapAbove(index);
        }
        size--;

        return deleteValue;
    }

    public int getChild (int index, boolean left) {

        return 2 * index + (left ? 1 : 2);
    }

    public void insert (int value) {

        if (isFull()) throw new IndexOutOfBoundsException("Heap is full");

        heap[size] = value;
        // next we heapify, to fix the heap if the insertion is out-of-order
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapBelow (int index, int lastHeapIndex) {

        int childToSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else { break; }
                index = childToSwap;
            }
            else { break; }
        }

        return;
    }

    private void fixHeapAbove (int index) {

        int newVal = heap[index];
        while (index > 0 && newVal > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newVal;
    }

    public int getParent (int index) {

        return (index - 1) / 2;
    }

    public boolean isFull () {

        return size == heap.length;
    }

    public boolean isEmpty () {

        return size == 0;
    }

    public void print () {

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
}
