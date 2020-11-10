package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.Position;

public class LocationHandler implements RequestHandler<Float, Position> {

    //Mapa string position con las posiciones de los 3 satelites

    @Override
    public Position handleRequest(Float distance, Context context) {
        return getLocation(distance);
    }

    private Position getLocation(Float distance) {
        return new Position();
    }
}
