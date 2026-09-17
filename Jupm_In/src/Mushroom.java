public class Mushroom {
    String name = "mushroom";
    char title = 'm';
    int x ;
    int y;

    Mushroom(int x , int y){
        this.x = x;
        this.y = y;
    }
    public Mushroom clone() {
        return new Mushroom(this.x, this.y);
    }
    @Override
    public String toString(){
        return "m";
    }
}
