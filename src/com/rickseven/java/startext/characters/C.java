package com.rickseven.java.startext.characters;

public class C extends Character {

    private static C instance;
    private ICharacterOption option;

    private C(ICharacterOption option){
        this.option = option;
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
                    System.out.print("*");
                }else{
                    if(j == 1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            //System.out.println();
        }
    }

    @Override
    public ICharacterOption option() {
        return this.option;
    }
}
