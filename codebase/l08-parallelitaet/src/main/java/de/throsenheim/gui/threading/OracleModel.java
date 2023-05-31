package de.throsenheim.gui.threading;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OracleModel {
    private StringProperty answer = new SimpleStringProperty("");

    public String getAnswer() {
        return answer.get();
    }

    public StringProperty answerProperty() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer.set(answer);
    }

    public void setTrue() {
        this.answer.set("Yes");
    }

    public void setFalse() {
        this.answer.set("No");
    }

    public void reset() {
        this.answer.set("");
    }

    public void setResult(Boolean result) {
        if(result) {
            setTrue();
        } else {
            setFalse();
        }
    }
}
