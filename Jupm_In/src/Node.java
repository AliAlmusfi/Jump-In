import java.util.*;

public class Node {
    Node parent_node;
    Map<Integer, Object> map = new HashMap<>();
    String [][]array_map = new String[6][6];

     int cost;
     int A_cost;

    int action [][];
    private int i=0;
    int [][]solution = new int[100][4];


    public void create_level(){
//        this.set_the_map_level1();
        for(int i=1 ; i<6 ; i++){
            for(int j=1 ; j<6 ; j++){
                boolean ok = true;
                for(Map.Entry<Integer , Object> entry : this.map.entrySet()){

                    Object obj = entry.getValue();
                    if(obj instanceof Hole){
                        Hole h = (Hole) obj;
                        if (entry.getKey() > 25 && h.x == i && h.y == j){
                            this.array_map[i][j] = "hr";
                            System.out.print("hr ");
                            ok=false;
                        }
                        else if(h.x == i && h.y == j) {
                            this.array_map[i][j] = String.valueOf(h.title);

                            System.out.print(h.title + " ");
                            ok=false;
                        }

                    } else if (obj instanceof Rabbit) {
                        Rabbit r = (Rabbit) obj;
                        if(r.x == i && r.y == j){
                            if(map.get(entry.getKey()+25) == null) {
                                this.array_map[i][j] = String.valueOf(r.title);

                                System.out.print(r.title + " ");
                                ok = false;
                            }
                        }
                    } else if (obj instanceof Fox) {
                        Fox f = (Fox) obj;
                        if((f.xhead == i && f.yhead == j) || (f.xtail == i && f.ytail == j)){
                            this.array_map[i][j] = String.valueOf(f.title);

                            System.out.print(f.title + " ");
                            ok=false;
                        }
                    }
                    else if (obj instanceof Mushroom) {
                        Mushroom m = (Mushroom) obj;
                        if(m.x == i && m.y == j){
                            this.array_map[i][j] = String.valueOf(m.title);

                            System.out.print(m.title + " ");
                            ok=false;
                        }
                    }
                    if (!ok){
                        break;
                    }
                }
                if (ok){
                    this.array_map[i][j] = "*";
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    public void findPossibleMoves() {
        System.out.println("\nPOSSIBLE MOVES :");


        findRabbitMovesSimple();


        findFoxMovesSimple();
    }

    private void findFoxMovesSimple(){
        System.out.println("FOX MOVES:");
        for(Map.Entry<Integer, Object> entry : this.map.entrySet()){
            Object obj = entry.getValue();
            if(obj instanceof  Fox){
                Fox fox = (Fox) obj;
                int xhead = fox.xhead;
                int yhead = fox.yhead;
                int xtail = fox.xtail;
                int ytail = fox.ytail;
                boolean isVertical = fox.isVertical;
                System.out.println("Checking fox at (" + xhead + "," + yhead + ")");
                find_dir_Fox_one_step(xhead , yhead ,xtail , ytail , isVertical);
//                if(isVertical){
//                    checkDirectionFox(xhead, yhead, xtail , ytail ,  -1, 0, "UP" , fox.isVertical);
//                    checkDirectionFox(xhead, yhead, xtail , ytail, 1, 0, "DOWN" , fox.isVertical);
//                }else {
//                    checkDirectionFox(xhead, yhead, xtail , ytail ,  0, -1, "LEFT" , fox.isVertical);
//                    checkDirectionFox(xhead, yhead, xtail , ytail, 0, 1, "RIGHT" , fox.isVertical);
//                }
            }
        }
    }
    private void find_dir_Fox_one_step(int xhead , int yhead , int xtail , int ytail , boolean isvertical){
        if(isvertical){
            int newxhead = xhead+1 , newxtail = xtail+1 ;
            if(isValidPositionFox(newxhead , yhead , newxtail , ytail , isvertical) && array_map[newxtail][ytail] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " + " objects to empty cell (" + newxhead + "," + yhead + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = newxhead;
                solution[i][3] = yhead;
                i++;
            }
            newxtail = xtail-1 ;
            newxhead = xhead-1;
//            System.out.println(array_map[newxtail-1][ytail]);
            if(isValidPositionFoxVertical(newxhead , newxtail , false) && array_map[newxhead][yhead] == "*"){
//                System.out.println("Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
                System.out.println(i + " -" + "CAN MOVE TO " + " objects to empty cell (" + newxtail + "," + ytail + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = newxhead;
                solution[i][3] = yhead;
                i++;
            }
        }else{
            int newyhead = yhead+1 , newytail = ytail+1;
            if(isValidPositionFox(xhead , newyhead , xtail , newytail , isvertical) && array_map[xhead][newyhead] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " + " objects to empty cell (" + xhead + "," + newyhead + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = xhead;
                solution[i][3] = newyhead;
                i++;
            }
            newyhead = yhead-1;
            newytail = ytail-1;
            if(isValidPositionFox(xhead , newyhead , xtail , newytail , isvertical) && array_map[xtail][newytail] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " + " objects to empty cell (" + xtail + "," + newytail + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = xhead;
                solution[i][3] = newyhead;
                i++;
            }
        }
    }
    private boolean isValidPositionFoxVertical(int xhead , int xtail ,boolean up){
        if(up){
            return xhead >= 1 ;
        }
        else {
            return xtail <= 5;
        }
    }
    private void find_dir_Fox(int xhead , int yhead , int xtail , int ytail , int dx , int dy , String directionName , boolean isvertical){
        int xnewhead = xhead + dx , xnewtail = xtail + dx;
        int ynewhead = yhead + dy , ynewtail = ytail + dy;
        int MoveCount = 0;
        boolean isEmpty = false;
        int j = 0;

        while (isValidPositionFox(xnewhead, ynewhead, xnewtail, ynewtail , isvertical)){
//            System.out.println(directionName +"Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            String cell;
            if(directionName == "UP" || directionName == "RIGHT") {
                cell = array_map[xnewhead][ynewhead];

            }else {
                cell = array_map[xnewtail][ynewtail];

            }
            if("*".equals(cell)){
                MoveCount++;
                if(directionName == "UP" || directionName == "RIGHT") {
                    System.out.println(i + " -" + "CAN MOVE to empty cell (" + xnewhead + "," + ynewhead + ")");
                }else {
                    System.out.println(i + " -" + " CAN MOVE  to empty cell (" + xnewtail + "," + ynewtail + ")");
                }
                solution[i][j] = xhead;
                j++;
                solution[i][j] = yhead;
                j++;
                solution[i][j] = xnewhead;
                j++;
                solution[i][j] = ynewhead;
                i++;
                j=0;
                int nextXhead = xnewhead + dx , nextXtail = xnewtail + dx;
                int nextYhead = ynewhead + dy , nextYtail = ynewtail + dy;
                xnewhead = nextXhead;
                xnewtail = nextXtail;
                ynewhead = nextYhead;
                ynewtail = nextYtail;
            } else {
                break;
            }

        }

    }
    private void findRabbitMovesSimple() {
        i=0;

        System.out.println("RABBIT MOVES:");

        for (Map.Entry<Integer, Object> entry : this.map.entrySet()) {
            Object obj = entry.getValue();
            if (obj instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) obj;
                int x = rabbit.x;
                int y = rabbit.y;

                // Check if rabbit is in a hole
                boolean isInHole = map.containsKey(entry.getKey() + 25);

                if (isInHole) {
                    System.out.println("Checking rabbit IN HOLE at (" + x + "," + y + ")");

//                    findMovesFromHole(x, y);
                    find_dir(x, y, -1, 0);
                    find_dir(x, y, 1, 0);
                    find_dir(x, y, 0, -1);
                    find_dir(x, y, 0, 1);
                } else {
                    System.out.println("Checking rabbit at (" + x + "," + y + ")");

                    find_dir(x, y, -1, 0);
                    find_dir(x, y, 1, 0);
                    find_dir(x, y, 0, -1);
                    find_dir(x, y, 0, 1);
                }
            }
        }
    }


    private void find_dir(int newX, int newY, int dirx, int diry) {
        int x = newX + dirx;
        int y = newY + diry;

        boolean foundObject = false;
        int j = 0;

        while (isValidPosition(x, y)) {
            String cell = array_map[x][y];

            if ("*".equals(cell)) {
                if (foundObject) {
                    System.out.println(i + " -" + " CAN JUMP over to empty cell (" + x + "," + y + ")");
                    solution[i][j] = newX;
                    j++;
                    solution[i][j] = newY;
                    j++;
                    solution[i][j] = x;
                    j++;
                    solution[i][j] = y;
                    i++;
                    j=0;

                }
                break;
            }

            else if ("h".equals(cell)) {
                if(foundObject){
                    System.out.println(i + " -" + " CAN JUMP to hole (" + x + "," + y + ")");
                    solution[i][j] = newX;
                    j++;
                    solution[i][j] = newY;
                    j++;
                    solution[i][j] = x;
                    j++;
                    solution[i][j] = y;
                    i++;
                    j=0;

                }

                break;
            }

            else if ("m".equals(cell) || "f".equals(cell) || "r".equals(cell) || "hr".equals(cell)) {
                foundObject = true;


                int nextX = x + dirx;
                int nextY = y + diry;

                x = nextX;
                y = nextY;
            }

        }
    }
    private boolean isValidPosition(int x, int y) {
        return x >= 1 && x <= 5 && y >= 1 && y <= 5;
    }
    private boolean isValidPositionFox(int xhead, int yhead , int xtail , int ytail , boolean isvertical) {
        if(isvertical){
            return xhead >= 1 && xhead < 5 && yhead >= 1 && yhead <=5 && xtail >1 && ytail <=5 ;
        }
        return xhead >= 1 && xhead <= 5 && yhead > 1 && yhead <= 5 && xtail >= 1 && xtail <= 5 && ytail >=1 && ytail < 5;
    }

    public boolean check_if_win(){
        boolean ok = false;
        int rabbit_number = 0 , hole_number = 0;
        for(Map.Entry<Integer , Object> entry : this.map.entrySet()){
            Object obj = entry.getValue();
            if(obj instanceof Rabbit){
                rabbit_number++;
                Rabbit r = (Rabbit) obj;
                int hole_key = (r.x*5)-5+r.y +25;
                if(map.get(hole_key) != null){
                    hole_number++;
                    ok = true;
                }else{
                    ok = false;
                }
            }
        }
        if(rabbit_number == hole_number){
            return true;
        }
        return false;
    }
    public void confirm_move(int x){
        int xold = solution[x][0] , yold =solution[x][1] , xnew = solution[x][2], ynew = solution[x][3];
        int keymap = (xold*5)-5 +yold;
        Object obj = map.get(keymap);
        if(obj instanceof Rabbit){
            Rabbit r = (Rabbit) obj;
            r.x = xnew;
            r.y = ynew;
            Rabbit r1 = (Rabbit) map.remove(keymap);
            int newkey = (xnew*5)-5 +ynew;
            int hole_newkey = newkey;
            if(map.get(hole_newkey) !=null ){
//                System.out.println("//////////////////////////////////////////////////////////////////////////");
                Object obj2 = map.get(hole_newkey);
                if(obj2 instanceof  Hole){
                    Hole h1 = (Hole) map.remove(hole_newkey);
                    map.put((h1.x*5)-5 +h1.y+25 , h1);
                }
            }
            map.put(newkey, r1);
            keymap+=25;
        }
        if(map.get(keymap) !=null ){
            Object obj2 = map.get(keymap);
            if(obj2 instanceof  Hole){
                Hole h1 = (Hole) map.remove(keymap);
                map.put((h1.x*5)-5 +h1.y , h1);
            }
        }
        if (obj instanceof Fox){
            Fox f = (Fox) obj;
            f.xhead = xnew;
            f.yhead = ynew;
            if (f.isVertical){
                f.xtail = xnew+1;
                f.ytail = ynew;
            }else {
                f.xtail = xnew;
                f.ytail = ynew-1;
            }
            Fox f1 = (Fox) map.remove(keymap);
            int newkey = (xnew*5)-5 +ynew;
            map.put(newkey , f1);
            System.out.println(map);
        }

        for(int i=0 ; i<solution.length ; i++) {
            for (int j = 0; j < 4; j++) {
                solution[i][j] = 0;
            }
        }
    }

    public void print_solution(){
        boolean ok = false;
        for(int i=0 ; i<solution.length ; i++){
            for(int j=0 ; j< 4 ; j++){
                if(solution[i][j] == 0){
                    ok = true;
                    break;
                }
                System.out.print( solution[i][j] + " ");
            }
            if(ok){
                break;
            }

//            System.out.print(" - " + i );
            System.out.println();
        }
    }
    public void start(){
        Scanner cin = new Scanner(System.in);
        GamePlay g = new GamePlay(1);
        Node current = null;
        Node root = null;
        System.out.println("WELCOME TO JUMPIN");
        System.out.print("choose the level (1 or 2 or 3 or 4 or 5 or 6 or 7 or 9): ");
        int level = cin.nextInt();
        switch (level){
            case 1:
                g.set_the_map_level1();
                break;
            case 2:
                g.set_the_map_level2();
                break;
            case 3:
                g.set_the_map_level3();
                break;
            case  4:
                g.set_the_map_level4();
                break;
            case 5:
                g.set_the_map_level5();
                break;
            case 6:
                g.set_the_map_level6();
                break;
            case 7:
                g.set_the_map_level7();
                break;
            case 9:
                g.set_the_map_level9();
                break;
            default:
                break;
        }
        int i=0;
        while (!g.check_if_win()){
            g.create_level();
            Node new_node = new Node();
            if(i==0){
                new_node.parent_node = null;
                root = new_node;
                root.cost = i+1;
                root.map = g.map_deep_copy(g.map);
                root.array_map = g.array_deep_copy();
            }else {
                new_node.parent_node = current;
                new_node.cost = i+1;
                new_node.map = current.map;
            }
            current = new_node;
            current.findPossibleMoves();
            System.out.print("choose the move : ");
            int x = cin.nextInt();
            current.confirm_move(x);

            i++;

        }
//            System.out.println(g.map);
        g.create_level();
        System.out.println("------------------ WIN! ------------------");
    }

    public void print_array(){
        for(int i=1 ; i<6 ; i++){
            for(int j=1 ; j<6 ; j++){
                System.out.print(this.array_map[i][j]+" ");
            }
            System.out.println();
        }
    }

//    public Map get_the_map(GamePlay g){
//        this.map = g.map_deep_copy();
//        return map;
//    }

    public void print_solution_path(Node endNode) {
        List<Node> path = new ArrayList<>();
        Node current = endNode;

        while (current != null) {
            path.add(0, current);
            current = current.parent_node;
        }

        System.out.println("Solution path has " + path.size() + " moves:");
        for (int i = 0; i < path.size(); i++) {
            System.out.println("Move " + i + ": " + path.get(i));
        }
    }
    public  void print_nodes(Node end){
        List<Node> list = new ArrayList<>();
        Node current = end;
        while(current != null){
            list.add(current);
            current = current.parent_node;
        }
        for(int i=0 ; i<list.size() ; i++){
//            System.out.println(list.get(i).array_map);
            list.get(i).print_array();
            System.out.println();
        }
        System.out.println(list.size()-1);
    }
    public String[][] array_deep_copy(){
        String arr [][] = new String[6][6];
        for(int i=1 ; i<6 ; i++){
            for(int j=1 ; j<6 ; j++){
                arr[i][j] = this.array_map[i][j];
            }
        }
        return arr;
    }
    public Map<Integer, Object> map_deep_copy(Map<Integer, Object> original) {
//        Map<Integer, Object> copy = new HashMap<>();
//        for (Map.Entry<Integer, Object> entry : original.entrySet()) {
//            copy.put(entry.getKey(), entry.getValue());
//        }
//        return copy;
        Map<Integer, Object> copy = new HashMap<>();
        for (Map.Entry<Integer, Object> entry : original.entrySet()) {
            Object obj = entry.getValue();
            Object clonedObj = null;

            if (obj instanceof Rabbit) {
                clonedObj = ((Rabbit) obj).clone();
            } else if (obj instanceof Fox) {
                clonedObj = ((Fox) obj).clone();
            } else if (obj instanceof Hole) {
                clonedObj = ((Hole) obj).clone();
            } else if (obj instanceof Mushroom) {
                clonedObj = ((Mushroom) obj).clone();
            } else {
                clonedObj = obj; // fallback
            }

            copy.put(entry.getKey(), clonedObj);
        }
        return copy;
    }


    public List get_next_states(Node node){
        List<Node> next_status = new ArrayList<>();

        for(int j=0 ; j<node.solution.length ; j++) {

            if(node.solution[j][0] == 0){
                break;
            }
            Node newState = new Node();
            newState.parent_node = node; // Link to parent
            newState.cost = node.cost + 1;
            newState.map = node.map_deep_copy(node.map);
            newState.array_map = node.array_deep_copy();
            newState.solution = new int[node.solution.length][4];
            for (int k = 0; k < node.solution.length; k++) {
                System.arraycopy(node.solution[k], 0, newState.solution[k], 0, 4);
            }
            newState.confirm_move(j);
            newState.sync_array_to_map();
//            positions.create_level();
            System.out.println(newState.map);
            next_status.add(newState);

        }

        return next_status;
    }

    public void sync_array_to_map(){
        for(int i=1 ; i<6 ; i++){
            for(int j=1 ; j<6 ; j++){
                boolean ok = true;
                for(Map.Entry<Integer , Object> entry : this.map.entrySet()){

                    Object obj = entry.getValue();
                    if(obj instanceof Hole){
                        Hole h = (Hole) obj;
                        if (entry.getKey() > 25 && h.x == i && h.y == j){
                            this.array_map[i][j] = "hr";
//                            System.out.print("hr ");
                            ok=false;
                        }
                        else if(h.x == i && h.y == j) {
                            this.array_map[i][j] = String.valueOf(h.title);

//                            System.out.print(h.title + " ");
                            ok=false;
                        }

                    } else if (obj instanceof Rabbit) {
                        Rabbit r = (Rabbit) obj;
                        if(r.x == i && r.y == j){
                            if(map.get(entry.getKey()+25) == null) {
                                this.array_map[i][j] = String.valueOf(r.title);

//                                System.out.print(r.title + " ");
                                ok = false;
                            }
                        }
                    } else if (obj instanceof Fox) {
                        Fox f = (Fox) obj;
                        if((f.xhead == i && f.yhead == j) || (f.xtail == i && f.ytail == j)){
                            this.array_map[i][j] = String.valueOf(f.title);

//                            System.out.print(f.title + " ");
                            ok=false;
                        }
                    }
                    else if (obj instanceof Mushroom) {
                        Mushroom m = (Mushroom) obj;
                        if(m.x == i && m.y == j){
                            this.array_map[i][j] = String.valueOf(m.title);

//                            System.out.print(m.title + " ");
                            ok=false;
                        }
                    }
                    if (!ok){
                        break;
                    }
                }
                if (ok){
                    this.array_map[i][j] = "*";
//                    System.out.print("* ");
                }

            }
//            System.out.println();
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Node other = (Node) obj;

        return Arrays.deepEquals(this.array_map, other.array_map);
    }

    @Override
    public int hashCode() {
        int res = 13;

        res = (37 * res) + this.array_map.length;

        for(int i = 1 ; i < 6 ; i++){
            res = (37 * res) + this.array_map[i].length;
            for(int j = 1 ; j < 6 ; j++){
                res = (37 * res) + this.array_map[i][j].hashCode();
            }
        }

        return res;

    }
}
