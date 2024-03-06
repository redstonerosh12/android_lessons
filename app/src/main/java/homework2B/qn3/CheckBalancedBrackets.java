package homework2B.qn3;

//import CustomStack;
//import StackImpl;

public class CheckBalancedBrackets {

    public static void main(String[] args) {

        System.out.println(isOpenBracket('('));
        System.out.println( isOpenBracket('a'));
        System.out.println(isCloseBracket(']'));
        System.out.println(isCloseBracket('a'));
        System.out.println( isMatchBracket('(',')'));
        System.out.println( isMatchBracket('a','a'));
        System.out.println(isBalancedBrackets("()[]()"));
        System.out.println(isBalancedBrackets("([]())"));
    }

    public static boolean isBalancedBrackets( String expression ){
        StackImpl<Character> bracketStack = new StackImpl<>();

        for(int idx=0; idx < expression.length(); idx++){
            Character currentChar = expression.charAt(idx);

            if(isOpenBracket(currentChar)){
                bracketStack.push(currentChar);
            }
            else if(isCloseBracket(currentChar)){
                Character c1 = bracketStack.pop();
                Character c2 = currentChar;
                if(!isMatchBracket(c1, c2)){
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();

    }

    public static boolean isOpenBracket( char c){
        String brackets = "({[";
        return brackets.indexOf(c) >= 0;
    }

    public static boolean isCloseBracket(char c){
        String brackets = ")}]";
        return brackets.indexOf(c) >= 0;
    }

    public static boolean isMatchBracket(char c1, char c2){
        return ((c1 == '(' && c2 == ')') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '[' && c2 == ']'));
    }
}


