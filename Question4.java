import java.util.*;

public class Question4 {

    public static HashMap<UUID, Integer> sortValues(HashMap<UUID, Integer> hashMap){
		List<Map.Entry<UUID, Integer> > hashList = new LinkedList<Map.Entry<UUID, Integer> >(hashMap.entrySet());

		Collections.sort(hashList, new Comparator<Map.Entry<UUID, Integer> >() {
			public int compare(Map.Entry<UUID, Integer> h1, Map.Entry<UUID, Integer> h2)
			{   
                return (h1.getValue()).compareTo(h2.getValue());    
            }
		});
		
		HashMap<UUID, Integer> tempMap = new LinkedHashMap<UUID, Integer>();
		for (Map.Entry<UUID, Integer> values : hashList) {
			tempMap.put(values.getKey(), values.getValue());
		}
		return tempMap;
	}

	public static void main(String[] args){
		HashMap<UUID, Integer> hashMap = new HashMap<UUID, Integer>();
		Scanner userInput = new Scanner(System.in);

        int[] values = {1,3,5,7,9,11};
        for(int i=0; i<values.length; i++){
            hashMap.put(UUID.randomUUID(), values[i]);
        }
		
        System.out.println("\n============== Question 4 ==============");
        System.out.println("Original hash values: " + Arrays.toString(values));
        
		System.out.print("Please enter a number: ");
		hashMap.put(UUID.randomUUID(), userInput.nextInt());
        
		Map<UUID, Integer> hashMapp = sortValues(hashMap);

		System.out.println("Edited hash values: " + hashMapp.values());

		userInput.close();
	}
}