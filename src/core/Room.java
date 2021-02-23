package core;

import exception.DungeonException;

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

    public Room(int dungx, int dungy){
        dungeon=new Room[dungx][dungy];
        for (int i = 0; i < dungx; i++) {
            for (int j = 0; j < dungy; j++) {
                dungeon[i][j] = new Room();
            }
        }
        player = false;
    }

    public void printRoom(){
        for (int i = 0; i < 11; i++) {
            System.out.print(sprite[i]+"\n");
        }
    }

    public Room[][] getDungeon() {
        return dungeon;
    }

    public void setDungeon(Room[][] dungeon) {
        this.dungeon = dungeon;
    }

    public String[] getSprite() {
        return sprite;
    }

    public void setSprite(String[] sprite) {
        this.sprite = sprite;
    }

    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }

    public void printLabyrinth() throws DungeonException {
        if(dungeon.length == 0){
            if(dungeon[0].length == 0){
                throw new DungeonException("No Dungeon Found");
            }
        }else{
            for (int i = 0; i < dungeon.length; i++) {
                for (int j = 0; j < 11; j++) {
                    for (int k = 0; k < dungeon[i].length; k++) {
                        System.out.print((dungeon[i][k].getSprite())[j]);
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}
