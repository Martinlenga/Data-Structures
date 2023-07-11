import java.util.ArrayList;
import java.util.Arrays;
public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //if the Array is full resize it
        if(items.length==count){
            //create a new array (twice the size)
            int[] newItems = new int[count * 2];

            //copy all existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            //set items to this new array
            items = newItems;
        }
        //add new item at the end
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        //shift items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i +1];
        count--;
    }

    public int indexOf(int item){
        //o(n)
        for(int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }


    public static void main(String[] args){
        int [] numbers = {10, 20, 30};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Array digits = new Array(3);
        digits.insert(5);
        digits.insert(15);
        digits.insert(25);
        digits.insert(35);
        digits.removeAt(2);
        System.out.println(digits.indexOf(5));
        digits.print();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.remove(1);
        list.indexOf(90);
        System.out.println(list);
        System.out.println(list.contains(90));

    }
}
