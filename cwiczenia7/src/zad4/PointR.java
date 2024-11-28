package zad4;

public record PointR(int x, int y) {
    public  PointC fromPointR(){
        return new PointC(this.x(), this.y());
    }

}
