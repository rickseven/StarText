package com.rickseven.java.startext.characters;

public class T extends Character {

    private static T instance = null;

    private T(ICharacterOption option) {
        super(option);
    }

    public static T getInstance(ICharacterOption option){
        if(instance == null){
            instance = new T(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleX = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1){
                    System.out.print(this.character);
                }else if(i > 1 && j == middleX){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
