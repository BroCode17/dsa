import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution{
    static int timer  = 0;
    public static void getBridges(List<ArrayList<Integer>> g, int n, int parent, List<List<Integer>> res, int[] low, int[] time, int[] visited) {
        visited[n] = 1;
        time[n] = low[n] = timer;
        timer++;

        for(int neighbor : g.get(n)) {
            if(neighbor == parent) continue;
            if(visited[neighbor] == 0) {
                getBridges(g, neighbor,n,res, time, low, visited);
                //when come back
                low[n] = Math.min(low[neighbor], low[n]);
                if(low[neighbor] > low[n]){
                     res.add(Arrays.asList(n, neighbor));
                }
            }else{
                 low[n] = Math.min(low[neighbor], low[n]);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1}, {1, 2},
                {2, 0}, {1, 3}
        };
        int n = 4;
        //Building Adj list
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add( new ArrayList<>());
        }

        int j = 0;
        for(int[] num: edges){
            int first = num[0];
            int second = num[1];
            graph.get(first).add(second);
            graph.get(second).add(first);
        }


//        for(int i = 0; i < graph.size(); i++){
//            int v  = graph.get(i).get(0);
//            int u  = graph.get(i).get(1);
//
//        }
        System.out.println(graph);

        int[] low = new int[n];
        int[] time = new int[n];
        int[] visited = new int[n];

        List<List<Integer>> res = new ArrayList<>();
        Solution.getBridges(graph, 0, 0,res, time, low, visited);

        System.out.println(res);
    }


}