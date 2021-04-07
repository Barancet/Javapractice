package datastructures.hashmap;

import java.util.Objects;

public class Value {
    private int value;
    public Value(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;
        Value value1 = (Value) o;
        return value == value1.value;
    }
}
