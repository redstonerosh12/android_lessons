package homework2B.qn1;

public class Fibonacci {

    private int[] data;
    private int max;
    private int calls;

    Fibonacci(int max){
        this.max = max;
        data = new int[max];
        data[0] = 0;
        data[1] = 1;

    }

    public int getFibonacciNumber(int n){

        if(n < 0){
            throw new IllegalArgumentException("n can only be greater than or equal to 0");
        }

        calls = 0;
        if(n >= max){
            return -1;
        }
        else{
            return fibRecursive(n);
        }

    }

    private int fibRecursive(int n) {
        calls += 1;
        if(n != 0 && n != 1 && data[n] == 0) {
            data[n] = fibRecursive(n-1) + fibRecursive(n-2);
        }
        return data[n];
    }
    public int getCalls(){
        return calls;
    }

    public int[] getData(){
        return data;
    }
}


