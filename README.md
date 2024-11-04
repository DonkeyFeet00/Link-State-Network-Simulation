# Link-State-Network-Simulation

tentative plan
* make a "router" class
  *  variables:
      - Name (e.g., R1)
      - Neighbors (List of the directly connected routers)
      - Cost (Cost of links between the router and the directly connected neighbors - the cost represents the delay of communication on that link in milliseconds)
      - Destinations (List of all routers in the network)
      - Routing table:  (initially contains all the destinations and with the shortest path as ‘-1’ except for the directly connected neighbors). For each destination router: the table shows the destination router, the neighbor the router will use to reach such a destination (we referred to in lectures as the line), and t
   * methods:
      - Display_table: shows the developed routing table (line by line).
      - Builder: builds one packet (e.g., string object) that contains the router’s name, neighbors, and the corresponding cost for each neighbor. The packet is then sent to all other routers in the network. All routers in the networks are running the Listener.
      - Listener: listens to packets sent by other routers, computes the shortest path to other routers, and updates the routing table accordingly whenever needed.
      - Change_Cost: allows the user of your simulator to simulate a change in the cost between the router and one of its directly connected neighbors. This function accepts two integers; the first identifies the neighbor, and the second identifies the new cost.
           - R1.Change_Cost(2, 400); is to change the cost between R1 and its second neighbor (from the Neighbors list) to 400. Calling this function requires the call of the Builder function to update all other routers in the network with such change.
     
