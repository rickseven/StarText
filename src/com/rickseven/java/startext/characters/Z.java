package com.rickseven.java.startext.characters;

public class Z extends Character{

    private static Z instance = null;

    private Z(ICharacterOption option) {
        super(option);
    }

    public static Z getInstance(ICharacterOption option){
        if(instance == null){
            instance = new Z(option);
        }
        return instance;
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    System.out.print(this.character);
                }else if(j == (n - i + 1)){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
