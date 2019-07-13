package com.rickseven.java.startext.characters;

public class S extends Character {

    private static S instance = null;

    private S(ICharacterOption option) {
        super(option);
    }

    public static S getInstance(ICharacterOption option){
        if(instance == null){
            instance = new S(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 && j > 1){
                    System.out.print(this.character);
                }else if(i == middleY && j > 1 && j < n){
                    System.out.print(this.character);
                }else if(i == n && j < n){
                    System.out.print(this.character);
                }else if(i > 1 && i < middleY && j == 1){
                    System.out.print(this.character);
                }else if(i > middleY && i < n && j == n){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
