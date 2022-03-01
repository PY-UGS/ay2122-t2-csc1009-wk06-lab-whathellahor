import java.util.*;

public class Question2 {
    public static LinkedList<Integer> swapValues(LinkedList<Integer> list, int index1, int index2){
        int val1 = list.get(index1);
        int val2 = list.get(index2);
        list.set(index1, val2);
        list.set(index2, val1);
        return list;
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        int[] values = {1,3,5,7,9,11};
        for(int i=0; i<values.length; i++){
            linkedList.add(i, values[i]);
        }
        
        System.out.println("\n============== Question 2 ==============");
        System.out.println("List before: " + linkedList);
        System.out.print("Enter two indexes to swap position, seperated by commas: ");
        String[] choice = (userInput.next()).split(", ?");
        System.out.println("List after: " + swapValues(linkedList, Integer.parseInt(choice[0]), Integer.parseInt(choice[1])));

        userInput.close();
    }
}