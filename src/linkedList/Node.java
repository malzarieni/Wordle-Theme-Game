package linkedList;

public class Node {

    private String data;
    private int wordCount;
    Node nextNode;

    public Node(String data, int wordCount) {
        this.data = data;
        this.wordCount = wordCount;
        this.nextNode = null;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public int getWordCount() {
        return wordCount;
    }
    
    

}
