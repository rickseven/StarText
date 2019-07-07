package com.rickseven.java.startext.characters;

public class R extends Character{

    private static R instance = null;
    private ICharacterOption option;

    private R(ICharacterOption option){
        this.option = option;
    }

    public static R getInstance(ICharacterOption option){
        if(instance == null)
            instance = new R(option);
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(i == 1 || i == middleY){
                    System.out.print("*");
                }else{
                    if(i < middleY){
                        if(j > 1 && j < n){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }else {
                        if(j == 1 || i == j){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
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
