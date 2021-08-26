package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio1 = new Radio();
    Radio radio = new Radio(20);

    @Test
    public void shouldIncreaseRadioStation() {
        radio.setCurrentNumberRadioStation(radio.getMaxNumberRadioStation() - 1);

        radio.increaseRadioStation();

        int expected = radio.getMaxNumberRadioStation();
        int actual = radio.getCurrentNumberRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio.setCurrentNumberRadioStation(radio.getMinNumberRadioStation() + 1);

        radio.decreaseRadioStation();

        int expected = radio.getMinNumberRadioStation();
        int actual = radio.getCurrentNumberRadioStation();

        assertEquals(expected, actual);
    }

@Test
public void shouldIncreaseRadioStation1() {
    Radio radio = new Radio();
    radio.setCurrentNumberRadioStation(1);

    radio.increaseRadioStation();

    assertEquals(2, radio.getCurrentNumberRadioStation());

}

    @Test
    public void shouldIncreaseRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(20);

        rad.increaseRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldIncreaseRadioStation5() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(11);

        rad.increaseRadioStation();

        assertEquals(12, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldDecreaseRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.decreaseRadioStation();

        assertEquals(8, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldDecreaseRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.decreaseRadioStation();

        assertEquals(20, rad.getCurrentNumberRadioStation());

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
