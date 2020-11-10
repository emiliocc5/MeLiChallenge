package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.GetInformationRequest;
import model.Position;
import processor.QuasarFireProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuasarFireHandler implements RequestHandler<List<GetInformationRequest>, String> {

    private final QuasarFireProcessor processor;

    public QuasarFireHandler() {
        this.processor = new QuasarFireProcessor();
    }

    public QuasarFireHandler(QuasarFireProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String handleRequest(List<GetInformationRequest> satelites, Context context) {
        return "";
    }
}
