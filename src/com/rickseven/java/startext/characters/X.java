package com.rickseven.java.startext.characters;

public class X extends Character {

    private static X instance = null;

    private X(ICharacterOption option) {
        super(option);
    }

    public static X getInstance(ICharacterOption option){
        if(instance == null){
            instance = new X(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j == i){
                    System.out.print(this.character);
                }else if (j == (n - i + 1)){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
