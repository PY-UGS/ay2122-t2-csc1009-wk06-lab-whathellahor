import java.util.*;

public class Question5 {
    public static LinkedHashMap<UUID, Integer> changeValueHash (LinkedHashMap<UUID, Integer> map, Integer num1, Integer num2){ 
        ArrayList<UUID> arrayList = new ArrayList<>(); 
        arrayList.addAll(map.keySet()); 
 
        Collections.swap(arrayList, num1, num2); 
 
        LinkedHashMap<UUID, Integer> linkedHashMap = new LinkedHashMap<>(); 
 
        for(UUID key:arrayList){ 
            linkedHashMap.put(key, map.get(key)); 
        }

        return linkedHashMap;
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        LinkedHashMap<UUID, Integer> linkedHashMap = new LinkedHashMap<>(); 

        int [] values = {1,3,5,7,9,11};
        for(int i=0; i<values.length;i++){
            linkedHashMap.put(UUID.randomUUID(),values[i]);
        }
 
        System.out.println("\n============== Question 5 ==============");
        System.out.println("Original hash values: " + linkedHashMap.values()); 
        System.out.print("Enter two indexes to swap position, seperated by commas: ");
        String[] choice = (userInput.next()).split(", ?");
 
        LinkedHashMap<UUID, Integer> hashMapp = changeValueHash(linkedHashMap, Integer.parseInt(choice[0]), Integer.parseInt(choice[1]));
        System.out.println("Edited hash values: " + hashMapp.values());
        userInput.close();
    }
}