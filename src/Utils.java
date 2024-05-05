import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {

    public static String[] makeListOfWords(String filePath){
        ArrayList<String> resArrList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                resArrList.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        String[] resList = resArrList.toArray(new String[0]);
        return resList;
    }

    public static boolean isWordExist(String[] wordList, String word){
        for (String w : wordList){
            if (w.equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void showMethodMenu(){
        System.out.println("\nPilih metode pencarian yang digunakan\t:");
        System.out.println("1. UCS");
        System.out.println("2. Greedy Best First Search");
        System.out.println("3. A*\n");
    }

    public static void showOpening(){
        //TODO: IMPLEMENT SHOW OPENING
    }

}