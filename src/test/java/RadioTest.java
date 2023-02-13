import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinChanel());
        Assertions.assertEquals(9, radio.getMaxChanel());
        Assertions.assertEquals(0, radio.getCurrentChanel());
    }
    @Test
    public void shouldSetChanel2() {
        Radio radio = new Radio(15);
        radio.setCurrentChanel(14);
        int expected = 14;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChanel3() {
        Radio radio = new Radio(15);
        radio.setMaxChanel();
        int expected = 14;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(5);
        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxChanel() {
        Radio radio = new Radio();
        radio.setMaxChanel();
        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinChanel() {
        Radio radio = new Radio();
        radio.setMinChanel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetChanelAbouveMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(15);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetChanelAbouveMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        radio.increaseChanel();
        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseMaxChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.increaseChanel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdReduceChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        radio.reduceChanel();
        int expected = 3;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseMinChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.reduceChanel();
        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        radio.increaseChanel();
        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdReduceChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        radio.reduceChanel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////звук
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetVolumeAbouveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotSetVolumeAbouveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.reduceVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    }

