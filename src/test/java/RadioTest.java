import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void chooseStation() {

        Radio radio = new Radio( stationsCount: 20);

        radio.setCurrentStation(15);

        assertEquals( expected: 15, radio.getCurrentStation());
    }

}

