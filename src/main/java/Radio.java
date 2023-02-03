public class Radio {
    private int minChanel = 0;
    private int maxChanel = 9;
    private int currentChanel;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int newCurrentChanel) {

        if (newCurrentChanel < 0) {
            return;
        }
        if (newCurrentChanel > 9) {
            return;
        }
        currentChanel = newCurrentChanel;
    }

    public void setMaxChanel() {
        currentChanel = 9;
    }
    public void setMinChanel() {
        currentChanel = 0;
    }

    public void increaseChanel() {
        if (currentChanel < 9) {
            currentChanel = currentChanel + 1;
        }
        if (currentChanel + 1 > 9){
            currentChanel = 0;
        }
    }

    public void reduceChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        }
        if (currentChanel - 1 < 0){
            currentChanel = 9;
        }
    }

    ///////////////////////звук
   private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void setMaxVolume() {
        currentVolume = 10;
    }
    public void setMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
