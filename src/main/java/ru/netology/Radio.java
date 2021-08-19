package ru.netology;

public class Radio {
    private int currentNumberRadioStation;
    private int numbersRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private boolean on;

    public Radio() {
    }

    public Radio(int numbersRadioStation) {
        this.numbersRadioStation = numbersRadioStation;
    }

    public int getNumbersRadioStation() {
        return numbersRadioStation;
    }

    public void setNumbersRadioStation(int numbersRadioStation) {
        this.numbersRadioStation = numbersRadioStation;
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


    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {

        if (currentNumberRadioStation > numbersRadioStation) {
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

        return numbersRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.numbersRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation == numbersRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        } else {
            currentNumberRadioStation++;
        }
    }


    public void prevNumberRadioStation() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            this.currentNumberRadioStation = numbersRadioStation;
        } else {
            currentNumberRadioStation--;
        }
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
