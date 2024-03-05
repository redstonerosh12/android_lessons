package homework2A.qn6;

public class TestPermutation {
    public static void main(String[] args){
        Permutation abcd = new Permutation("abcd");
        abcd.permute();
        System.out.println(abcd.getA().toString());
    }
}
