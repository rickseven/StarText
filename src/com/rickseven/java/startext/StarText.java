package com.rickseven.java.startext;

import com.rickseven.java.startext.characters.*;
import com.rickseven.java.startext.characters.Character;

import java.util.HashMap;

class StarText {

    private String text;
    private ICharacterOption option;
    private HashMap<java.lang.Character, Character> characters = new HashMap<>();

    StarText(String text, ICharacterOption option){
        this.text = text.toUpperCase();
        this.option = option;
    }

    private void initialCharacters(){
        characters.put('A', A.getInstance(this.option));
        characters.put('B', B.getInstance(this.option));
        characters.put('C', C.getInstance(this.option));
        characters.put('D', D.getInstance(this.option));
        characters.put('E', E.getInstance(this.option));
        characters.put('F', F.getInstance(this.option));
        characters.put('G', G.getInstance(this.option));
        characters.put('H', H.getInstance(this.option));
        characters.put('I', I.getInstance(this.option));
        characters.put('J', J.getInstance(this.option));
        characters.put('K', K.getInstance(this.option));
        characters.put('L', L.getInstance(this.option));
        characters.put('M', M.getInstance(this.option));
        characters.put('N', N.getInstance(this.option));
        characters.put('O', O.getInstance(this.option));
        characters.put('P', P.getInstance(this.option));
        characters.put('Q', Q.getInstance(this.option));
        characters.put('R', R.getInstance(this.option));
        characters.put('S', S.getInstance(this.option));
        characters.put('T', T.getInstance(this.option));
        characters.put('U', U.getInstance(this.option));
        characters.put('V', V.getInstance(this.option));
        characters.put('W', W.getInstance(this.option));
        characters.put('X', X.getInstance(this.option));
        characters.put('Y', Y.getInstance(this.option));
        characters.put('Z', Z.getInstance(this.option));
    }

    void print(){
        initialCharacters();

        Character[] charArr = new Character[this.text.length()];
        for(int i = 0; i < this.text.length(); i++){
            charArr[i] = characters.getOrDefault(this.text.charAt(i), null);
        }

        int n = this.option.getSize();
        int charWidth = (this.option.isWithSpace()) ? (n*2) : n;
        int lengthX = (charWidth * this.text.length());
        for(int i = 0; i < n; i++){
            int c = 0;
            int d = 0;
            for(int j = 0; j < lengthX; j++){
                if(c == charWidth){
                    c = 0;
                    d++;
                }

                if(charArr[d] != null){
                    charArr[d].printChar(i, c);
                }else{
                    System.out.print(" ");
                }

                c++;

                // for typewriter effect
                try{
                    Thread.sleep(7);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
}
