package com.rickseven.java.startext.characters;

public class CharacterOption implements ICharacterOption {
    private int size = 5;
    private boolean space = false;

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean isWithSpace() { return this.space; }

    @Override
    public void withSpace(boolean isWithSpace) { this.space = isWithSpace; }
}
