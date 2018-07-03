import java.lang.reflect.Array;
import java.util.Arrays;

public class point2D {
    float X = 0.0f;
    float y = 0.0f;

    public float getX() {
        return X;
    }
    public point2D(float x, float y) {
        this.X = X;
        this.y = y;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    float[] Array={getX(),getY()};

    public float[] getArray() {
        return Array;
    }

    public void setArray(float[] array) {
        Array = array;
    }

    @Override
    public String toString() {
        return "point2D{" +
                "X=" + X +
                ", y=" + y +
                '}';
    }
}
