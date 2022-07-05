package ru.netology.radio;

public class Radio {


    private int minNoise = 0;
    private int maxNoise = 10;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int increaseVolume;
    private int decreaseVolume;
    private int nextChannel;
    private int prevChannel;
    private int currentVolume = minNoise;
    private int currentChannel = minChannel;

    public Radio() {
    }

    public Radio(int amount) {
        maxChannel = minChannel + amount - 1;
        this.currentChannel = maxChannel;
    }

    public int getMinNoise() {
        return minNoise;
    }

    public int getMaxNoise() {
        return maxNoise;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public int getNextChannel() {
        return nextChannel;
    }

    public int getPrevChannel() {
        return prevChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setMinNoise(int minNoise) {
        this.minNoise = minNoise;
        this.currentVolume = minNoise;
    }

    public void setMaxNoise(int maxNoise) {
        this.maxNoise = maxNoise;
        this.currentVolume = maxNoise;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
        this.currentChannel = minChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel - 1;
        this.currentChannel = maxChannel - 1;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minNoise) {
            currentVolume = minNoise;
            this.currentVolume = currentVolume;
            return;
        }
        if (currentVolume > maxNoise) {
            currentVolume = minNoise;
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannel) {
            currentChannel = minChannel;
            this.currentChannel = currentChannel;
            return;
        }
        if (currentChannel > maxChannel) {
            currentChannel = minChannel;
            this.currentChannel = currentChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    protected void setIncreaseVolume(int increaseVolume) {
        int target = increaseVolume;
        if (target < minNoise) {
            target = minNoise;
        }
        if (target < maxNoise) {
            target++;
            increaseVolume = target;
        }
        if (increaseVolume >= maxNoise) {
            increaseVolume = maxNoise;
        }
        this.increaseVolume = increaseVolume;
    }

    public void setDecreaseVolume(int decreaseVolume) {
        int target = decreaseVolume;
        if (target <= maxNoise) {
            target--;
            decreaseVolume = target;
        }
        if (target > maxNoise) {
            target = maxNoise;
            target--;
            decreaseVolume = target;
        }
        if (decreaseVolume <= minNoise) {
            decreaseVolume = minNoise;
        }
        this.decreaseVolume = decreaseVolume;
    }

    public void setNextChannel(int nextChannel) {
        int target = nextChannel++;
        if (target >= maxChannel) {
            target = minChannel;
        } else {
            target = nextChannel;
        }
        nextChannel = target;
        this.nextChannel = nextChannel;
    }

    public void setPrevChannel(int prevChannel) {
        int target = prevChannel--;
        if (target <= minChannel) {
            target = maxChannel;
        } else {
            target = prevChannel;
        }
        prevChannel = target;
        this.prevChannel = prevChannel;
    }
}
