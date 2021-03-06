package core;

import exception.DungeonException;

public class Room {
    private Room[][] dungeon;
    private String[] sprite;
    private boolean player;

    public Room(){
        dungeon=new Room[0][0];
        sprite = new String[11];
        sprite[0]="_________________________ ";
        for (int i = 1; i < 10; i++) {
            sprite[i]="|                       | ";
        }
        sprite[10]="------------------------- ";
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

    public void setRoom(int x, int y,Room room){
        getDungeon()[getDungeon().length - (y)][x-1]=room;
    }

    public void printLabyrinth() throws DungeonException {
        if(getDungeon().length == 0){
            if(getDungeon()[0].length == 0){
                throw new DungeonException("No Dungeon Found");
            }
        }else{
            for (int i = 0; i < getDungeon().length; i++) {
                for (int j = 0; j < 11; j++) {
                    for (int k = 0; k < getDungeon()[i].length; k++) {
                        System.out.print((getDungeon()[i][k].getSprite())[j]);
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}
