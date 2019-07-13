package com.rickseven.java.startext.characters;

public class L extends Character {

    private static L instance = null;

    private L(ICharacterOption option) {
        super(option);
    }

    public static L getInstance(ICharacterOption option){
        if(instance == null){
            instance = new L(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == n){
                    System.out.print(this.character);
                }else if(j == 1){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
