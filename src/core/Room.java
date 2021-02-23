package core;

public class Room {
    private Room[][] dungeon;
    private String[] sprite;
    private boolean player;

    public Room(){
        dungeon=new Room[0][0];
        sprite = new String[11];
        sprite[0]="______________________";
        for (int i = 1; i < 10; i++) {
            sprite[i]="|                    |";
        }
        sprite[10]="----------------------";
        player = false;
    }
    public void printRoom(){
        for (int i = 0; i < 11; i++) {
            System.out.print(sprite[i]+"\n");
        }
    }
    public void printLabyrinth(){
        if(!(dungeon.length == 0)){
            if(!(dungeon[0].length == 0)){

            }
        }
        System.out.println("");
    }
}
