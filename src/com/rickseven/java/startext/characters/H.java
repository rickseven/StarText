package com.rickseven.java.startext.characters;

public class H extends Character {

    private static H instance = null;

    private H(ICharacterOption option) {
        super(option);
    }

    public static H getInstance(ICharacterOption option){
        if(instance == null){
            instance = new H(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == middleY || j == 1 || j == n){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
