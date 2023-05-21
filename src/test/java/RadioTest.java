
import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();

        radio.setRadioID(10);

        int expected = 0;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioID() {
        Radio radio = new Radio();
        radio.setRadioID(9);

        radio.nextRadioID();

        int expected = 0;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioID() {
        Radio radio = new Radio();
        radio.setRadioID(0);

        radio.prevRadioID();

        int expected = 9;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMore100() {
        Radio radio = new Radio();
        radio.volume = 100;

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLess0() {
        Radio radio = new Radio();
        radio.volume = 0;

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }
}
