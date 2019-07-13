package com.rickseven.java.startext.characters;

public class D extends Character {

    private static D instance = null;

    private D(ICharacterOption option) {
        super(option);
    }

    public static D getInstance(ICharacterOption option){
        if(instance == null){
            instance = new D(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    if(j == n){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                }else{
                    if(j == 1 || j == n){
                        System.out.print(this.character);
                    }else {
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
