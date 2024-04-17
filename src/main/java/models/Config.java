package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {

    private String[] expected;
    private String[] actual;
    private String separator;

    private Parent parent;
    private Headers headers;

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

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @JsonProperty("headers")
    public Headers getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "Config{" +
                "expected=" + Arrays.toString(expected) +
                ", actual=" + Arrays.toString(actual) +
                ", separator='" + separator + '\'' +
                ", parent=" + parent +
                ", headers=" + headers +
                '}';
    }
}