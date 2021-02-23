package core;

public class HelloWorld {
    public static void main(String args[]){
        Room room = new Room(5,4);
        try {
            room.printLabyrinth();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
