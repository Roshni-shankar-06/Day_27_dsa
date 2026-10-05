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
        
    
    
