import java.util.*;
public class GamePlay {
    Map<Integer, Object> map = new HashMap<>();
    String[][] map1 = new String[6][6];
    int[][] solution = new int[100][4];
    int level;
    private int i = 0;

    GamePlay(int level) {
        this.level = level;
    }

    GamePlay(int level, Map map) {
        this.level = level;
        this.map = map;
    }

    public Map set_the_map_level1() {
        Rabbit rabbit = new Rabbit(3, 4);
        Mushroom mushroom1 = new Mushroom(1, 2);
        Mushroom mushroom2 = new Mushroom(1, 3);
        Mushroom mushroom3 = new Mushroom(2, 4);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5);
        Hole hole3 = new Hole(3, 3);
        Hole hole4 = new Hole(5, 1);
        Hole hole5 = new Hole(5, 5);
        this.map.put((rabbit.x * 5) - 5 + rabbit.y, rabbit);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((hole5.x * 5) - 5 + hole5.y, hole5);
        return map;
    }

    public Map set_the_map_level2() {
        Rabbit rabbit1 = new Rabbit(1, 3);
        Rabbit rabbit2 = new Rabbit(1, 5);
        Mushroom mushroom1 = new Mushroom(1, 4);
        Mushroom mushroom2 = new Mushroom(2, 5);
        Mushroom mushroom3 = new Mushroom(3, 4);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5);
        Hole hole3 = new Hole(3, 3);
        Hole hole4 = new Hole(5, 1);
        Hole hole5 = new Hole(5, 5);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y + 25, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((hole5.x * 5) - 5 + hole5.y, hole5);
        return map;
    }

    public Map set_the_map_level3() {
        Rabbit rabbit1 = new Rabbit(2, 3);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5);
        Hole hole3 = new Hole(5, 1);
        Hole hole4 = new Hole(5, 5);
        Mushroom mushroom1 = new Mushroom(1, 4);
        Mushroom mushroom2 = new Mushroom(2, 2);
        Mushroom mushroom3 = new Mushroom(3, 3);
        Fox fox1 = new Fox(2, 5, 2, 4, false);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);

        return map;
    }

    public Map set_the_map_level4() {
        Rabbit rabbit1 = new Rabbit(1, 4);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(5, 1);
        Hole hole3 = new Hole(5, 5);
        Hole hole4 = new Hole(1, 5);
        Mushroom mushroom1 = new Mushroom(3, 2);
        Mushroom mushroom2 = new Mushroom(3, 3);
        Mushroom mushroom3 = new Mushroom(3, 5);
        Fox fox1 = new Fox(2, 3, 2, 2, false);

        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);

        return map;
    }
    public Map set_the_map_level5() {
        Rabbit rabbit1 = new Rabbit(2, 1);
        Rabbit rabbit2 = new Rabbit(3, 3);
        Rabbit rabbit3 = new Rabbit(1, 5);
        Rabbit rabbit4 = new Rabbit(5, 5);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5); //+25
        Hole hole3 = new Hole(5, 1);
        Hole hole4 = new Hole(5, 5); //+25
        Hole hole5 = new Hole(3, 3); //+25
        Mushroom mushroom1 = new Mushroom(3, 4);
        Mushroom mushroom2 = new Mushroom(4, 1);
        Mushroom mushroom3 = new Mushroom(4, 5);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((rabbit3.x * 5) - 5 + rabbit3.y, rabbit3);
        this.map.put((rabbit4.x * 5) - 5 + rabbit4.y, rabbit4);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y + 25, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y + 25, hole4);
        this.map.put((hole5.x * 5) - 5 + hole5.y + 25, hole5);

        return map;
    }
    public Map set_the_map_level6() {
        Rabbit rabbit1 = new Rabbit(1, 3);
        Rabbit rabbit2 = new Rabbit(1, 5);
        Rabbit rabbit3 = new Rabbit(3, 2);
        Rabbit rabbit4 = new Rabbit(5, 3);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5); //+25
        Hole hole3 = new Hole(5, 1);
        Hole hole4 = new Hole(5, 5);
        Hole hole5 = new Hole(3, 3);
        Mushroom mushroom1 = new Mushroom(3, 1);
        Mushroom mushroom2 = new Mushroom(3, 4);
        Mushroom mushroom3 = new Mushroom(2, 5);
        Fox fox1 = new Fox(1, 2, 2, 2, true);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((rabbit3.x * 5) - 5 + rabbit3.y, rabbit3);
        this.map.put((rabbit4.x * 5) - 5 + rabbit4.y, rabbit4);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y + 25, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y , hole4);
        this.map.put((hole5.x * 5) - 5 + hole5.y , hole5);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);

        return map;
    }

    public Map set_the_map_level7() {
        Rabbit rabbit1 = new Rabbit(4, 1);
        Rabbit rabbit2 = new Rabbit(4, 4);
        Mushroom mushroom1 = new Mushroom(2, 5);
        Mushroom mushroom2 = new Mushroom(3, 5);
        Mushroom mushroom3 = new Mushroom(5, 5);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(5, 1);
        Hole hole3 = new Hole(1, 5);
        Hole hole4 = new Hole(3, 3);
        Fox fox1 = new Fox(1, 2, 2, 2, true);
        Fox fox2 = new Fox(1, 4, 2, 4, true);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);
        this.map.put((fox2.xhead * 5) - 5 + fox2.yhead, fox2);
        return map;
    }
    public Map set_the_map_level8() {
        Rabbit rabbit1 = new Rabbit(3, 3);
        Rabbit rabbit2 = new Rabbit(2, 4);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5);
        Hole hole3 = new Hole(5, 1);
        Hole hole4 = new Hole(5, 5);
        Hole hole5 = new Hole(3, 3); //25
        Mushroom mushroom1 = new Mushroom(1, 2);
        Mushroom mushroom2 = new Mushroom(4, 2);
        Fox fox1 = new Fox(2, 2, 2, 1, false);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((hole5.x * 5) - 5 + hole5.y +25, hole5);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);
        return map;
    }
    public Map set_the_map_level9() {
        Rabbit rabbit1 = new Rabbit(5, 2);
        Rabbit rabbit2 = new Rabbit(5, 3);
        Hole hole1 = new Hole(1, 1);
        Hole hole2 = new Hole(1, 5);
        Hole hole3 = new Hole(3, 3);
        Hole hole4 = new Hole(5, 5);
        Mushroom mushroom1 = new Mushroom(2, 3);
        Mushroom mushroom2 = new Mushroom(4, 3);
        Mushroom mushroom3 = new Mushroom(5, 1);
        Fox fox1 = new Fox(1, 2, 2, 2, true);
        this.map.put((rabbit1.x * 5) - 5 + rabbit1.y, rabbit1);
        this.map.put((rabbit2.x * 5) - 5 + rabbit2.y, rabbit2);
        this.map.put((mushroom1.x * 5) - 5 + mushroom1.y, mushroom1);
        this.map.put((mushroom2.x * 5) - 5 + mushroom2.y, mushroom2);
        this.map.put((mushroom3.x * 5) - 5 + mushroom3.y, mushroom3);
        this.map.put((hole1.x * 5) - 5 + hole1.y, hole1);
        this.map.put((hole2.x * 5) - 5 + hole2.y, hole2);
        this.map.put((hole3.x * 5) - 5 + hole3.y, hole3);
        this.map.put((hole4.x * 5) - 5 + hole4.y, hole4);
        this.map.put((fox1.xhead * 5) - 5 + fox1.yhead, fox1);
        return map;

    }

    public void create_level() {
//        this.set_the_map_level1();
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                boolean ok = true;
                for (Map.Entry<Integer, Object> entry : this.map.entrySet()) {

                    Object obj = entry.getValue();
                    if (obj instanceof Hole) {
                        Hole h = (Hole) obj;
                        if (entry.getKey() > 25 && h.x == i && h.y == j) {
                            this.map1[i][j] = "hr";
                            System.out.print("hr ");
                            ok = false;
                        } else if (h.x == i && h.y == j) {
                            this.map1[i][j] = String.valueOf(h.title);

                            System.out.print(h.title + " ");
                            ok = false;
                        }

                    } else if (obj instanceof Rabbit) {
                        Rabbit r = (Rabbit) obj;
                        if (r.x == i && r.y == j) {
                            if (map.get(entry.getKey() + 25) == null) {
                                this.map1[i][j] = String.valueOf(r.title);

                                System.out.print(r.title + " ");
                                ok = false;
                            }
                        }
                    } else if (obj instanceof Fox) {
                        Fox f = (Fox) obj;
                        if ((f.xhead == i && f.yhead == j) || (f.xtail == i && f.ytail == j)) {
                            this.map1[i][j] = String.valueOf(f.title);

                            System.out.print(f.title + " ");
                            ok = false;
                        }
                    } else if (obj instanceof Mushroom) {
                        Mushroom m = (Mushroom) obj;
                        if (m.x == i && m.y == j) {
                            this.map1[i][j] = String.valueOf(m.title);

                            System.out.print(m.title + " ");
                            ok = false;
                        }
                    }
                    if (!ok) {
                        break;
                    }
                }
                if (ok) {
                    this.map1[i][j] = "*";
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    public void possible_solutions_NotWorking() {
        for (Map.Entry<Integer, Object> entry : this.map.entrySet()) {
            Object obj = entry.getValue();
            if (obj instanceof Rabbit) {
                Rabbit ra = (Rabbit) obj;
                for (Map.Entry<Integer, Object> entry2 : this.map.entrySet()) {
                    Object obj2 = entry2.getValue();
                    if (obj2 instanceof Rabbit) {
                        Rabbit r = (Rabbit) obj2;
                        if (ra.x == r.x - 1 && ra.y == r.y && r.y < 5 /*entry2.getKey() < r.x * 5 */) {

                        } else if (ra.x == r.x + 1 && ra.y == r.y && r.y > 1) {

                        } else if (ra.y == r.y - 1 && ra.x == r.x && r.x < 5) {

                        } else if (ra.y == r.y + 1 && ra.x == r.x && r.x > 1) {

                        }
                    } else if (obj2 instanceof Mushroom) {
                        Mushroom m = (Mushroom) obj2;
                        if (ra.x == m.x - 1 && ra.y == m.y && m.y < 5 /*entry2.getKey() < r.x * 5 */) {

                        } else if (ra.x == m.x + 1 && ra.y == m.y && m.y > 1) {

                        } else if (ra.y == m.y - 1 && ra.x == m.x && m.x < 5) {

                        } else if (ra.y == m.y + 1 && ra.x == m.x && m.x > 1) {

                        }
                    } else if (obj2 instanceof Fox) {
                        Fox f = (Fox) obj2;

                    }

                }
            } else if (obj instanceof Fox) {

            }
        }
    }


    public void print_array() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(this.map1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findPossibleMoves() {
        System.out.println("\nPOSSIBLE MOVES :");


        findRabbitMovesSimple();


        findFoxMovesSimple();
    }

    private void findFoxMovesSimple() {
        System.out.println("FOX MOVES:");
        for (Map.Entry<Integer, Object> entry : this.map.entrySet()) {
            Object obj = entry.getValue();
            if (obj instanceof Fox) {
                Fox fox = (Fox) obj;
                int xhead = fox.xhead;
                int yhead = fox.yhead;
                int xtail = fox.xtail;
                int ytail = fox.ytail;
                boolean isVertical = fox.isVertical;
                System.out.println("Checking fox at (" + xhead + "," + yhead + ")");
                checkDirectionFoxOneStep(xhead , yhead ,xtail , ytail , isVertical);

//                if (isVertical) {
//                    checkDirectionFox(xhead, yhead, xtail, ytail, -1, 0, "UP", fox.isVertical);
//                    checkDirectionFox(xhead, yhead, xtail, ytail, 1, 0, "DOWN", fox.isVertical);
//                } else {
//                    checkDirectionFox(xhead, yhead, xtail, ytail, 0, -1, "LEFT", fox.isVertical);
//                    checkDirectionFox(xhead, yhead, xtail, ytail, 0, 1, "RIGHT", fox.isVertical);
//                }
            }
        }
    }
    private void checkDirectionFoxOneStep(int xhead , int yhead , int xtail , int ytail ,  boolean isvertical){
        if(isvertical){
            int newxhead = xhead+1 , newxtail = xtail+1 ;
            if(isValidPositionFox(newxhead , yhead , newxtail , ytail , isvertical) && map1[newxhead][yhead] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " +
                        " objects to empty cell (" + newxhead + "," + yhead + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = newxhead;
                solution[i][3] = yhead;
                i++;
            }
            newxtail = xtail-1 ;
            newxhead = xhead-1;
            if(isValidPositionFox(newxhead , yhead , newxtail , ytail , isvertical) && map1[newxtail][ytail] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " +
                        " objects to empty cell (" + newxtail + "," + ytail + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = newxhead;
                solution[i][3] = yhead;
                i++;
            }
        }else{
            int newyhead = yhead+1 , newytail = ytail+1;
            if(isValidPositionFox(xhead , newyhead , xtail , newytail , isvertical) && map1[xhead][newyhead] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " +
                        " objects to empty cell (" + xhead + "," + newyhead + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = xhead;
                solution[i][3] = newyhead;
                i++;
            }
            newyhead = yhead-1;
            newytail = ytail-1;
            if(isValidPositionFox(xhead , newyhead , xtail , newytail , isvertical) && map1[xtail][newytail] == "*"){
                System.out.println(i + " -" + "CAN MOVE TO " +
                        " objects to empty cell (" + xtail + "," + newytail + ")");
                solution[i][0] = xhead;
                solution[i][1] = yhead;
                solution[i][2] = xhead;
                solution[i][3] = newyhead;
                i++;
            }
        }
    }

    private void checkDirectionFox(int xhead, int yhead, int xtail, int ytail, int dx, int dy, String directionName, boolean isvertical) {
        int xnewhead = xhead + dx, xnewtail = xtail + dx;
        int ynewhead = yhead + dy, ynewtail = ytail + dy;
        int MoveCount = 0;
        boolean isEmpty = false;
        int j = 0;
//        System.out.println("  Checking " + directionName + " direction...");
        while (isValidPositionFox(xnewhead, ynewhead, xnewtail, ynewtail, isvertical)) {
//            System.out.println(directionName +"Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            String cell;
            if (directionName == "UP" || directionName == "RIGHT") {
                cell = map1[xnewhead][ynewhead];
//                System.out.println("    Looking at (" + xnewhead + "," + ynewhead + ") = '" + cell + "'");

            } else {
                cell = map1[xnewtail][ynewtail];
//                System.out.println("    Looking at (" + xnewtail + "," + ynewtail + ") = '" + cell + "'");

            }
            if ("*".equals(cell)) {
                MoveCount++;
                if (directionName == "UP" || directionName == "RIGHT") {
                    System.out.println(i + " -" + "CAN MOVE TO " + MoveCount +
                            " objects to empty cell (" + xnewhead + "," + ynewhead + ")");
                } else {
                    System.out.println(i + " -" + " CAN MOVE TO " + MoveCount +
                            " objects to empty cell (" + xnewtail + "," + ynewtail + ")");
                }
                solution[i][j] = xhead;
                j++;
                solution[i][j] = yhead;
                j++;
                solution[i][j] = xnewhead;
                j++;
                solution[i][j] = ynewhead;
                i++;
                j = 0;
                int nextXhead = xnewhead + dx, nextXtail = xnewtail + dx;
                int nextYhead = ynewhead + dy, nextYtail = ynewtail + dy;
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
        i = 0;

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
                    checkDirection(x, y, -1, 0, "UP");
                    checkDirection(x, y, 1, 0, "DOWN");
                    checkDirection(x, y, 0, -1, "LEFT");
                    checkDirection(x, y, 0, 1, "RIGHT");
                } else {
                    System.out.println("Checking rabbit at (" + x + "," + y + ")");

                    checkDirection(x, y, -1, 0, "UP");
                    checkDirection(x, y, 1, 0, "DOWN");
                    checkDirection(x, y, 0, -1, "LEFT");
                    checkDirection(x, y, 0, 1, "RIGHT");
                }
            }
        }
    }


    private void checkDirection(int startX, int startY, int dx, int dy, String directionName) {
        int x = startX + dx;
        int y = startY + dy;
        int jumpCount = 0;
        boolean foundObject = false;
        int j = 0;


//        System.out.println("  Checking " + directionName + " direction...");

        while (isValidPosition(x, y)) {
            String cell = map1[x][y];
//            System.out.println("    Looking at (" + x + "," + y + ") = '" + cell + "'");


            if ("*".equals(cell)) {
                if (foundObject) {
                    System.out.println(i + " -" + " CAN JUMP over " + jumpCount +
                            " objects to empty cell (" + x + "," + y + ")");
                    solution[i][j] = startX;
                    j++;
                    solution[i][j] = startY;
                    j++;
                    solution[i][j] = x;
                    j++;
                    solution[i][j] = y;
                    i++;
                    j = 0;

                } else {
//                    System.out.println("    ✗ Cannot jump over empty cell");
                }
                break;
            } else if ("h".equals(cell)) {
                if (foundObject) {
                    System.out.println(i + " -" + " CAN JUMP to hole (" + x + "," + y + ")");
                    solution[i][j] = startX;
                    j++;
                    solution[i][j] = startY;
                    j++;
                    solution[i][j] = x;
                    j++;
                    solution[i][j] = y;
                    i++;
                    j = 0;

                } else {
//                    System.out.println("    ✗ Cannot jump over hole");
                }
                break;
            } else if ("m".equals(cell) || "f".equals(cell) || "r".equals(cell) || "hr".equals(cell)) {
                foundObject = true;
                jumpCount++;
//                System.out.println("    Found object '" + cell + "' - jump count: " + jumpCount);


                int nextX = x + dx;
                int nextY = y + dy;

                if (isValidPosition(nextX, nextY)) {
//                    String nextCell = map1[nextX][nextY];

//                    if ("*".equals(nextCell)) {
//                        System.out.println(i + " -" + "    ✓ CAN JUMP over " + jumpCount +
//                                " objects to empty cell (" + nextX + "," + nextY + ")");
//                    } else if ("h".equals(nextCell)) {
//                        System.out.println(i + " -" + "    ✓ CAN JUMP over " + jumpCount +
//                                " objects to hole (" + nextX + "," + nextY + ")");
//                    }

                }


                x = nextX;
                y = nextY;
            }

//            else if ("hr".equals(cell)) {
//                foundObject = true;
//                jumpCount++;
//                System.out.println("    Found rabbit in hole - jump count: " + jumpCount);
//
//
//                int nextX = x + dx;
//                int nextY = y + dy;
//
//                if (isValidPosition(nextX, nextY)) {
//                    String nextCell = map1[nextX][nextY];
//
//                    if ("*".equals(nextCell)) {
//                        System.out.println(i + " -" + "    ✓ CAN JUMP over " + jumpCount +
//                                " objects to empty cell (" + nextX + "," + nextY + ")");
//                        solution[i][j] = startX;
//                        j++;
//                        solution[i][j] = startY;
//                        j++;
//                        solution[i][j] = x;
//                        j++;
//                        solution[i][j] = y;
//                        i++;
//                        j=0;
//                    } else if ("h".equals(nextCell)) {
//                        System.out.println(i + " -" + "    ✓ CAN JUMP over " + jumpCount +
//                                " objects to hole (" + nextX + "," + nextY + ")");
//                        solution[i][j] = startX;
//                        j++;
//                        solution[i][j] = startY;
//                        j++;
//                        solution[i][j] = x;
//                        j++;
//                        solution[i][j] = y;
//                        i++;
//                        j=0;
//                    }
//                }
//
//
//                x = nextX;
//                y = nextY;
//            }

            else {
                System.out.println("    ✗ Unknown cell type '" + cell + "' - stopping");
                break;
            }
        }
    }

    private boolean isValidPosition(int x, int y) {
        return x >= 1 && x <= 5 && y >= 1 && y <= 5;
    }

    private boolean isValidPositionFox(int xhead, int yhead, int xtail, int ytail, boolean isvertical) {
        if (isvertical) {
            return xhead >= 1 && xhead < 5 && yhead >= 1 && yhead <= 5 && xtail > 1 && ytail <= 5;
        }
        return xhead >= 1 && xhead <= 5 && yhead > 1 && yhead <= 5 && xtail >= 1 && xtail <= 5 && ytail >= 1 && ytail < 5;
    }

    public void print_solution() {
        boolean ok = false;
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (solution[i][j] == 0) {
                    ok = true;
                    break;
                }
                System.out.print(solution[i][j] + " ");
            }
            if (ok) {
                break;
            }

//            System.out.print(" - " + i );
            System.out.println();
        }
    }

    public void confirm_move(int x) {
        int xold = solution[x][0], yold = solution[x][1], xnew = solution[x][2], ynew = solution[x][3];
        int keymap = (xold * 5) - 5 + yold;
        Object obj = map.get(keymap);
        if (obj instanceof Rabbit) {
            Rabbit r = (Rabbit) obj;
            r.x = xnew;
            r.y = ynew;
            Rabbit r1 = (Rabbit) map.remove(keymap);
            int newkey = (xnew * 5) - 5 + ynew;
            int hole_newkey = newkey;
            if (map.get(hole_newkey) != null) {
//                System.out.println("//////////////////////////////////////////////////////////////////////////");
                Object obj2 = map.get(hole_newkey);
                if (obj2 instanceof Hole) {
                    Hole h1 = (Hole) map.remove(hole_newkey);
                    map.put((h1.x * 5) - 5 + h1.y + 25, h1);
                }
            }
            map.put(newkey, r1);
            keymap += 25;
        }
        if (map.get(keymap) != null) {
            Object obj2 = map.get(keymap);
            if (obj2 instanceof Hole) {
                Hole h1 = (Hole) map.remove(keymap);
                map.put((h1.x * 5) - 5 + h1.y, h1);
            }
        }
        if (obj instanceof Fox) {
            Fox f = (Fox) obj;
            f.xhead = xnew;
            f.yhead = ynew;
            if (f.isVertical) {
                f.xtail = xnew + 1;
                f.ytail = ynew;
            } else {
                f.xtail = xnew;
                f.ytail = ynew - 1;
            }
            Fox f1 = (Fox) map.remove(keymap);
            int newkey = (xnew * 5) - 5 + ynew;
            map.put(newkey, f1);
            System.out.println(map);
        }
//        Node n = new Node();
//        n.map = this.map_deep_copy();
//        n.array_map = this.array_deep_copy();

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < 4; j++) {
                solution[i][j] = 0;
            }
        }
    }

    public boolean check_if_win() {
        boolean ok = false;
        int rabbit_number = 0, hole_number = 0;
        for (Map.Entry<Integer, Object> entry : this.map.entrySet()) {
            Object obj = entry.getValue();
            if (obj instanceof Rabbit) {
                rabbit_number++;
                Rabbit r = (Rabbit) obj;
                int hole_key = (r.x * 5) - 5 + r.y + 25;
                if (map.get(hole_key) != null) {
                    hole_number++;
                    ok = true;
                } else {
                    ok = false;
                }
            }
        }
        if (rabbit_number == hole_number) {
            return true;
        }
        return false;
    }

    public void start() {
        Scanner cin = new Scanner(System.in);
        GamePlay g = new GamePlay(1);
        Node current = null;
        Node root =new Node();

        System.out.println("WELCOME TO JUMPIN");
        System.out.print("choose the level (1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9): ");
        int level = cin.nextInt();


        switch (level) {
            case 1: g.set_the_map_level1(); break;
            case 2: g.set_the_map_level2(); break;
            case 3: g.set_the_map_level3(); break;
            case 4: g.set_the_map_level4(); break;
            case 5: g.set_the_map_level5(); break;
            case 6: g.set_the_map_level6(); break;
            case 7: g.set_the_map_level7(); break;
            case 8: g.set_the_map_level8(); break;
            case 9: g.set_the_map_level9(); break;
            default: break;
        }

        int i = 0;
        root.cost = i ;
        root.map = g.map_deep_copy(g.map);
        root.array_map = g.array_deep_copy();
        root.sync_array_to_map();
        current = root;
        root.create_level();
        List<Node> nextStates = get_next_states(root);
//        for(int f=0 ; f<nextStates.size() ; f++){
//            System.out.println(nextStates.get(f).map);
//        }
        System.out.print("choose the move : ");
        int x = cin.nextInt();
//        while (x>i){
//            System.out.println("Out of range");
//            System.out.print("choose the move : ");
//            x = cin.nextInt();
////            nextStates.get(x);
//        }
        nextStates.get(x);
        while (!nextStates.get(x).check_if_win()) {
//            Node new_node = nextStates.get(x);
//            new_node.map = nextStates.get(x).map_deep_copy(nextStates.get(x).map);
//            new_node.array_map = nextStates.get(x).array_deep_copy();
//            new_node.sync_array_to_map();
//            new_node.create_level();
            nextStates.get(x).sync_array_to_map();
            nextStates.get(x).create_level();
//            nextStates = get_next_states(new_node);
            System.out.println(nextStates.get(x).map);
            nextStates = get_next_states(nextStates.get(x));

//            for(int f=0 ; f<nextStates.size() ; f++){
//                System.out.println(nextStates.get(f).map);
//            }
            System.out.print("choose the move : ");
            x=cin.nextInt();
            if(x>i){
                System.out.println("out of range");
            }
            nextStates.get(x);


                // Get all possible next states
//            nextStates = get_next_states(current);
//
//            // Display possible moves
//            System.out.println("Possible moves:");
//            for (int moveIndex = 0; moveIndex < nextStates.size(); moveIndex++) {
//                System.out.println("Move " + (moveIndex ) + ": " +
//                        current.solution[moveIndex][0] + "," + current.solution[moveIndex][1] + " -> " +
//                        current.solution[moveIndex][2] + "," + current.solution[moveIndex][3]);
//            }
//
//            System.out.print("choose the move (0-" + (nextStates.size()-1) + "): ");
//            int x = cin.nextInt() ;
//
//            if (x >= 0 && x < nextStates.size()) {
//                // Use the selected next state
//                current = nextStates.get(x);
//
//                // Synchronize the state
//                current.sync_array_to_map();
////                    current.findPossibleMoves(); // Prepare for next move
//
//                System.out.println("New state:");
//                current.create_level();
//            } else {
//                System.out.println("Invalid move selection!");
//                continue; // Don't increment i
//            }
//
//
//            i++;
//
//            // Check win condition on current node
//            if (current.check_if_win()) {
//                break;
//            }
        }

        System.out.println("------------------ WIN! ------------------");
//        current.create_level();
        print_nodes(nextStates.get(x));
    }

    public void start_with_state() {

        Scanner cin = new Scanner(System.in);
        GamePlay g = new GamePlay(1);
        Node current = null;
        Node root = null;
        System.out.println("WELCOME TO JUMPIN");
        System.out.print("choose the level (1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9): ");
        int level = cin.nextInt();
        switch (level) {
            case 1:
                g.set_the_map_level1();
                break;
            case 2:
                g.set_the_map_level2();
                break;
            case 3:
                g.set_the_map_level3();
                break;
            case 4:
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
            case 8:
                g.set_the_map_level8();
                break;
            case 9:
                g.set_the_map_level9();
                break;
            default:
                break;
        }
        int i = 0;
        while (!g.check_if_win()) {
            Node new_node = new Node();
            if (i == 0) {
//                g.create_level();
                new_node.parent_node = null;
                root = new_node;
                root.cost = i + 1;
                root.map = g.map_deep_copy(g.map);
                root.array_map = g.array_deep_copy();
                root.sync_array_to_map();
//                new_node = root;
                current = root;
            } else {

                current.create_level();
//                current.sync_array_to_map();
//                current.print_array();
                new_node.parent_node = current;
                new_node.cost = i + 1;
                new_node.map = current.map_deep_copy(current.map);
                new_node.array_map = current.array_deep_copy();
//                System.out.println(new_node.parent_node.map);
                System.out.println(new_node.map);

                current = new_node;
                current.findPossibleMoves();
                get_next_states(current);

                System.out.print("choose the move : ");
                int x = cin.nextInt();
                current.confirm_move(x);
            }
//            new_node.map = current.map;
            i++;
            if (current.check_if_win()) {
                break;
            }

        }
//            System.out.println(g.map);
        current.create_level();
        System.out.println("------------------ WIN! ------------------");
//        root.print_array();
//        System.out.println(root.map);
        print_nodes(current);
    }

    public static void print_nodes(Node end) {
        List<Node> list = new ArrayList<>();
        Node current = end;
        while (current != null) {
            list.add(current);
            current = current.parent_node;
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print_array();
            System.out.println(list.get(i).map);
        }
    }

    public Map map_deep_copy(Map<Integer, Object> original) {
        Map<Integer, Object> copy = new HashMap<>();
        for (Map.Entry<Integer, Object> entry : original.entrySet()) {
            copy.put(entry.getKey(), entry.getValue());
        }
        return copy;
    }

    public String[][] array_deep_copy() {
        String arr[][] = new String[6][6];
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = this.map1[i][j];
            }
        }
        return arr;
    }

    public List get_next_states(Node node){
        List<Node> next_status = new ArrayList<>();
        node.findPossibleMoves();
        for(int j=0 ; j<node.solution.length ; j++) {

            if(node.solution[j][0] == 0){
                break;
            }
            Node newState = new Node();
            newState.parent_node = node;
//            newState.cost = node.cost + 1;
            newState.map = node.map_deep_copy(node.map);
            newState.array_map = node.array_deep_copy();

            for (int k = 0; k < node.solution.length; k++) {

                if(node.solution[k][0] == 0){
                    break;
                }
                newState.solution[k][0] = node.solution[k][0];
                newState.solution[k][1] = node.solution[k][1];
                newState.solution[k][2] = node.solution[k][2];
                newState.solution[k][3] = node.solution[k][3];
            }

            newState.confirm_move(j);
            newState.action = new int[1][4];
            newState.action[0][0] = node.solution[j][0];
            newState.action[0][1] = node.solution[j][1];
            newState.action[0][2] = node.solution[j][2];
            newState.action[0][3] = node.solution[j][3];
            newState.sync_array_to_map();
//            newState.cost = node.cost+1; //todo    Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
//            newState.print_array();
            for(int h=0 ; h<newState.action.length ; h++){
                System.out.println(newState.action[h][0] + "," + newState.action[h][1] + "->" +newState.action[h][2] + "," + newState.action[h][3]  );
            }

//            System.out.println(newState.map);
            next_status.add(newState);

        }

        return next_status;
    }
}




