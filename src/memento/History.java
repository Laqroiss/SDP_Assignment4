package memento;

import java.util.Stack;

public class History {
    private Stack<Memento> mementos = new Stack<>();

    public void save(Memento memento) {
        mementos.push(memento);
    }

    public Memento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
