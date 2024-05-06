import java.util.*;

public class Main {
    private static Integer inputMethod;
    private static String startWord;
    private static String endWord;
    
    public static void main(String[] args) {
        
        // TES
        HashSet<String> wordArray = Utils.makeListOfWords("dictionary/words.txt");
        for (String word : wordArray){
            System.out.println(word);
        }
        System.out.println(wordArray.size());
        System.out.println(Utils.isWordExist(wordArray, "yes"));
        
        
        
        //MAIN
        // 1. START DAN INITIAL DECLARE
        Utils.showOpening();
        Scanner scanner = new Scanner(System.in);
        
        // 2. INPUT START WORD DAN END WORD
        while (true){
            System.out.print("Masukkan start word : ");
            startWord = scanner.nextLine();
            System.out.print("Masukkan end word : ");
            endWord = scanner.nextLine();

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
            // TODO: CALL GREEDY BEST FIRST SEARCH METHOD
        } else {
            // TODO: CALL A* METHOD
        }

        long endTime = System.currentTimeMillis();

        // 5. OUTPUT HASIL DAN END
        scanner.close();
        System.out.println("Waktu eksekusi : " + (endTime-startTime) + "ms\n");
    }
}
