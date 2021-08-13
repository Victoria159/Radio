package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(8);

@Test
    void shouldNextNumberRadioStation(){

    radio.setCurrentNumberRadioStation(8);
    radio.nextNumberRadioStation();

    assertEquals(0, radio.getCurrentNumberRadioStation());
}
@Test
    void shouldPrevNumberRadioStation(){
    radio.setCurrentNumberRadioStation(0);
    radio.prevNumberRadioStation();

    assertEquals(8, radio.getCurrentNumberRadioStation());
}
@Test
    void shouldIncreaseVolume(){
    radio.setCurrentSoundVolume(99);
    radio.increaseVolume();

    assertEquals(100, radio.getCurrentSoundVolume());
}
@Test
    void shouldDecreaseVolume(){
    radio.setCurrentSoundVolume(100);
    radio.decreaseVolume();

    assertEquals(99, radio.getCurrentSoundVolume());
}
@Test
    void shouldIncreaseMaxVolume(){
    radio.setCurrentSoundVolume(100);
    radio.increaseVolume();

    assertEquals(100, radio.getCurrentSoundVolume());
}
@Test
    void shouldDecreaseMinVolume(){
    radio.setCurrentSoundVolume(0);
    radio.decreaseVolume();

    assertEquals(0, radio.getCurrentSoundVolume());
}
    @Test
    void shouldNextNumberRadioStationN1(){
        radio.setCurrentNumberRadioStation(5);
        radio.nextNumberRadioStation();

        assertEquals(6, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldPrevNumberRadioStationN2(){
        radio.setCurrentNumberRadioStation(4);
        radio.prevNumberRadioStation();

        assertEquals(3, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldNextNumberRadioStationN3(){
        radio.setCurrentNumberRadioStation(11);
        radio.nextNumberRadioStation();

        assertEquals(1, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldPrevNumberRadioStationN4(){
        radio.setCurrentNumberRadioStation(-1);
        radio.prevNumberRadioStation();

        assertEquals(8, radio.getCurrentNumberRadioStation());
    }
    @Test
    void shouldIncreaseVolumeN5(){
        radio.setCurrentSoundVolume(101);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }
    @Test
    void shouldDecreaseVolumeN6(){
        radio.setCurrentSoundVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
