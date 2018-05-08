package com.example.mart_thomas.treeidapp.model;

public class Page {

    private int imageID;
    private int descID;
    private int textID;
    private NextPage trueSelect;
    private NextPage falseSelect;
    private boolean isFinalPage = false;

    public Page(int imageID, int textID, NextPage trueSelect, NextPage falseSelect) {
        this.imageID = imageID;
        this.textID = textID;
        this.trueSelect = trueSelect;
        this.falseSelect = falseSelect;
    }

    public int getDescID() {
        return descID;
    }

    public Page(int imageID, int textID, int descID) {
        this.imageID = imageID;
        this.textID = textID;
        this.descID = descID;
        this.isFinalPage = true;


    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getTextID() {
        return textID;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public NextPage getTrueSelect() {
        return trueSelect;
    }

    public void setTrueSelect(NextPage trueSelect) {
        this.trueSelect = trueSelect;
    }

    public NextPage getFalseSelect() {
        return falseSelect;
    }

    public void setFalseSelect(NextPage falseSelect) {
        this.falseSelect = falseSelect;
    }
}
