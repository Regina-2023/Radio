
import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioMin() {
        Radio radio = new Radio();

        radio.setRadioID(0);

        int expected = 0;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioLessMin() {
        Radio radio = new Radio();

        radio.setRadioID(-1);

        int expected = 0;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAboveMin() {
        Radio radio = new Radio();

        radio.setRadioID(1);

        int expected = 1;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioMax() {
        Radio radio = new Radio();

        radio.setRadioID(9);

        int expected = 9;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioLessMax() {
        Radio radio = new Radio();

        radio.setRadioID(8);

        int expected = 8;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAboveMax() {
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
    public void nextRadioIDLessMax() {
        Radio radio = new Radio();
        radio.setRadioID(8);

        radio.nextRadioID();

        int expected = 9;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioIDAboveMax() {
        Radio radio = new Radio();
        radio.setRadioID(0);

        radio.nextRadioID();

        int expected = 1;
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
    public void prevRadioIDLessMin() {
        Radio radio = new Radio();
        radio.setRadioID(9);

        radio.prevRadioID();

        int expected = 8;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioIDAboveMin() {
        Radio radio = new Radio();
        radio.setRadioID(1);

        radio.prevRadioID();

        int expected = 0;
        int actual = radio.getRadioID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMax() {
        Radio radio = new Radio();

        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAbove100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLess100() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reduceVolumeLess0() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeAbove0() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
