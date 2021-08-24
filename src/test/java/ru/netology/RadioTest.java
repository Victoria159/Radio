package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(8);

@Test
public void shouldIncreaseNumberRadioStation() {
    Radio rad = new Radio();
    rad.setCurrentNumberRadioStation(0);

    rad.increaseNumberRadioStation();

    assertEquals(1, rad.getCurrentNumberRadioStation());

}

    @Test
    public void shouldIncreaseNumberRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(8);

        rad.increaseNumberRadioStation();

        assertEquals(9, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldIncreaseNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(10);

        rad.increaseNumberRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldIncreaseNumberRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(7);

        rad.increaseNumberRadioStation();

        assertEquals(8, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldIncreaseNumberRadioStation4() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(11);

        rad.increaseNumberRadioStation();

        assertEquals(1, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldDecreaseNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.decreaseNumberRadioStation();

        assertEquals(8, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldDecreaseNumberRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(1);

        rad.decreaseNumberRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldDecreaseNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.decreaseNumberRadioStation();

        assertEquals(10, rad.getCurrentNumberRadioStation());

    }
    @Test
    public void shouldDecreaseNumberRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(-1);

        rad.decreaseNumberRadioStation();

        assertEquals(10, rad.getCurrentNumberRadioStation());

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
