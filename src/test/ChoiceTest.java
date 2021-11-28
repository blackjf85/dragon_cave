import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ChoiceTest {

    Choice choiceClass;

    @BeforeEach
    void setUp() {
        choiceClass = new Choice();
    }

    @Test
    void getChoice() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        assertEquals(1, Choice.getChoice(), "Problem in get choice method.");

        in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        assertEquals(2, Choice.getChoice(), "Problem in get choice method.");
        System.setIn((sysInBackup));
    }
}