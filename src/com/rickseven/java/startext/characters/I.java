package com.rickseven.java.startext.characters;

public class I extends Character {

    private static I instance = null;

    private I(ICharacterOption option){
        super(option);
    }

    public static I getInstance(ICharacterOption option){
        if(instance == null)
            instance = new I(option);
        return instance;
    }

    @Override
    public void printChar(int y, int x) {
        int n = (this.option.isWithSpace()) ? this.option.getSize() * 2 : this.option.getSize();
        byte[][] arr = this.to2DArray();
        char ch = (char) arr[y][x];
        if(ch != ' '){
            System.out.print(ch);
        }
        if(x == (n-1)){
            System.out.print(this.space);
        }
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleX = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(j == middleX){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
