package com.nabesh;

public class Tree {
    private boolean evergreen;

    public String toString(){
        String line = "This tree is ";
        if(!evergreen)
            line += "not ";
        return line + "an evergreen";
    }

}
