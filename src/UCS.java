import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class UCS {
    public static void findWordLadderSolution(String startWord, String endWord, HashSet<String> dictionary){
        PriorityQueue<Node> pq = new PriorityQueue<>(new UCSNodeComparator());
        HashSet<String> visitedNode = new HashSet<>();
        
        Node startNode = new Node(startWord, new ArrayList<>());
        startNode.currentNodePath.add(startWord);
        pq.offer(startNode);
        Node checker = new Node("a",new ArrayList<>());
        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            
            if (current.currentNodeWord.equals(endWord)) {
                System.out.println("\nPath ditemukan : " + current.currentNodePath);
                System.out.println("Jumlah node dikunjungi : " + visitedNode.size());
                break;
            }
            
            visitedNode.add(current.currentNodeWord);
            
            for (String neighbor : getNeighbors(current.currentNodeWord, dictionary)) {
                if (!visitedNode.contains(neighbor)) {
                    Node neighborNode = new Node(neighbor, new ArrayList<>(current.currentNodePath));
                    neighborNode.currentNodePath.add(neighbor);
                    pq.offer(neighborNode);
                }
            }
            checker = current;
        }
        if (checker.currentNodePath.size()==0){
            System.out.println("\nPencarian tidak ditemukan.\n");
        }
    }
    
    private static ArrayList<String> getNeighbors(String word, HashSet<String> dictionary) {
        ArrayList<String> neighbors = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                StringBuilder neighborBuilder = new StringBuilder(word);
                neighborBuilder.setCharAt(i, c);
                String neighbor = neighborBuilder.toString();
                if (!neighbor.equals(word) && dictionary.contains(neighbor)) {
                    neighbors.add(neighbor);
                }
            }
        }
        return neighbors;
    }
}