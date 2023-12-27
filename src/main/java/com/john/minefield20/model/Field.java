package com.john.minefield20.model;

public class Field {
    private boolean haveMine;
    private boolean open;
    private boolean marked;

    public Field(boolean haveMine, boolean open, boolean marked) {
        this.haveMine = haveMine;
        this.open = open;
        this.marked = marked;
    }


}
