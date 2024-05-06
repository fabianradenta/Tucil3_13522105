

import java.util.ArrayList;

public class Node {
    public String currentNodeWord;
    public ArrayList<String> currentNodePath;

    public Node(String currentNodeWord, ArrayList<String> currentNodePath){
        this.currentNodePath = currentNodePath;
        this.currentNodeWord = currentNodeWord;
    }

}