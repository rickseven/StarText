package com.rickseven.java.startext.characters;

public class N extends Character {

    private static N instance = null;

    private N(ICharacterOption option) {
        super(option);
    }

    public static N getInstance(ICharacterOption option){
        if(instance == null){
            instance = new N(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print(this.character);
                }else if (j == i){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
