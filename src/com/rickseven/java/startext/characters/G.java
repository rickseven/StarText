package com.rickseven.java.startext.characters;

public class G extends Character {

    private static G instance = null;

    private G(ICharacterOption option) {
        super(option);
    }

    public static G getInstance(ICharacterOption option){
        if(instance == null){
            instance = new G(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        int middleX = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    if(j == 1){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                } else if (i == middleY && j > middleX) {
                    System.out.print(this.character);
                } else {
                    if(j == 1 || i > middleY && j == n){
                        System.out.print(this.character);
                    }else {
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
