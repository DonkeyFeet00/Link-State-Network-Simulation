import java.util.ArrayList;

public class Router {
    private String name;
    private ArrayList<String> neighbors = new ArrayList<>();
    private ArrayList<Integer> cost = new ArrayList<>();
    private ArrayList<String> destinations = new ArrayList<>();
    private ArrayList<String[]> routingTable = new ArrayList<>();


    //constructor
    public Router(String name, ArrayList<String> neighbors, ArrayList<String> destinations /*TODO*/) {
        this.name = name;
        this.neighbors = neighbors;
        this.destinations = destinations;

        //makes a routing table without any lines or costs
        //each line consists of {destination, line, cost}
        for(int i = 0; i < destinations.size(); i++) {
            String[] routingLine = {destinations.get(i), "-", "-1"};
            routingTable.add(routingLine);
        }
        /*TODO*/
    }

    public void displayTable(ArrayList<String[]> routingTable) {
        //loop through and print
        for (int i = 0; i < routingTable.size(); i++) {
            System.out.println(routingTable.get(i));
        }
    }

    public void builder(/*TODO*/) {
        /*TODO*/
    }

    public void listener(/*TODO*/) {
        /*TODO*/
    }

    public void changeCost(int neighborNum, int newCost) {
        this.cost.set(neighborNum - 1, newCost);
    }
}
