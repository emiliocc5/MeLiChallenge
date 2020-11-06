package handler;

import model.Position;

import java.util.List;

public class MessageHandler {

    public Position getDistance(float distance) {
        return new Position(distance);
    }

    public String getMessage(List<String> messages) {
        return "test";
    }
}
