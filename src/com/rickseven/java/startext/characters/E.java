package com.rickseven.java.startext.characters;

public class E extends Character{

    private static E instance = null;
    private ICharacterOption option;

    private E(ICharacterOption option){
        this.option = option;
    }

    public static E getInstance(ICharacterOption option)
    {
        if (instance == null)
            instance = new E(option);
        return instance;
    }

    @Override
    public void write(){
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(i == 1 || i == middleY || i == n){
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
