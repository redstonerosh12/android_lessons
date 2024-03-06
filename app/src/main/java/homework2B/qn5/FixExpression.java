package homework2B.qn5;

// COPY AND PASTE YOUR SOLUTION FROM THE PREVIOUS QUESTION HERE

public abstract class FixExpression {


    private String expression;
    private String validChars = "0123456789+-*/";

    // you may encounter issues if this is not declared public
    public FixExpression(String expression){
        this.expression = expression;
    }

    // complete this method
    public boolean isValidString(){
        for(int idx=0; idx < expression.length(); idx++){
            if(validChars.indexOf(expression.charAt(idx)) < 0){
                return false;
            }
        }
        return true;
    }

    public String getExpression() {
        return expression;
    }

    public String getValidChars() {
        return validChars;
    }

    public abstract int evaluateExpression();

}
