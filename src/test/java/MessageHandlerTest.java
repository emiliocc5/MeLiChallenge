import handler.MessageHandler;
import model.Position;
import org.junit.Test;

import static org.mockito.Matchers.isA;

public class MessageHandlerTest {
    private MessageHandler handler = new MessageHandler();

    @Test
    private void getDistanceTest() {
        Position position = handler.getDistance(Float.valueOf("10"));

        assertThat(position.getxPosition(), isA(Float.class));
    }

}
