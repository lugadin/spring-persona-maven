/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.atoms.app.persona.struct;

/**
 *
 * @author kochetov
 */
public class ImageResize {
    private String name;
    private int width;
    private int height;
    private boolean enable = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
        
}
