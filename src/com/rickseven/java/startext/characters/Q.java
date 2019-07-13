package com.rickseven.java.startext.characters;

public class Q extends Character {

    private static Q instance = null;

    private Q(ICharacterOption option) {
        super(option);
    }

    public static Q getInstance(ICharacterOption option){
        if(instance == null){
            instance = new Q(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    if(j > 1 && j < n-1){
                        System.out.print(this.character);
                    }else if(i == n && j == n){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
                    }
                }else if(i >= middleY && j == i){
                    System.out.print(this.character);
                }else{
                    if(j == 1 || j == n-1){
                        System.out.print(this.character);
                    }else{
                        System.out.print(this.space);
                    }
                }
            }
        }
    }
}
