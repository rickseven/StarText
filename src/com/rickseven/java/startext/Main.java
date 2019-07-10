package com.rickseven.java.startext;

import com.rickseven.java.startext.characters.CharacterOption;
import com.rickseven.java.startext.characters.ICharacterOption;

import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int textSize;
        String text;

        System.out.println("Input text : ");
        BufferedReader textInput =
                new BufferedReader(new InputStreamReader(System.in));
        text = textInput.readLine().toUpperCase();

        System.out.println("Input text size : ");
        BufferedReader textSizeInput =
                new BufferedReader(new InputStreamReader(System.in));
        textSize = Integer.parseInt(textSizeInput.readLine());

        ICharacterOption option = new CharacterOption();
        option.setSize(textSize);
        option.withSpace(true);
        StarText starText = new StarText(text, option);
        starText.print();
    }
}
