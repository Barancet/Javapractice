package datastructures.hashmap;


import java.util.Objects;

public class Key {
    private int key;

    public Key(int key){
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {

        if( this == obj) return true;
        if( obj == null || getClass() != obj.getClass()) return false;
        Key key1 = (Key) obj;
        return Objects.equals(key, key1.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }


}
