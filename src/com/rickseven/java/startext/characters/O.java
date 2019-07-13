package com.rickseven.java.startext.characters;

public class O extends Character {

    private static O instance = null;

    private O(ICharacterOption option) {
        super(option);
    }

    public static O getInstance(ICharacterOption option){
        if(instance == null){
            instance = new O(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    if(j == 1 || j == n){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                }else{
                    if(j == 1 || j == n){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
