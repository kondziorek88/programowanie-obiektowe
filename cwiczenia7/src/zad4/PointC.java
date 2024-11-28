package zad4;

public class PointC {
    int x;
    int y;

    public PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointR toPointR(){
        return new PointR(x, y);
    }
}
