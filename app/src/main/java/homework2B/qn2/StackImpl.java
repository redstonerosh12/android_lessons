package homework2B.qn2;

import java.util.*;
import java.math.*;

public class StackImpl<T> implements CustomStack<T>{

    private List<T> myList;

    StackImpl(){
        myList = new ArrayList<>();
    }

    @Override
    public void push(T t){
        myList.add(t);
    }

    @Override
    public T pop(){
        T out = peek();
        if(!isEmpty()) {
            myList.remove(myList.size() - 1);
        }
        return out;
    }

    @Override
    public int size(){
        return myList.size();
    }

    @Override
    public T peek(){
        if(!isEmpty()) {
            return myList.get(myList.size() - 1);
        }
        else{
            return null;
        }
    }

    @Override
    public boolean isEmpty(){
        return myList.size() == 0;
    }





}
