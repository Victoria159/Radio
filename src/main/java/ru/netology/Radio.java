package ru.netology;

public class Radio {
    private int currentNumberRadioStation;
    private int minNumberRadioStation=0;
    private int maxNumberRadioStation;
    private int baseNumberRadioStation = 10;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private boolean on;

    public Radio() {
    }

    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }


    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getBaseNumberRadioStation() {
        return baseNumberRadioStation;
    }

    public void setBaseNumberRadioStation(int baseNumberRadioStation) {
        this.baseNumberRadioStation = baseNumberRadioStation;
    }

    public int increaseRadioStation() {
        setCurrentNumberRadioStation(currentNumberRadioStation + 1);
        return currentNumberRadioStation;
    }

    public int decreaseRadioStation() {
        setCurrentNumberRadioStation(currentNumberRadioStation - 1);
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation < minNumberRadioStation) {
            currentNumberRadioStation = maxNumberRadioStation;
        }
        if (currentNumberRadioStation > maxNumberRadioStation) {
            currentNumberRadioStation = minNumberRadioStation;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume != minSoundVolume) {
            currentSoundVolume--;
        }
    }
}
