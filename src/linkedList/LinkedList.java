package linkedList;

public class LinkedList {

    Node firstNode;
    private final String green = "\u001b[32m";
    private final String yellow = "\u001b[33m";
    private final String magenta = "\u001b[35m";
    private final String gray = "\u001b[30m";
    private final String reset = "\033[0m";

    public LinkedList() {
        this.firstNode = null;
    }

    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String word) {
        clear();
        word = word.toLowerCase();
        int wc = 1;
        for (int i = word.length() - 1; i > -1; i--) {
            if (word.substring(i, i + 1).equals(" ")) {
                wc++;
            }
            Node newNode = new Node(word.substring(i, i + 1), wc);
            if (isEmpty()) {
                firstNode = newNode;
            } else {
                newNode.nextNode = firstNode;
                firstNode = newNode;
            }
        }
    }

    public void copy(LinkedList C) {
        String tempC = "";
        Node temp = this.firstNode;
        while (true) {
            tempC += temp.getData();
            temp = temp.nextNode;
            if (temp == null) {
                break;
            }
        }
        C.clear();
        C.add(tempC);
    }

    public void clear() {
        firstNode = null;
    }

    public void check(LinkedList g, LinkedList c) {
        this.copy(c);

        //green check
        Node tempc = c.firstNode;
        Node tempg = g.firstNode;
        while (tempc != null && tempg != null) {
            if (tempc.getData().equals(tempg.getData())) {
                if (!tempc.getData().equals(" ")) {
                    tempc.setData(green + tempc.getData() + gray);
                    tempg.setData(green + tempg.getData() + gray);
                }
            }
            tempc = tempc.nextNode;
            tempg = tempg.nextNode;
        }

        //yellow check
        tempc = c.firstNode;
        tempg = g.firstNode;
        while (tempc != null) {
            while (tempg != null) {
                if (tempc.getData().equals(tempg.getData()) && tempc.getWordCount() == tempg.getWordCount()) {
                    tempc.setData(yellow + tempc.getData() + gray);
                    tempg.setData(yellow + tempg.getData() + gray);
                }
                tempg = tempg.nextNode;
            }
            tempc = tempc.nextNode;
            tempg = g.firstNode;
        }

        //purple check
        tempc = c.firstNode;
        tempg = g.firstNode;
        while (tempc != null) {
            while (tempg != null) {
                if (tempc.getData().equals(tempg.getData())) {
                    tempc.setData(magenta + tempc.getData() + gray);
                    tempg.setData(magenta + tempg.getData() + gray);

                }
                tempg = tempg.nextNode;
            }
            tempc = tempc.nextNode;
            tempg = g.firstNode;
        }
    }

    public void print() {
        Node temp = firstNode;
        System.out.print(gray);
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.nextNode;
        }
        System.out.println(reset);
    }

    public void checkUI(LinkedList g, LinkedList c) {
        this.copy(c);

        //green check
        Node tempc = c.firstNode;
        Node tempg = g.firstNode;
        while (tempc != null && tempg != null) {
            if (tempc.getData().equals(tempg.getData())) {
                if (!tempc.getData().equals(" ")) {
                    tempc.setData(green + tempc.getData() + gray);
                    tempg.setData(green + tempg.getData() + gray);
                }
            }
            tempc = tempc.nextNode;
            tempg = tempg.nextNode;
        }

        //yellow check
        tempc = c.firstNode;
        tempg = g.firstNode;
        while (tempc != null) {
            while (tempg != null) {
                if (tempc.getData().equals(tempg.getData()) && tempc.getWordCount() == tempg.getWordCount()) {
                    tempc.setData(yellow + tempc.getData() + gray);
                    tempg.setData(yellow + tempg.getData() + gray);
                }
                tempg = tempg.nextNode;
            }
            tempc = tempc.nextNode;
            tempg = g.firstNode;
        }

        //purple check
        tempc = c.firstNode;
        tempg = g.firstNode;
        while (tempc != null) {
            while (tempg != null) {
                if (tempc.getData().equals(tempg.getData())) {
                    tempc.setData(magenta + tempc.getData() + gray);
                    tempg.setData(magenta + tempg.getData() + gray);

                }
                tempg = tempg.nextNode;
            }
            tempc = tempc.nextNode;
            tempg = g.firstNode;
        }
    }

    public Node getNode(int index) {
        Node temp = firstNode;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }
        return temp;
    }

}
