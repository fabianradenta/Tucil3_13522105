import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Utils {

    public static HashSet<String> makeListOfWords(String word){
        HashSet<String> res = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("dictionary/words.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                if (line.length() == word.length()){
                    res.add(line);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return res;
    }

    public static boolean isWordExist(HashSet<String> wordList, String word){
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

    public static void hii(){
        System.out.println("Selamat datang di Program Pencarian Solusi Word Ladder\n");
        System.out.println("Untuk menggunakan program ini, silakan persiapkan masukan berikut :");
        System.out.println("- kata awal pencarian");
        System.out.println("- kata akhir pencarian");
        System.out.println("- metode pencarian yang akan digunakan\n");
        System.out.println("Ayo kita mulai!");
    }

    public static void thanks(){
        System.out.println("=======================");
        System.out.println("     Terima Kasih      ");
        System.out.println("=======================");
        System.out.println("       ₊˚.⊹♡⊹.˚₊       ");
    }
}
