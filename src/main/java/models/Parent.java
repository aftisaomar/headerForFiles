package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parent {

    private String[] expected;
    private String[] actual;
    private String separator;

    @JsonProperty("expected")
    public String[] getExpected() {
        return expected;
    }

    @JsonProperty("expected")
    public void setExpected(String[] expected) {
        this.expected = expected;
    }

    @JsonProperty("actual")
    public String[] getActual() {
        return actual;
    }

    @JsonProperty("actual")
    public void setActual(String[] actual) {
        this.actual = actual;
    }

    @JsonProperty("separator")
    public String getSeparator() {
        return separator;
    }

    @JsonProperty("separator")
    public void setSeparator(String separator) {
        this.separator = separator;
    }
}
