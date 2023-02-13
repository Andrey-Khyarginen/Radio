public class Radio {
    private int minChanel;
    private int maxChanel;
    private int currentChanel = minChanel;

    public Radio() {
        this.maxChanel = 9;
    }

    public Radio(int chanelCounts) {
        this.maxChanel = chanelCounts - 1;
    }


    public int getCurrentChanel() {

        return currentChanel;
    }

    public int getMinChanel() {

        return minChanel;
    }

    public int getMaxChanel() {

        return maxChanel;
    }

    public void setCurrentChanel(int newCurrentChanel) {

        if (newCurrentChanel < minChanel) {
            return;
        }
        if (newCurrentChanel > maxChanel) {
            return;
        }
        currentChanel = newCurrentChanel;
    }

    public void setMaxChanel() {

        currentChanel = maxChanel;
    }

    public void setMinChanel() {

        currentChanel = minChanel;
    }

    public void increaseChanel() {
        if (currentChanel < maxChanel) {
            currentChanel = currentChanel + 1;
        }else {

            currentChanel = minChanel;
        }
    }

    public void reduceChanel() {
        if (currentChanel > minChanel) {
            currentChanel = currentChanel - 1;
        }else {

            currentChanel = maxChanel;
        }
    }

    ///////////////////////звук
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }else {
            currentVolume = minVolume;
        }
    }
}
