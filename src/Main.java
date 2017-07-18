public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        GamePiece myGamePiece = new GamePiece();
        myGamePiece.setColor("green");
        myGamePiece.setName("Killer");
        myGamePiece.move();

        System.out.println("Where's my game piece? X position is " + myGamePiece.getPositionX() + " and Y position is" +
                " " + myGamePiece.getPositionY() + ".");

        myGamePiece.freeze();
        //this prints out true--correct
        System.out.println("frozen value should be true, frozen = " + myGamePiece.frozen);

        //should not allow you to move
        myGamePiece.move();

        myGamePiece.unfreeze();

        //this prints out false--correct
        System.out.println("frozen value should be false, frozen = " + myGamePiece.frozen);

        //should  allow you to move
        myGamePiece.move();

        System.out.println("Where's my game piece? X position is " + myGamePiece.getPositionX() + " and Y position is" +
                " " + myGamePiece.getPositionY() + ".");
    }
}
