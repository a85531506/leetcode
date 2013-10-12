/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(node==null)return null;
        HashMap<UndirectedGraphNode,UndirectedGraphNode> clone=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        return cloneGraph(node,clone);
        
    }
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node, HashMap<UndirectedGraphNode,UndirectedGraphNode> clone){
        if(node==null)return null;
        if(clone.containsKey(node)){
            UndirectedGraphNode n=clone.get(node);
            return n;
        }
        UndirectedGraphNode n=new UndirectedGraphNode(node.label);
        clone.put(node,n);
        for(int i=0;i<node.neighbors.size();i++){
            UndirectedGraphNode newnode=cloneGraph(node.neighbors.get(i),clone);
            n.neighbors.add(newnode);
        }
        
        return n;
    }
}