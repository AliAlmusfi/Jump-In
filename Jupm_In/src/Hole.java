public class Hole {
    String namre = "hole";
    char title = 'h';
    int x;
    int y;

    boolean filled = false;
     Hole(int x , int y){
        this.x = x;
        this.y = y;
    }
    public Hole clone() {
        return new Hole(this.x, this.y);
    }
    @Override
    public String toString(){
         return "h";
    }
    public String print_title(){
         if (this.filled){
             return "r&h";
         }
         return "h";
    }
}
