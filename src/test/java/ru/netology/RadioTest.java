package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldIncreaseNumberRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.increaseNumberRadioStation();

        assertEquals(1, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldIncreaseNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(8);

        rad.increaseNumberRadioStation();

        assertEquals(9, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldIncreaseNumberRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.increaseNumberRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldDecreaseNumberRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.decreaseNumberRadioStation();

        assertEquals(8, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldDecreaseNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(1);

        rad.decreaseNumberRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldDecreaseNumberRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.decreaseNumberRadioStation();

        assertEquals(10, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldIncreaseNumberVolume1() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.increaseNumberVolume();

        assertEquals(1, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldIncreaseNumberVolume2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(99);

        rad.increaseNumberVolume();

        assertEquals(100, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldIncreaseNumberVolume3() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(100);

        rad.increaseNumberVolume();

        assertEquals(100, rad.getCurrentNumberVolume());

    }


    @Test
    public void shouldDecreaseNumberVolume1() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(100);

        rad.decreaseVolume();

        assertEquals(99, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldDecreaseNumberVolume2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(50);

        rad.decreaseVolume();

        assertEquals(49, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldDecreaseNumberVolume3() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldMaxNumberRadioStation() {
        Radio rad = new Radio(10);
        rad.setCurrentNumberRadioStation(9);

        rad.getNumbersRadioStation();

        assertEquals(9, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldMinNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.getMinNumberRadioStation();

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldNumberRadioStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(-1);

        rad.decreaseNumberRadioStation();

        assertEquals(10, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldNumberRadioStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(11);

        rad.setCurrentNumberRadioStation(11);

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldNumberRadioStationOverMax2() {
        Radio rad = new Radio(10);
        rad.setCurrentNumberRadioStation(10);

        rad.setCurrentNumberRadioStation(10);

        assertEquals(0, rad.getCurrentNumberRadioStation());

    }

    @Test
    public void shouldCurrentNumberVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(-1);

        rad.setCurrentNumberVolume(-1);

        assertEquals(0, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldCurrentNumberVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(101);

        rad.setCurrentNumberVolume(101);

        assertEquals(0, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldCurrentNumberVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(100);

        rad.getMaxNumberVolume();

        assertEquals(100, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldCurrentNumberVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.getMinNumberVolume();

        assertEquals(0, rad.getCurrentNumberVolume());

    }

    @Test
    public void shouldNumbersRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(5);

        rad.getNumbersRadioStation();

        assertEquals(10, rad.getNumbersRadioStation());

    }

    @Test
    public void shouldNumbersRadioStation2(){
        Radio rad = new Radio(20);
        rad.setCurrentNumberRadioStation(20);


        assertEquals(0, rad.getCurrentNumberRadioStation() );
    }
}
