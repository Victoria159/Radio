package ru.netology;

public class Radio {
    private int currentNumberRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation;
    private int currentSoundVolume;
    private int maxSoundVolume;
    private int minSoundVolume;

    public int getMaxSoundVolume() {
        return maxSoundVolume;
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

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        if (currentNumberRadioStation < minNumberRadioStation) {
            return;
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

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation == maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        } else {
            currentNumberRadioStation++;
        }
    }

    public void prevNumberRadioStation() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
        } else {
            currentNumberRadioStation--;
        }
    }

    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume != minSoundVolume) {
            currentSoundVolume--;
        }
    }
}
