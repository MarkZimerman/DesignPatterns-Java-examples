package memento;

import memento.lesson.History;
import memento.task.Document;
import memento.task.DocumentHistory;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createDocument());

        document.setFontName("Font 1");
        history.push(document.createDocument());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

    }
}
