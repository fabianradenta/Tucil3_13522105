import java.util.Scanner;

public class Main {
    private static int inputMethod;
    private static String startWord;
    private static String endWord;

    public static void main(String[] args) {

        // TES
        String[] wordArray;
        wordArray = Utils.makeListOfWords("dictionary/words.txt");
        for (int i=0; i<wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
        System.out.println(wordArray.length);
        System.out.println(Utils.isWordExist(wordArray, "yes"));



        //MAIN
        // 1. START DAN INITIAL DECLARE
        Utils.showOpening();
        
        // 2. INPUT START WORD DAN END WORD
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan start word : ");
            startWord = scanner.nextLine();
            System.out.print("Masukkan end word : ");
            endWord = scanner.nextLine();
            scanner.close();
            boolean isStartWordValid = Utils.isWordExist(wordArray, startWord);
            boolean isEndWordValid = Utils.isWordExist(wordArray, endWord);

            if (isStartWordValid && isEndWordValid){
                break;
            }

            // output error input
            if (!isStartWordValid){
                System.out.println("\nTolong masukkan start word dengan benar.");
            } else {
                System.out.println("\nTolong masukkan end word dengan benar.");
            }
        }
    
        // 3. INPUT METODE
        Utils.showMethodMenu();
        try {
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan pilihan metode : ");
                Integer inputMethod = scanner.nextInt();
                scanner.close();
                if (inputMethod>0 && inputMethod<4){
                    break;
                }
            }
                
        // 4. PANGGIL ALGORITMA
            if (inputMethod==1){
                // TODO: CALL UCS METHOD

            } else if (inputMethod==2){
                // TODO: CALL GREEDY BEST FIRST SEARCH METHOD
            } else {
                // TODO: CALL A* METHOD
            }
            
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        // 5. OUTPUT HASIL DAN END
    }
}
