package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();
    private Radio radio1 = new Radio(20);
    private Radio radio2 = new Radio(15);
    private Radio radio3 = new Radio(2);

    @Test
    public void shouldIncreaseRadioStation() {
        radio1.setCurrentNumberRadioStation(radio1.getMaxNumberRadioStation() - 1);

        radio1.increaseRadioStation();

        int expected = radio1.getMaxNumberRadioStation();
        int actual = radio1.getCurrentNumberRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio3.setCurrentNumberRadioStation(radio3.getMinNumberRadioStation() + 1);

        radio3.decreaseRadioStation();

        int expected = radio3.getMinNumberRadioStation();
        int actual = radio3.getCurrentNumberRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation1() {
        radio2.setCurrentNumberRadioStation(radio2.getMaxNumberRadioStation());

        radio2.increaseRadioStation();

        int expected = radio2.getMinNumberRadioStation();
        int actual = radio2.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shoulddecreaseRadioStation2() {
        radio.setCurrentNumberRadioStation(radio.getMinNumberRadioStation());

        radio.decreaseRadioStation();

        int expected = radio.getMaxNumberRadioStation();
        int actual = radio.getCurrentNumberRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentSoundVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentSoundVolume(100);
        radio.decreaseVolume();

        assertEquals(99, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseMinVolume() {
        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldIncreaseVolumeN5() {
        radio.setCurrentSoundVolume(101);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseVolumeN6() {
        radio.setCurrentSoundVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
