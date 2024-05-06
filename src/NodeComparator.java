import java.util.*;

public class NodeComparator implements Comparator<Node>{

    @Override
    public int compare(Node n1, Node n2) {
        if (n1.currentNodePath.size() > n2.currentNodePath.size()){
            return 1;
        } else if (n1.currentNodePath.size() < n2.currentNodePath.size()){
            return -1;
        } else {
            return 0;
        }
    }
}