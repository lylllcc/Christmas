package cc.lylllcc.christmas;

/**
 * Created by lylllcc on 2016/12/24.
 */

public class Point {

    private final int alfa;
    private float x;
    private float y;
    private float speed;
    private float Radius;
    private Boolean RepeatLabel;


    public Point(float x, float y,float speed,float Radius,int alfa,boolean RepeatLabel) {
        this.x = x;
        this.y = y;

        this.speed = speed;

        this.Radius = Radius;

        this.alfa = alfa;
        this.RepeatLabel = RepeatLabel;
    }

    public int getAlfa() {
        return alfa;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    public Boolean getRepeatLabel() {
        return RepeatLabel;
    }

    public void setRepeatLabel(Boolean repeatLabel) {
        RepeatLabel = repeatLabel;
    }
}
