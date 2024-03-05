package homework2A.qn6;
import java.util.ArrayList;


public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed



    Permutation(final String str){
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

                generatePermutation(
                        newFixedPath, getOptions(options,  options.charAt(idx))
                );
            }
        }
    }
    private String getOptions(String currentOptions, char fixedLetter){
        StringBuilder newOpts = new StringBuilder();
        for(int idx=0; idx < currentOptions.length(); idx++){
            char charAtIdx = currentOptions.charAt(idx);
            if(charAtIdx != fixedLetter){
                newOpts.append(charAtIdx);
            }

        }
        return newOpts.toString();

    }

    public ArrayList<String> getA(){
        return a;
    }
}
