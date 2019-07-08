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
        int lengthX = (n * this.text.length());
        for(int i = 0; i < n; i++){
            int c = 0;
            int d = 0;
            for(int j = 0; j < lengthX; j++){
                if(c == n){
                    c = 0;
                    d++;
                }

                switch(charArr[d]){
                    case 'A' : A.getInstance(option).printChar(i, c); break;
                    case 'E' : E.getInstance(option).printChar(i, c); break;
                    case 'R' : R.getInstance(option).printChar(i, c); break;
                    case 'I' : I.getInstance(option).printChar(i, c); break;
                    case 'C' : C.getInstance(option).printChar(i, c); break;
                    default: System.out.print(" "); break;
                }

                c++;

                // for typewriter effect
                try{
                    Thread.sleep(50);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
}
