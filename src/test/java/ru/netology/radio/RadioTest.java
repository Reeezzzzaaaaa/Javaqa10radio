package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }
}

