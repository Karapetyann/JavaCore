package homework.braceChecker;

import classwork.chapter6.Stack;

public class BraceChecker {
    private String text;
    private Stack stack = new Stack();
    public BraceChecker(String st) {
        text = st;
    }
    char c;
    public void check() {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.getSize() == -1) {
                        System.out.println("Error: closed " + text.charAt(i) + " but didn't open " + i);
                    } else {
                        c = (char) stack.pop();
                        if (text.charAt(i) == ')' && c != '(' || text.charAt(i) == ']' && c != '[' || text.charAt(i) == '}' && c != '{') {
                            System.out.println("error " + c + " but closed" + text.charAt(i) + " :" + i);
                        }
                    }
            }
        }
        for (int i = 0; i <= stack.getSize(); ) {
            System.out.println("error opened " + (char) stack.pop() + " but don't closed");
        }
    }
}