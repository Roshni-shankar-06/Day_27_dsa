import java.util.*;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> itinerary = new LinkedList<>();
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        
        // Step 1: Build the adjacency list graph.
        // Using PriorityQueue ensures destinations are visited in lexicographical order.
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dest = ticket.get(1);
            graph.computeIfAbsent(src, k -> new PriorityQueue<>()).add(dest);
        }
        
        // Step 2: Start DFS from the mandatory starting airport "JFK".
        dfs("JFK", graph, itinerary);
        
        return itinerary;
    }
    
    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> itinerary) {
        PriorityQueue<String> destinations = graph.get(airport);
        
        // Step 3: Travel through all available edges (tickets) out of this airport.
        while (destinations != null && !destinations.isEmpty()) {
            // Remove the lexicographically smallest destination to prevent reusing the ticket.
            String nextAirport = destinations.poll();
            dfs(nextAirport, graph, itinerary);
        }
        
        // Step 4: Backtracking step. Add to the front of the list when dead-end is reached.
        itinerary.addFirst(airport);
    }
}
