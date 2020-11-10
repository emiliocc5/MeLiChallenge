package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageHandler implements RequestHandler<List<String>, String> {
   /*
   Corresponde a otro lambda
   Map<String, Position> satelites = new HashMap<String, Position>();

    private void fillSatelites() {
        this.satelites.put("Kenobi", new Position(-500f, -200f));
    }
    */
    @Override
    public String handleRequest(List<String> messages, Context context) {
        return getMessage(messages);
    }

    private String getMessage(List<String> messages) {
        StringBuilder builder = new StringBuilder();
        for (String message : messages) {
            if (message != "") {
                builder.append(message).append(" ");
            }
        }
        return builder.toString();
    }
}
