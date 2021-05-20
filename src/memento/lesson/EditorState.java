package memento.lesson;

import memento.task.Document;

public class EditorState {

  private final String content;
  public EditorState(String content) {
    this.content = content;
  }
  public String getContent() {
    return content;
  }
}
