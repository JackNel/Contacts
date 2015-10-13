/**
 * Created by Jack on 10/7/15.
 */
public class Player {
    Position pos;

    public Player(Position pos) {
        this.pos = pos;
    }

    public void movePosition(double x, double y) {
        pos.x = pos.x + x;
        pos.y = pos.y + y;
    }

    public void printPosition() {
        System.out.println(pos.x);
        System.out.println(pos.y);
    }
}