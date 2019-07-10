package com.rickseven.java.startext.characters;

public class C extends Character {

    private static C instance;

    private C(ICharacterOption option){
        super(option);
    }

    public static C getInstance(ICharacterOption option){
        if(instance == null)
            instance = new C(option);
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    if(j == 1){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                }else{
                    if(j == 1){
                        System.out.print(this.character);
                    }else {
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
