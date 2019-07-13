package com.rickseven.java.startext.characters;

public class K extends Character {

    private static K instance = null;

    private K(ICharacterOption option) {
        super(option);
    }

    public static K getInstance(ICharacterOption option){
        if(instance == null){
            instance = new K(option);
        }
        return instance;
    }

    @Override
    public void printChar(int y, int x) {
        int n = (this.option.isWithSpace()) ? this.option.getSize() * 2 : this.option.getSize();
        byte[][] arr = this.to2DArray();
        char ch = (char) arr[y][x];
        int limit = (this.option.isWithSpace()) ? (n-2) : (n-1);
        if(x < limit){
            System.out.print(ch);
        }
        if(x == (n-1)){
            System.out.print(space);
        }
    }

    @Override
    public void write() {
        int n = this.option.getSize();
        int middleY = (n%2==0) ? (n/2) : (n/2) + 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j == 1){
                    System.out.print(this.character);
                }else if(n%2!=0 && j > 1 && j == (n-i)){
                    System.out.print(this.character);
                }else if(n%2==0 && j > 1 && j == (n-i)){
                    System.out.print(this.character);
                }else if(n%2!=0 && i > middleY && j > 1 && j == (n - (n-i) - 1)){
                    System.out.print(this.character);
                }else if(n%2==0 && i > middleY && j > 1 && j == (n - (n-i) - 1)){
                    System.out.print(this.character);
                }else{
                    System.out.print(this.space);
                }
            }
        }
    }
}
