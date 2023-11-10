package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("please input folder path, and fileName | comma ',' separate ");
        String pathStr = scanner.nextLine();
        String[] path = pathStr.split(",");
        File file = new File(path[0]);
        if (!file.exists()) {
            System.out.println(false);
            return;
        }
        file = new File(path[0] + File.separator + path[1]);
        System.out.println(file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input folder path and keyword | comma ',' separate");
        String filekeyStr = scanner.nextLine();
        String[] filekey = filekeyStr.split(",");
        File[] files = new File(filekey[0]).listFiles();
        if (files == null) {
           return;
        }
        for (File file : files) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                String word = "";
                while ((word = bf.readLine()) != null) {
                    if (word.contains(filekey[1])) {
                        System.out.println(file.getName());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input txt file path and keyword | comma ',' separate");
        String filepathStr = scanner.nextLine();
        String[] filepath = filepathStr.split(",");
        File file = new File(filepath[0]);
        int numberOfLine = 0;
        int linee = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String word = "";
            while ((word = bf.readLine()) != null) {
                linee++;
                if (word.contains(filepath[1])) {
                    System.out.println(linee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input folder path");
        String filepath = scanner.nextLine();
        File[] file = new File(filepath).listFiles();
        long foldersSpace = 0;
        if (file != null) {
            for (File f : file) {
                foldersSpace = foldersSpace + f.getUsableSpace();
            }
            System.out.println(foldersSpace);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void ecrateFileWithContent() {
        System.out.println("please input folder path and fileName and content | comma ',' separate");
        String newfileStr = scanner.nextLine();
        String[] newfile = newfileStr.split(",");
        File file = new File(newfile[0] + File.separator + newfile[1]);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(newfile[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
