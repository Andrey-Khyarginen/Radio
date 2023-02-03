import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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
    public void sholdNotSetChanelAbouveMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(15);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }
   @Test
    public void sholdIncreaseChanel(){
       Radio radio = new Radio();
       radio.currentChanel = 4;
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
}
