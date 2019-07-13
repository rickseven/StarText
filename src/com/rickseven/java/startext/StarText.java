package com.rickseven.java.startext;

import com.rickseven.java.startext.characters.*;

class StarText {

    private String text;
    private ICharacterOption option;

    StarText(String text, ICharacterOption option){
        this.text = text;
        this.option = option;
    }

    void print(){
        char[] charArr = new char[text.length()];
        for(int i = 0; i < text.length(); i++){
            charArr[i] = text.charAt(i);
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

                switch(charArr[d]){
                    case 'A' : A.getInstance(option).printChar(i, c); break;
                    case 'B' : B.getInstance(option).printChar(i, c); break;
                    case 'C' : C.getInstance(option).printChar(i, c); break;
                    case 'D' : D.getInstance(option).printChar(i, c); break;
                    case 'E' : E.getInstance(option).printChar(i, c); break;
                    case 'F' : F.getInstance(option).printChar(i, c); break;
                    case 'G' : G.getInstance(option).printChar(i, c); break;
                    case 'H' : H.getInstance(option).printChar(i, c); break;
                    case 'I' : I.getInstance(option).printChar(i, c); break;
                    case 'J' : J.getInstance(option).printChar(i, c); break;
                    case 'K' : K.getInstance(option).printChar(i, c); break;
                    case 'L' : L.getInstance(option).printChar(i, c); break;
                    case 'M' : M.getInstance(option).printChar(i, c); break;
                    case 'N' : N.getInstance(option).printChar(i, c); break;
                    case 'O' : O.getInstance(option).printChar(i, c); break;
                    case 'P' : P.getInstance(option).printChar(i, c); break;
                    case 'Q' : Q.getInstance(option).printChar(i, c); break;
                    case 'R' : R.getInstance(option).printChar(i, c); break;
                    case 'S' : S.getInstance(option).printChar(i, c); break;
                    case 'T' : T.getInstance(option).printChar(i, c); break;
                    case 'U' : U.getInstance(option).printChar(i, c); break;
                    case 'V' : V.getInstance(option).printChar(i, c); break;
                    case 'W' : W.getInstance(option).printChar(i, c); break;
                    case 'X' : X.getInstance(option).printChar(i, c); break;
                    case 'Y' : Y.getInstance(option).printChar(i, c); break;
                    case 'Z' : Z.getInstance(option).printChar(i, c); break;
                    default: System.out.print(" "); break;
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
