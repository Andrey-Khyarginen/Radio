public class Radio {
    int minChanel = 0;
    int maxChanel = 9;
    int currentChanel;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int newCurrentChanel) {

        if (newCurrentChanel < 0) {
            return;
        }
        if (newCurrentChanel > 0) {
            return;
        }
        currentChanel = newCurrentChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public int getMaxChanel() {
        return maxChanel;
    }

    public void setMaxChanel() {
        currentChanel = 9;
    }

    public void increaseChanel() {
        if (currentChanel < 9) {
            currentChanel = currentChanel + 1;
        }
    }

    public void reduceChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        }
    }

    ///////////////////////звук
    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
    }
}
