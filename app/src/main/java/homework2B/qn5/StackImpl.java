package homework2B.qn5;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements CustomStack<T> {

    private List<T> dataStorage;

    // constructor must be public
    public StackImpl(){
        dataStorage = new ArrayList<>();
    }

    // default statements provided below to avoid compile-time errors

    @Override
    public void push(T t){
        dataStorage.add(t);
    }

    @Override
    public T pop(){
        T out = peek();
        if(!isEmpty()) {
            dataStorage.remove(dataStorage.size() - 1);
        }
        return out;
    }

    @Override
    public int size(){
        return dataStorage.size();
    }

    @Override
    public T peek(){
        if(!isEmpty()) {
            return dataStorage.get(dataStorage.size() - 1);
        }
        else{
            return null;
        }
    }

    private int getLastIndex(){
        return dataStorage.size()-1;
    }

    @Override
    public boolean isEmpty(){
        return dataStorage.size() == 0;
    }
}
