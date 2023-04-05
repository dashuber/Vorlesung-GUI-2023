package v4.mvp;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;

public class IntervalModel {
    private final IntegerProperty intervalValue = new SimpleIntegerProperty(5);

    public IntegerProperty intervalValueProperty() {
        return intervalValue;
    }

    public void setIntervalValue(int intervalValue) {
        this.intervalValue.set(intervalValue);
    }

    public void increaseValue() {
        this.setIntervalValue(intervalValue.getValue() + 1);
    }

    public void decreaseValue() {
        this.setIntervalValue(intervalValue.getValue() - 1);
    }

    public BooleanBinding minReached() {
        return intervalValue.lessThanOrEqualTo(0);
    }

    public ObservableValue<Boolean> maxReached() {
        return intervalValue.greaterThanOrEqualTo(10);
    }
}
