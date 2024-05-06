import java.util.*;

public class AStarNodeComparator implements Comparator<Node>{

    private String endWord;

    public AStarNodeComparator(String endWord){
        this.endWord = endWord;
    }

    public int getHeuristic(String word){
        int res = 0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) != endWord.charAt(i)){
                res++;
            }
        }
        return res;
    }
    @Override
    public int compare(Node n1, Node n2) {
        if ((n1.currentNodePath.size() + getHeuristic(n1.currentNodeWord)) > (n2.currentNodePath.size() + getHeuristic(n2.currentNodeWord))){
            return 1;
        } else if (n1.currentNodePath.size() < n2.currentNodePath.size()){
            return -1;
        } else {
            return 0;
        }
    }
}