package org.example;

public class Radio {
    private int radioID;
    public int volume;

    public int getRadioID() {
        return radioID;
    }

    public void setRadioID(int newRadioID) {
        if (newRadioID < 0) {
            return;
        }
        if (newRadioID > 9) {
            return;
        }
        radioID = newRadioID;
    }


    public void nextRadioID() {
        if (radioID < 9) {
            radioID = getRadioID() + 1;
        } else
            setRadioID(0);
    }

    public void prevRadioID() {
        if (radioID > 0) {
            radioID = getRadioID() - 1;
        } else
            setRadioID(9);
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
