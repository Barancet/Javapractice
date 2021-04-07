package datastructures.hashmap_basic;

public class Entry {
    int key;
    Object val;
    Entry next;

    public Entry(int key, Object val){
        this.key = key;
        this.val = val;
        next = null;
    }

    public Entry(){
        next=null;
    }

    public int GetKey(){
        return key;
    }

    public Object GetValue(){
        return val;
    }
}
