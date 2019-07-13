package com.rickseven.java.startext.characters;

public class Y extends Character {

    private static Y instance = null;

    private Y(ICharacterOption option) {
        super(option);
    }

    public static Y getInstance(ICharacterOption option){
        if(instance == null){
            instance = new Y(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middle = (n%2==0) ? (n/2) : (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i <= middle && j == i){
                    System.out.print(this.character);
                }else if (i <= middle && j == (n - i + 1)){
                    System.out.print(this.character);
                }else if(n%2!=0 && i > middle && j == (middle - (i - middle))){
                    System.out.print(this.character);
                }else if(n%2==0 && i > middle && j == ((middle - (i - middle))+1)){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
