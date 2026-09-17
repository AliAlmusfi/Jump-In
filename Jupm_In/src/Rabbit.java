public class Rabbit {
    String name = "rabbit";
    char title = 'r';
    int x ;
    int y ;

    boolean inHole = false;

    Rabbit(int x , int y){
        this.x = x;
        this.y = y;
    }
    public Rabbit clone() {
        return new Rabbit(this.x, this.y);
    }

    @Override
    public String toString(){
        return "r";
    }
}
