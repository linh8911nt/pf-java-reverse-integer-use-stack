import java.util.Stack;

public class ReverseIntegerUseStack {
    public static void main(String[] args) {
        int[] listNumber = {1, 4, 3, 2, 5};
        reverseInterger(listNumber);
        for (int list : listNumber) {
            System.out.print(list + " ");
        }

        String name = "Jonhathan";
        System.out.println(reverseString(name));
    }

    public static int[] reverseInterger(int[] listNumber){
        Stack numberStack = new Stack();
        for (int i = 0; i < listNumber.length; i++) {
            numberStack.push(listNumber[i]);
        }
        for (int i = 0; i < listNumber.length; i++) {
            listNumber[i] = (int) numberStack.pop();
        }
        return listNumber;
    }

    public static String reverseString(String wString){
        Stack stringStack = new Stack();
        char character;
        for (int i = 0; i < wString.length(); i++) {
            character = wString.charAt(i);
            stringStack.push(character);
        }
        String ouput = "";
        for (int i = 0; i < wString.length(); i++) {
            character = (char) stringStack.pop();
            ouput = ouput + character;
        }
        return ouput;
    }
}
