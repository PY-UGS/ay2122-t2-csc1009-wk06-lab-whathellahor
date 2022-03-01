import java.util.*;

public class Question3 {
    public static int findValue(LinkedList<Integer> list, int searchVal){
        return list.indexOf(searchVal);
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        int[] values = {1,3,5,7,9,11};
        for(int i=0; i<values.length; i++){
            linkedList.add(i, values[i]);
        }
        
        System.out.println("\n============== Question 3 ==============");
        LinkedList<Integer> linkeyList = new LinkedList<Integer>();
        int randValue = (int)Math.floor(Math.random()*(9000)+1000);
        System.out.println("Searching for: " + randValue);

        for(int i=0;i<500;i++){
            linkeyList.add((int)Math.floor(Math.random()*(9000)+1000));
        }
        System.out.println(linkeyList);
        System.out.println("Index: " + findValue(linkeyList, randValue));

        userInput.close();
    }
}