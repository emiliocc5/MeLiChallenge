package model;

public class Position {
    public float getxPosition() {
        return xPosition;
    }

    public void setxPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getyPosition() {
        return yPosition;
    }

    public void setyPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    private float xPosition;
    private float yPosition;

    public Position(Float x) {
        this.xPosition = x;
    }


}
