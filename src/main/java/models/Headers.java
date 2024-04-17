package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Headers {

    private Map<String, String> headerChild;
    private Map<String, String> headerParent;

    @JsonProperty("headerChild")
    public Map<String, String> getHeaderChild() {
        return headerChild;
    }
    @JsonProperty("headerChild")
    public void setHeaderChild(Map<String, String> headerChild) {
        this.headerChild = headerChild;
    }
    @JsonProperty("headerParent")
    public Map<String, String> getHeaderParent() {
        return headerParent;
    }
    @JsonProperty("headerParent")
    public void setHeaderParent(Map<String, String> headerParent) {
        this.headerParent = headerParent;
    }
}
