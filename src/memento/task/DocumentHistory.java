package memento.task;

import java.util.ArrayDeque;

public class DocumentHistory {
    ArrayDeque<DocumentState> mementos = new ArrayDeque<>();

    public void push(DocumentState state) {
        mementos.push(state);
    }

    public DocumentState pop() {
        return mementos.pop();
    }
}
