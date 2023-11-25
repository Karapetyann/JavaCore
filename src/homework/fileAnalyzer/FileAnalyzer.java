package homework.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {
    public Map<String, Integer> wordMap(String path) {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (!wordCount.containsKey(line)) {
                    wordCount.put(line, 1);
                } else {
                    Integer i = wordCount.get(line);
                    wordCount.replace(line, ++i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public int totalWordCount(String path) {
        // Читаем файл, подсчитываем общее количество слов
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                ++wordCount;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public int uniqueWordCount(String path) {
        // Читаем файл, подсчитываем количество уникальных слов
        Set<String> uniqueWordCount = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                uniqueWordCount.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueWordCount.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) {
        // Читаем файл, находим топ-N часто встречающихся слов
        List<Map.Entry<String, Integer>> topWord = new ArrayList<>(wordMap(path).entrySet());
        topWord.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> temp = new HashMap<>();
        if (topWord.size() >= n) {
            for (int i = 0; i < n; i++) {
                temp.put(topWord.get(i).getKey(), topWord.get(i).getValue());
            }
        }
        return temp;
    }

    public int countWordOccurrences(String path, String word) {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(word)) {
                    ++wordCount;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
