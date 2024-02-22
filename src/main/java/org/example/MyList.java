package org.example;

import java.util.Iterator;

public class MyList<T> implements Iterable<T>{
    private T[] elements;
    private int lastIndex;
    public MyList(int size){
        elements = (T[])(new Object[size]);
        lastIndex = -1;
    }
    public void add(T item){
        if(lastIndex==elements.length) return;
        lastIndex++;
        elements[lastIndex] = item;
    }
    public void print(){
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(elements[i]);
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
    private class MyIterator implements Iterator<T>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index<=lastIndex;
        }

        @Override
        public T next() {
            if(hasNext()){
                return elements[index++];
            }
            return null;
        }
    }
}
