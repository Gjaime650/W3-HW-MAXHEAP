package s25.cs146;
import java.lang.Math;


public class buildMaxHeap {
    public void BuildHeap(WordFreq[] heap){
    for( int i = (int) Math.floor((double) (heap.length /2) - 1); i >= 0; i-- ){
        MaxHeapify(i, heap);

    }

    }
    private void MaxHeapify(int i, WordFreq[] heap){
        int parent = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < heap.length && heap[left].frequency > heap[parent].frequency){
            parent = left;
        }
        if(right < heap.length && heap[right].frequency > heap[parent].frequency){
           parent = right;
        }
        if(parent != i){
            WordFreq temp = heap[i];
            heap[i] = heap[parent];
            heap[parent] = temp;
            MaxHeapify(parent,heap);
        }

    }

}
