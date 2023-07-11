import java.util.Stack;
public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.isEmpty());
        stack.push("Minecraft");
        stack.push("Red Dead");
        stack.push("NBA");
        stack.push("FIFA");
        stack.push("Warzone");

        //String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("NBA"));
    }
}
