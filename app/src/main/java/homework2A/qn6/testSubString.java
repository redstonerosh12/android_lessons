package homework2A.qn6;

public class testSubString {
    public static void main(String[] args){
        StringBuilder machine = new StringBuilder();
        String original = "Iwasdefault";
        machine.append(original); machine.append('c'); machine.append(' ');
        machine.append("IamveryNew");
        machine.delete(1, 4); //(inclusive, exclusive)
        String finish = machine.toString();
        System.out.println(finish);
    }

}
