package com.rickseven.java.startext.characters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class Character {

    public abstract void write();
    public abstract ICharacterOption option();

    public void printChar(int y, int x) {
        int n = this.option().getSize();
        byte[][] arr = this.to2DArray();
        char ch = (char) arr[y][x];
        System.out.print(ch);
        if(x == (n-1)){
            System.out.print(" ");
        }
    }

    private byte[] toArray() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        this.write();
        System.out.flush();
        System.setOut(old);
        return baos.toByteArray();
    }

    byte[][] to2DArray() {
        int n = this.option().getSize();
        byte[] arr = this.toArray();
        int rows = arr.length;
        int cols = arr.length;
        byte[][] arr2D = new byte[rows][cols];
        int i = 0;
        int c = 0;
        for (byte b : arr) {
            if (c == n) {
                i++;
                c = 0;
            }
            arr2D[i][c] = b;
            c++;
        }
        return arr2D;
    }
}
