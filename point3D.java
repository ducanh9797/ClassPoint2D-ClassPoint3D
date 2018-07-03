public class point3D extends point2D {
    float Z = 0.0f;

    public point3D(float X,float Y,float Z) {
        super(X, Y);
        this.Z = Z;
    }

    public float getZ() {
        return Z;
    }

    public void setZ(float z) {
        Z = z;
    }
    float[] Array={getZ(),getX(),getY()};
    public float[] getArray(){
        return Array;
    }
    public void setArray(float[] array){
        Array = array;
    }

    @Override
    public String toString() {
        return "point3D{" +
                "Z=" + Z +
                ", X=" + X +
                ", y=" + y +
                '}';
    }
}
