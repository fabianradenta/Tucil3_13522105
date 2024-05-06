import java.util.*;

public class GreedyBFSNodeComparator implements Comparator<Node>{

    private String endWord;

    public GreedyBFSNodeComparator(String endWord){
        this.endWord = endWord;
    }

    public int heuristic(String word){
        Integer res = 0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) != endWord.charAt(i)){
                res++;
            }
        }
        return res;
    }

    @Override
    public int compare(Node n1, Node n2) {
        int heu1 = heuristic(n1.currentNodeWord);
        int heu2 = heuristic(n2.currentNodeWord);

        return Integer.compare(heu1, heu2);
    }
}
