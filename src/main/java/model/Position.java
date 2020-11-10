package model;

public class Position {
    private float xPosition;
    private float yPosition;

    public Position(Float xPosition, Float yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Position() {}

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
}
