package com.rickseven.java.startext.characters;

public class U extends Character {

    private static U instance = null;

    private U(ICharacterOption option) {
        super(option);
    }

    public static U getInstance(ICharacterOption option){
        if(instance == null){
            instance = new U(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == n){
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
