package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
private void initFields(){
    radio.setMaxNumberRadioStation(9);
    radio.setMinNumberRadioStation(0);
    radio.setMaxSoundVolume(10);
    radio.setMinSoundVolume(0);
}
@Test
    void shouldNextNumberRadioStation(){
    initFields();
    radio.setCurrentNumberRadioStation(9);
    radio.nextNumberRadioStation();

    assertEquals(0, radio.getCurrentNumberRadioStation());
}
@Test
    void shouldPrevNumberRadioStation(){
    initFields();
    radio.setCurrentNumberRadioStation(0);
    radio.prevNumberRadioStation();

    assertEquals(9, radio.getCurrentNumberRadioStation());
}
@Test
    void shouldIncreaseVolume(){
    initFields();
    radio.setCurrentSoundVolume(9);
    radio.increaseVolume();

    assertEquals(10, radio.getCurrentSoundVolume());
}
@Test
    void shouldDecreaseVolume(){
    initFields();
    radio.setCurrentSoundVolume(10);
    radio.decreaseVolume();

    assertEquals(9, radio.getCurrentSoundVolume());
}
@Test
    void shouldIncreaseMaxVolume(){
    initFields();
    radio.setCurrentSoundVolume(10);
    radio.increaseVolume();

    assertEquals(10, radio.getCurrentSoundVolume());
}
@Test
    void shouldDecreaseMinVolume(){
    initFields();
    radio.setCurrentSoundVolume(0);
    radio.decreaseVolume();

    assertEquals(0, radio.getCurrentSoundVolume());
}
    @Test
    void shouldNextNumberRadioStationN1(){
        initFields();
        radio.setCurrentNumberRadioStation(5);
        radio.nextNumberRadioStation();

        assertEquals(6, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldPrevNumberRadioStationN2(){
        initFields();
        radio.setCurrentNumberRadioStation(4);
        radio.prevNumberRadioStation();

        assertEquals(3, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldNextNumberRadioStationN3(){
        initFields();
        radio.setCurrentNumberRadioStation(10);
        radio.nextNumberRadioStation();

        assertEquals(1, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldPrevNumberRadioStationN4(){
        initFields();
        radio.setCurrentNumberRadioStation(-1);
        radio.prevNumberRadioStation();

        assertEquals(9, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldIncreaseVolumeN5(){
        initFields();
        radio.setCurrentSoundVolume(11);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }
    @Test
    void shouldDecreaseVolumeN6(){
        initFields();
        radio.setCurrentSoundVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
