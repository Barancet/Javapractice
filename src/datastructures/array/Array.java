package datastructures.array;

/*
A static array is a fixed length container that's indexable from [0, n-1]
Indexable = referenced with a number

Static arrays are contiguous chunks of memory all addresses are adjacent..

good examples of uses: Storing accessing sequential data
temp storage of objects
IO routines as buffers store input output streams
lookup tables and inverse lookups
return multiple values from a func
dynamic programming to cache answers to subprobs
 */

import java.util.Iterator;

//this class will be very similar to how array list is implemented
public class Array<T> implements Iterable<T> {

    private T[] array;
    private int length = 0;
    private int capacity = 0;

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity" + capacity);
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T elem) {
        array[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            array[i] = null;
            length = 0;
        }
    }

    public void add(T elem){
        if(length + 1 >= capacity){
            if(capacity== 0) capacity = 1;
            else capacity*= 2;
            T[] new_array = (T[]) new Object[capacity];
            for (int i = 0; i< length; i++){
                new_array[i] = array[i];
                array = new_array;
            }
        }
        array[length+1] = elem;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
