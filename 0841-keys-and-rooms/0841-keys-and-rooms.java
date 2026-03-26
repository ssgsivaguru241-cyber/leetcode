class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(0,rooms,vis);
        for(boolean v:vis){
            if(!v){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int room,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[room] = true;
        q.add(room);
        while (!q.isEmpty()) {
            int ver = q.poll();
            System.out.print(ver + " ");
            for (int neighbor : rooms.get(ver)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}