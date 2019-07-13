package com.rickseven.java.startext.characters;

import java.net.ServerSocket;

public class J extends Character {

    private static J instance = null;

    private J(ICharacterOption option) {
        super(option);
    }

    public static J getInstance(ICharacterOption option){
        if(instance == null){
            instance = new J(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = n/2 + 1;
        int middleX = n/2 + 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i < (middleY + (middleY/2))){
                    if (i == 1 && j >= (middleX + (middleX/2))){
                        System.out.print(this.character);
                    }else if (j == n){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
                    }
                } else {
                    if(i >= (middleY + (middleY/2)) && i < n && j == 1 || i >= (middleY + (middleY/2)) && i < n && j == n){
                        System.out.print(this.character);
                    }else if (i == n && j > 1 && j < n){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
