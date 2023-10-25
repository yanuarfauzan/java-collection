package belajar.java.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue {

    private E data;

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(Object e) {
        // TODO Auto-generated method stub
        if ( data == null){
             data = e;
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return data;
    }

    @Override
    public E poll() {
        // TODO Auto-generated method stub
        E temp = data;
        data = null;
        return null;
    }
    
}
