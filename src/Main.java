import java.util.*;

public class Main {
    private static Integer inputMethod;
    private static String startWord;
    private static String endWord;
    private static HashSet<String> wordArray;
    
    public static void main(String[] args) {
        
        // 1. DEKLARASI AWAL
        Scanner scanner = new Scanner(System.in);
        Utils.hii();
        
        // 2. INPUT START WORD DAN END WORD
        while (true){
            System.out.print("Masukkan start word : ");
            startWord = scanner.nextLine();
            startWord = startWord.toLowerCase();
            System.out.print("Masukkan end word : ");
            endWord = scanner.nextLine();
            endWord = endWord.toLowerCase();
            wordArray = Utils.makeListOfWords(startWord);

            if (startWord.length()==endWord.length() && wordArray.contains(startWord) && wordArray.contains(endWord)){
                break;
            }

            // output error input
            if (wordArray.contains(startWord)){
                System.out.println("\nTolong masukkan start word dengan benar.\n");
            } else if (wordArray.contains(startWord)){
                System.out.println("\nTolong masukkan end word dengan benar.\n");
            } else {
                System.out.println("\nPanjang start word dengan end word berbeda.\n");
            }
        }
    
        // 3. INPUT METODE
        Utils.showMethodMenu();
        while (true){
            System.out.print("Masukkan pilihan metode : ");
            if (scanner.hasNextInt()){
                inputMethod = scanner.nextInt();
                if (inputMethod>=1 && inputMethod<=3){
                    break;
                } else {
                    System.out.println("\nTolong masukkan inputMethod dengan benar.\n");
                    scanner.nextLine();
                } 
            } else {
                System.out.println("\nTolong masukkan inputMethod dengan benar.\n");
                scanner.nextLine();
            }
        }
            
        // 4. PANGGIL ALGORITMA
        long startTime = System.currentTimeMillis();

        if (inputMethod==1){
            UCS.findWordLadderSolution(startWord, endWord, wordArray);
        } else if (inputMethod==2){
            GreedyBFS.findWordLadderSolution(startWord, endWord, wordArray);
        } else {
            AStar.findWordLadderSolution(startWord, endWord, wordArray);
        }

        long endTime = System.currentTimeMillis();

        // 5. OUTPUT HASIL DAN END
        scanner.close();
        System.out.println("Waktu eksekusi : " + (endTime-startTime) + "ms\n");
        Utils.thanks();
    }
}
