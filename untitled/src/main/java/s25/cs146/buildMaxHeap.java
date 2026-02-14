package s25.cs146;
import java.lang.Math;


public class buildMaxHeap {
    public void BuildHeap(WordFreq[] heap){
    for( int i = (int) Math.floor((double) heap.length /2); i > 1; i-- ){
        MaxHeapify(i, heap);

    }

    }
    public void MaxHeapify(int i, WordFreq[] heap){
        WordFreq parent = heap[i];
        if(parent.frequency <  heap[i + 2].frequency){


        }

    }

}
