package model;

import java.util.List;

public class GetInformationRequest {
    private String sateliteName;
    private float distance;
    private List<String> messages;

    public GetInformationRequest(String sateliteName, float distance, List<String> messages) {
        this.sateliteName = sateliteName;
        this.distance = distance;
        this.messages = messages;
    }

    public String getSateliteName() {
        return sateliteName;
    }

    public void setSateliteName(String sateliteName) {
        this.sateliteName = sateliteName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
