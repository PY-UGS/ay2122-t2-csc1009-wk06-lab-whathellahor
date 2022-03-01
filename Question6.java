import java.util.*;

public class Question6 {
    public static void findValue(HashMap<UUID,Integer>hashyymap, Integer searchVal){
        int count = 0;
        boolean isFound = false;
        System.out.println(hashyymap.values());
        for (Integer key:hashyymap.values()){
            if((int)key==searchVal){
                System.out.println("Index: " + count);
                isFound = true;
                break;
            }
            count++;
        }
        
        if(isFound == false){
            System.out.println("Index: -1");
        }
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        HashMap <UUID, Integer> HashMap = new HashMap<UUID, Integer>();
        int randValue = (int)Math.floor(Math.random()*(9000)+1000);

        System.out.println("\n============== Question 6 ==============");
        System.out.println("Searching for: " + randValue);

        for(int i=0;i<500;i++){
            HashMap.put(UUID.randomUUID(),(int)Math.floor(Math.random()*(9000)+1000));
        }
        findValue(HashMap, randValue);

        userInput.close();
    }
}