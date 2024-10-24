package memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type(", world!");
        System.out.println("Current text: " + editor.getText());

        editor.undo();
        System.out.println("After undo: " + editor.getText());
    }
}
