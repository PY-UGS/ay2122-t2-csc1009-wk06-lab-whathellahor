import java.util.*;

public class Question1{
    public static LinkedList<Integer> addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        int size = list.size();
        //sorting algorithms
        for(int i=0;i<size;i++){
            int j = i+1;
            for(;j<size;j++){
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        int[] values = {1,3,5,7,9,11};
        for(int i=0; i<values.length; i++){
            linkedList.add(i, values[i]);
        }
        
        System.out.println("\n============== Question 1 ==============");
        System.out.println("List before: " + linkedList);
        System.out.print("Please enter a number: ");
        System.out.println("List after: " + addAndSort(linkedList, userInput.nextInt()));
        
        userInput.close(); 
    }
}