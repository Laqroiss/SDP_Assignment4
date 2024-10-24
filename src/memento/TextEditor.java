package memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private History history = new History();

    public void type(String newText) {
        history.save(new Memento(text.toString()));
        text.append(newText);
    }

    public void undo() {
        Memento memento = history.undo();
        if (memento != null) {
            text = new StringBuilder(memento.getState());
        }
    }

    public String getText() {
        return text.toString();
    }
}
