package GameMap;
import Movement.Move;
import java.util.HashMap;

public class woods_06 {

    private final String currentLocation = "woods_01"; // need getter/setter
    private final static String description = "This is a dark forest";
    private final String nextDestinations = "East";
    //private final object music = // will play music while at this location
    //private final Object artwork = // will constantly display while on this location
    //HashMap<String, String> rooms = new HashMap<String, String>();
    //ArrayList<int> storyEvent = new ArrayList<int>  contains possible story events listed by number per story class
    //ArrayList<Object> item = new ArrayList<Object>();
    //ArrayList<String> npc = new ArrayList<String>(); // contains all npc types available to spawn in this room
    
    public static void getDescription () {
     System.out.println(description);
    }
    
    
    //public String getNextDestinations (String input) {
     // if (rooms.contains(input.equalsIgnoreCase(input)) {
     //   return(rooms.getKey(input);
   // }
    
    //public String getItems () {
     // if (item.contains(input.equalsIgnoreCase(input)) {
      //  return(item.get(input))	
      //  item.delete(input);  //remove object from array
    //}
    
    //public String getNpc () {
      //  int range = npc.length();
        //int random = math.random(0, range) // use random int in range to determine returned npc
        //return npc.get(random);
   // }
    
   // public int triggerEvent () {
       // // what would trigger an event?
   // }
}