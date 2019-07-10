package com.rickseven.java.startext.characters;

public class E extends Character{

    private static E instance = null;

    private E(ICharacterOption option){
        super(option);
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
                    System.out.print(this.character);
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
