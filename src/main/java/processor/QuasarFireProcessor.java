package processor;

import model.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuasarFireProcessor {

   Map<String, Position> satelites = new HashMap<String, Position>();

    public QuasarFireProcessor() {
        fillSatelites();
    }

    public String getMessage(List<String> messages) {
        StringBuilder builder = new StringBuilder();
        for (String message : messages) {
            if (!message.equals("")) {
                builder.append(message).append(" ");
            }
        }
        return builder.toString();
    }

    public Position getLocation(Float distance) {
        return new Position();
    }

    private void fillSatelites() {
        this.satelites.put("Kenobi", new Position(-500f, -200f));
    }
}
