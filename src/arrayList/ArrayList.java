package arrayList;

public class ArrayList {

    char rps[] = new char[2];
    int top = -1;

    public void clear() {
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == (rps.length - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char c) {
        top++;
        rps[top] = c;
    }

}
