import java.util.*;
public class ReconstructItinerary {
    public static String getStart(HashMap<String, String> tickets) {
        HashSet<String> revMap = new HashSet<>();
        for (String key : tickets.keySet()) {
            revMap.add(tickets.get(key));
        }
        for(String key : tickets.keySet()) {
            if (!revMap.contains(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");     
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key: tickets.keySet()){
            System.out.print(" -> "+ tickets.get(start)); 
            start = tickets.get(start);

        }
        System.out.println();

    }
}