import java.util.*;

public class GreedyBFS {
    private static ArrayList<String> visitedNode = new ArrayList<>();

    private static int heuristic(String word, String endWord){
        int res = 0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) != endWord.charAt(i)){
                res++;
            }
        }
        return res;
    }

    private static String getMinimumDistance(String currentWord, String endWord, HashSet<String> dictionary) {
        ArrayList<String> neighbors = new ArrayList<>();
        int currentMin = 999;
        String res = currentWord;
        for (int i = 0; i < currentWord.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                StringBuilder neighborBuilder = new StringBuilder(currentWord);
                neighborBuilder.setCharAt(i, c);
                String neighbor = neighborBuilder.toString();
                if (!neighbor.equals(currentWord) && dictionary.contains(neighbor)) {
                    neighbors.add(neighbor);
                }
            }

            for (String w : neighbors){
                if (heuristic(w, endWord) < currentMin){
                    currentMin = heuristic(w, endWord);
                    res = w;
                }
            }
        }
        return res;
    }

    public static void findWordLadderSolution(String currentWord, String endWord, HashSet<String> dictionary){
        if (currentWord.equals(endWord)){
            visitedNode.add(currentWord);
            System.out.println("\nPath ditemukan : " + visitedNode);
            System.out.println("Jumlah node dikunjungi : " + visitedNode.size());
            return;
        }
        else if (visitedNode.contains(currentWord)) {
            System.out.println("\nHasil pencarian tidak ditemukan\n");
            return;
        }
        else {
            visitedNode.add(currentWord);
            findWordLadderSolution(getMinimumDistance(currentWord, endWord, dictionary), endWord, dictionary);
        }
    }
}