package homework.fileAnalyzer;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FileAnalyzerMain {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final FileAnalyzer FILE_ANALYZER = new FileAnalyzer();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Input 1: count of words)");
            System.out.println("Input 2: all word count of file");
            System.out.println("Input 3: unique words count in the file");
            System.out.println("Input 4: top N Frequent words");
            System.out.println("Input 5: count Word Occurrences");
            switch (SCANNER.nextLine()) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    wordMap();
                    break;
                case "2":
                    System.out.println("please write path of the file");
                    String filePath = SCANNER.nextLine();
                    System.out.println(FILE_ANALYZER.totalWordCount(filePath));
                    break;
                case "3":
                    System.out.println("please write path of the file");
                    String Path = SCANNER.nextLine();
                    System.out.println(FILE_ANALYZER.uniqueWordCount(Path));
                    break;
                case "4":
                    topFrequentWords();
                    break;
                case "5":
                    countWordOccurrences();
                    break;

            }
        }
    }

    private static void wordMap() {
        System.out.println("please input path of the file");
        String filePath = SCANNER.nextLine();
        Map<String, Integer> map = FILE_ANALYZER.wordMap(filePath);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void topFrequentWords() {
        System.out.println("please write path of the file");
        String filePath = SCANNER.nextLine();
        System.out.println("please input top N for top Frequent Words");
        int topN = 0;
        try {
            topN = Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Map<String, Integer> map = FILE_ANALYZER.topFrequentWords(filePath, topN);
        System.out.println(topN + " frequently occurring words in the file");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void countWordOccurrences() {
        System.out.println("please input path of the file");
        String path = SCANNER.nextLine();
        System.out.println("please input the word");
        String word = SCANNER.nextLine();
        System.out.println("this word Occurrences " + FILE_ANALYZER.countWordOccurrences(path, word));
    }
}
