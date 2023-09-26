package homework.braceChecker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String st) {
        text = st;
        for (int i = 0; i < st.length(); i++) {
            stack.push(st.charAt(i));
        }
    }

    public void check() {
        int index;
        for (int i = 0; i < stack.array.length; i++) {
            char pp = stack.array[i];
            switch (pp) {
                case '(':
                    for (int j = i; j <= stack.array.length; j++) {
                        if (text.charAt(j) == ')') {
                            System.out.println("True");
                            break;
                        } else if (text.charAt(j) == '}') {
                            System.out.println("Error: opened ( but closed } at:" + j);
                            break;
                        } else if (text.charAt(j) == ']') {
                            System.out.println("Error: opened ( but closed ] at:" + j);
                            break;
                        }
                    }
                    break;
                case '[':
                    for (int j = i; j <= stack.array.length; j++) {
                        if (text.charAt(j) == ']') {
                            System.out.println("True");
                            break;
                        } else if (text.charAt(j) == ')') {
                            System.out.println("Error: opened [ but closed ) at:" + j);
                            break;
                        } else if (text.charAt(j) == '}') {
                            System.out.println("Error: opened [ but closed } at:" + j);
                            break;
                        }
                    }
                    break;
                case '{':
                    for (int j = i; j <= stack.array.length; j++) {
                        if (text.charAt(j) == '}') {
                            System.out.println("True");
                            break;
                        } else if (text.charAt(j) == ')') {
                            System.out.println("Error: opened { but closed ) at:" + j);
                            break;
                        } else if (text.charAt(j) == ']') {
                            System.out.println("Error: opened { but closed ] at:" + j);
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }


        }


    }
}
