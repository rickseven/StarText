package com.rickseven.java.startext.characters;

public class CharacterOption implements ICharacterOption {
    private int size = 5;

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
}
