package com.rickseven.java.startext.characters;

public class P extends Character {

    private static P instance = null;

    private P(ICharacterOption option) {
        super(option);
    }

    public static P getInstance(ICharacterOption option){
        if(instance == null){
            instance = new P(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == middleY){
                    if(j == n){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                }else{
                    if(j == 1 || j == n && i < middleY){
                        System.out.print(this.character);
                    }else {
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
