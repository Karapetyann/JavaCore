package homework.eXampleForMe;

public class ReversName {
    private char[] name;

    ReversName(char[] name) {
        this.name = name;
    }

    void revers() {
        int s = name.length;
        char temp;
        for (int i = 0; i < s / 2; i++) {
            temp = name[s - i - 1];
            name[s - i - 1] = name[i];
            name[i] = temp;
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
