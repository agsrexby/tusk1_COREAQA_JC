import java.util.Stack;

public class MyStringBuilder {
    private StringBuilder sb;
    private Stack<Memento> history;

    public MyStringBuilder() {
        sb = new StringBuilder();
        history = new Stack<>();
    }

    public MyStringBuilder append(String str) {
        saveState();
        sb.append(str);
        return this;
    }

    public MyStringBuilder insert(int pos, String str) {
        saveState();
        sb.insert(pos,str);
        return this;
    }

    public MyStringBuilder replace(int start, int end,String str) {
        saveState();
        sb.replace(start,end,str);
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        saveState();
        sb.delete(start,end);
        return this;
    }

    public MyStringBuilder reverse() {
        saveState();
        sb.reverse();
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            sb = new StringBuilder(memento.getState());
        }
    }

    public void saveState() {
        history.push(new Memento(sb.toString()));
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
