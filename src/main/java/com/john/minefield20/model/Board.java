package com.john.minefield20.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {
    private int rows;
    private int columns;
    private int mines;

    List<Field> fieldList = new ArrayList<>();
    public Board(int rows, int columns, int mines){
        setRows(rows);
        setColumns(columns);
        setMines(mines);

        generateFields();
    }


    public void generateFields(){
        for (int row = 0; row < getRows(); row++){
            for (int column = 0; column < getColumns(); column++){
                fieldList.add(new Field(row, column));
            }
        }
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

    public int getMines() {
        return mines;
    }

    public void setMines(int mines) {
        this.mines = mines;
    }
}
