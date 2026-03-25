class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ;i < V ;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int[] edge:edges){
            adj.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
        }
        //create the Queue
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ;i < V;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        //BFS
        int count =  0;
        while(!q.isEmpty()){
            int vertex = q .poll();
            count++;
            for(int nei:adj.get(vertex)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    q.add(nei);
                }
            }
        }
        return count == V;
    }
}