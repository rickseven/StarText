package com.rickseven.java.startext.characters;

public class M extends Character {

    private static M instance = null;

    private M(ICharacterOption option) {
        super(option);
    }

    public static M getInstance(ICharacterOption option){
        if(instance == null){
            instance = new M(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(i <= middleY){
                    if(j == 1 || j == n){
                        System.out.print(this.character);
                    }else if (j == i){
                        System.out.print(this.character);
                    }else if (j == (n - i + 1)){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
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
