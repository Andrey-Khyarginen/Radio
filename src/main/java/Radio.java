public class Radio {
    private int minChanel = 0;
    private int maxChanel = 9;
    private int currentChanel;

    public int getCurrentChanel() {
        return currentChanel;
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
        }
        if (currentChanel + 1 > maxChanel){
            currentChanel = 0;
        }
    }

    public void reduceChanel() {
        if (currentChanel > minChanel) {
            currentChanel = currentChanel - 1;
        }
        if (currentChanel - 1 < minChanel){
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
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
