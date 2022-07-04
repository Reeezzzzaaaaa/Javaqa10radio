package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testNewRadioVolume() {
        Radio radio = new Radio();
        radio.setNewMaxVolume(100);

        Assertions.assertEquals(0, radio.getMinNoise());
        Assertions.assertEquals(100, radio.getNewMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void testNewRadioChannel() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(29, radio.getAmount());
        Assertions.assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldNotSetChannelUnderMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-10);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldIncreaseVolumeMines1() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(-1);

        int expected = 1;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume9() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(9);

        int expected = 10;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(10);

        int expected = 10;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume11() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(11);

        int expected = 9;
        int actual = radio.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume10() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(10);

        int expected = 9;
        int actual = radio.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(0);

        int expected = 0;
        int actual = radio.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel8() {
        Radio radio = new Radio();
        radio.setNextChannel(8);

        int expected = 9;
        int actual = radio.getNextChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel9() {
        Radio radio = new Radio();
        radio.setNextChannel(9);

        int expected = 0;
        int actual = radio.getNextChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel10() {
        Radio radio = new Radio();
        radio.setNextChannel(10);

        int expected = 0;
        int actual = radio.getNextChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelMines1() {
        Radio radio = new Radio();
        radio.setPrevChannel(-1);

        int expected = 9;
        int actual = radio.getPrevChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel0() {
        Radio radio = new Radio();
        radio.setPrevChannel(0);

        int expected = 9;
        int actual = radio.getPrevChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel1() {
        Radio radio = new Radio();
        radio.setPrevChannel(1);

        int expected = 0;
        int actual = radio.getPrevChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMines1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentChannel1() {
        Radio radio = new Radio();
        radio.setCurrentChannel(1);

        Assertions.assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannel0() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        Assertions.assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannelMines1() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);

        Assertions.assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannel10() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);

        Assertions.assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannel9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        Assertions.assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannel8() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);

        Assertions.assertEquals(8, radio.getCurrentChannel());
    }
}
