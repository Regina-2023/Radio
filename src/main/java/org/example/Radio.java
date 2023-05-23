package org.example;

public class Radio {
    private int radioID;
    private int volume;

    public int getRadioID() {
        return radioID;
    }

    public int getVolume() {
        return volume;
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


    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
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
