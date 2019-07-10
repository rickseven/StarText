package com.rickseven.java.startext.characters;

public class R extends Character{

    private static R instance = null;

    private R(ICharacterOption option){
        super(option);
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
                    if(j == n){
                        System.out.print(this.space);
                    }else{
                        System.out.print(this.character);
                    }
                }else{
                    if(i < middleY){
                        if(j > 1 && j < n){
                            System.out.print(this.space);
                        }else{
                            System.out.print(this.character);
                        }
                    }else {
                        if(j == 1 || i == j){
                            System.out.print(this.character);
                        }else{
                            System.out.print(this.space);
                        }
                    }

                }
            }
        }
    }
}
