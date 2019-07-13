package com.rickseven.java.startext.characters;

public class W extends Character {

    private static W instance = null;

    private W(ICharacterOption option) {
        super(option);
    }

    public static W getInstance(ICharacterOption option){
        if(instance == null){
            instance = new W(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n/2) + 1;
        int middleX = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print(this.character);
                }else if(i >= middleY){
                    if(n%2==0){
                        if(i < n && j == ((middleX-1) - (i-middleX))){
                            System.out.print(this.character);
                        }else if(i < n && j == i){
                            System.out.print(this.character);
                        }else{
                            System.out.print(this.space);
                        }
                    }else{
                        if(i == middleY && j == middleX){
                            System.out.print(this.character);
                        }else if(i < n && j == (middleX - (i - middleX))){
                            System.out.print(this.character);
                        }else if(i < n && j == i){
                            System.out.print(this.character);
                        }else{
                            System.out.print(this.space);
                        }
                    }
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
