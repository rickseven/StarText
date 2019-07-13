package com.rickseven.java.startext.characters;

public class V extends Character {

    private static V instance = null;

    private V(ICharacterOption option) {
        super(option);
    }

    public static V getInstance(ICharacterOption option){
        if(instance == null){
            instance = new V(option);
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
                if(i < middleY && j == 1 || i < middleY && j == n){
                    System.out.print(this.character);
                }else if(i >= middleY && j == ((i-middleX)+1)){
                    System.out.print(this.character);
                }else if(i >= middleY && j == (n-(i-middleX))){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
