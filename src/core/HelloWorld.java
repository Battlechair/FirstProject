package core;

public class HelloWorld {
    public static void main(String args[]){
        String[] sprite = new String[11];
        sprite[0]="__________      _________ ";
        for (int i = 1; i < 10; i++) {
            sprite[i]="|                       | ";
        }
        sprite[5] = "                          ";
        sprite[10]="------------------------- ";
        Room room = new Room();
        room.setSprite(sprite);
        Room dung = new Room(5,4);
        dung.setRoom(2,3,room);
        try {
            dung.printLabyrinth();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
