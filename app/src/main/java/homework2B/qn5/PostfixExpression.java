package homework2B.qn5;



public class PostfixExpression extends FixExpression {


    public PostfixExpression(String expression){
        super(expression);
    }

    @Override
    public int evaluateExpression(){
        String numStr = "0123456789";
        String opStr = "+-*/";
        StackImpl<Integer> numStack = new StackImpl<>();
        Integer output = 0;

        for(int idx=0; idx < getExpression().length(); idx++){

            char focusChar = getExpression().charAt(idx);

            if(numStr.indexOf(focusChar) >= 0){ //if char is num
                numStack.push((Integer)(int)focusChar - 48);
            }

            else if(opStr.indexOf(focusChar) >= 0){ //if char is operand
                Integer num2 = numStack.pop();
                Integer num1 = numStack.pop();

                if(num1 == null || num2 == null){
                    throw new IndexOutOfBoundsException("Operation requires 2 integers prefixing it!");
                }


                if(focusChar == '+'){numStack.push((num1 + num2));}
                else if(focusChar == '-'){numStack.push((num1 - num2));}
                else if(focusChar == '*'){numStack.push((num1 * num2));}
                else if(focusChar == '/'){numStack.push((num1 / num2));}
            }
        }

        output = numStack.pop();
        if (!numStack.isEmpty()){
            throw new IndexOutOfBoundsException(("Operation cannot be done with more than 2 integers prefixing it!"));
        }
        return output;
    }



}
