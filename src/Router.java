import java.util.ArrayList;

public class Router {
    private String name;
    private ArrayList<String> neighbors = new ArrayList<String>();
    private ArrayList<Integer> cost = new ArrayList<Integer>();
    private ArrayList<String> destinations = new ArrayList<String>();
    private ArrayList<String> routingTable = new ArrayList<String>();


    public Router(String name /*TODO*/) {
        this.name = name;
        /*TODO*/
    }

    public void displayTable(ArrayList<String> routingTable) {
        /*TODO*/
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
