class Solution {
    class Node{
        int city;
        int cost;
        int stops;
        Node(int city,int cost,int stops){
            this.city = city;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<int[]>[] adj = new List[n];
        for(int i = 0 ;i < n ; i++){
           adj[i] = new ArrayList<>();
        }
        for(int[] flight : flights){
            adj[flight[0]].add(new int[]{flight[1],flight[2]});
        }
        int[][] dist = new int[n][k+2];
        for(int i = 0 ;i < n ; i++){
        Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[src][0] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.cost - b.cost);
        pq.add(new Node(src , 0 , 0));
        while (!pq.isEmpty()){
            Node node = pq.poll();
            int city = node.city;
            int cost = node.cost;
            int stops = node.stops;
            if(city == dst){
                return cost;
            }
            if(stops > k){
                 continue;
            }
            for(int[] edge:adj[city]){
                int nextCity = edge[0];
                int price = edge[1];
                int newCost = cost+price;
                if(newCost<dist[nextCity][stops + 1]){
                    dist[nextCity][stops + 1] = newCost;
                    pq.add(new Node(nextCity,newCost,stops+1));
                }
            }
        }
        return -1;
    }
}