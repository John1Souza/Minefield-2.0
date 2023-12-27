package com.john.minefield20.model;

public class Field {
    private int rows;
    private int columns;

    private boolean haveMine;
    private boolean open;
    private boolean marked;

    public Field(int rows, int columns) {
        setRows(rows);
        setColumns(columns);
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public boolean isHaveMine() {
        return haveMine;
    }

    public void setHaveMine(boolean haveMine) {
        this.haveMine = haveMine;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }


}
