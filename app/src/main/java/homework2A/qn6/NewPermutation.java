package homework2A.qn6;

import java.util.ArrayList;

public class NewPermutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<>();
    // additional attribute if needed

    NewPermutation(final String str){
        in = str;
        // additional initialization if needed

    }
    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        generatePermutation("", in);

    }

    private void generatePermutation(String fixedPath, String options){
        if(options.length() == 0){
            a.add(fixedPath);
        }
        else{
            for(int idx=0; idx < options.length(); idx++){
                String newFixedPath = fixedPath + options.charAt(idx);
                String newOptions = options.substring(0, idx) + options.substring(idx+1, options.length());
                generatePermutation(newFixedPath, newOptions);
            }
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}
