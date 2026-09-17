public class Fox {
    String name = "fox";
    char title = 'f';
    int head ;
    int tail ;
    int xhead;
    int yhead;
    int xtail;
    int ytail;
    boolean isVertical ;

    Fox(int xhead , int yhead , int xtail , int ytail , boolean isVertical){
        this.xhead = xhead;
        this.yhead = yhead;
        this.xtail = xtail;
        this.ytail = ytail;
        this.isVertical = isVertical;
    }
    public Fox clone() {
        Fox clone = new Fox(this.xhead, this.yhead, this.xtail, this.ytail, this.isVertical);
        return clone;
    }
    @Override
    public String toString(){
        return "f";
    }

}
