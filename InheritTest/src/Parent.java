public class Parent {
    private int x;
    protected int y;
    public int z;

    public Parent(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.println("parameter 3 constructor");
    }


    public Parent(){
        System.out.println("default constructor");
        x = 1;
        y = 1;
        z = 1;

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }



    public void output() {
        System.out.println("x= "+x+",y= "+y+",z= "+z);

    }
}
