import java.util.Random;

/**
 * Created by cdhorn on 7/18/17.
 */
public class GamePiece {

    private int positionX;
    private int positionY;
    public boolean frozen;

    public String name;
    public String color;

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public int getMinX() {
        return minX = 0;
    }

    public int getMinY() {
        return minY = 0;
    }

    public int getMaxX() {
        return maxX = 50;
    }

    public int getMaxY() {
        return maxY = 50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFrozen() {

        return frozen;
    }

    public int getPositionY() {

        return positionY;
    }

    public int getPositionX() {

        return positionX;
    }
    //empty constructor, set x and y to 0 and frozen to false
    public GamePiece() {
          positionX = 0;
          positionY = 0;
          frozen = false;
    }
    //move method, take params for x and y positions
    public void move() {
        if (frozen != true) {

            Random rng = new Random();

            this.positionX = rng.nextInt(100);
            this.positionY = rng.nextInt(125);
            if (this.positionX > 50 ){
                System.out.println("You're out of bounds "+ this.name +"! Value of X must be below 50");
            }
            if (this.positionY > 70 ){
                System.out.println("You're out of bounds " + this.name + "! Value of Y must be below 70");
            }

        } else {
            System.out.println("You're frozen, " + this.name + "! Keep your " + this.color + " butt where it is!!!");
        }
    }

    public void freeze() {

         this.frozen = true;
    }

    public void unfreeze() {

        this.frozen = false;
    }

}
