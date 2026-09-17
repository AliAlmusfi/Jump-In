import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
        GamePlay g = new GamePlay(1);

//        g.start();
        StartAStar();

    }
    public static void StartDFS(){
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
        root.cost = i + 1;
        root.map = g.map_deep_copy(g.map);
        root.array_map = g.array_deep_copy();
        root.sync_array_to_map();
        DFS2(root);
//        DFS2(root , new LinkedList<>());
//        current = root;
//        root.create_level();
//        List<Node> nextStates = g.get_next_states(root);

    }
    public static void DFS2(Node root ){
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();


        stack.add(root);
        visited.add(root);
        int visited_number = 0;
        while(!stack.isEmpty()){
            GamePlay g = new GamePlay(1);
            visited_number++;
            Node n = stack.pop();
//            n.map = stack.peek().map_deep_copy(stack.peek().map);
//            n.array_map = stack.peek().array_deep_copy();
//            n.cost = stack.peek().cost;
//            n.sync_array_to_map();

//            boolean ok = true;
//            for(int j=0 ; j<visited.size() ; j++){
//                if(visited.get(j).equals(root)){
//                    ok=false;
//                }
//            }
//            if (ok){
//                visited.add(root);
//            }
//            else{
//                continue;
//            }

            n.print_array();
            System.out.println(n.cost);

            if(n.check_if_win()){
                System.out.println("------------------ WIN! ------------------");
//                n.print_array();
                n.print_nodes(n);
                System.out.println("Visited Number : "+visited_number);
                return;
            }

            List<Node> nextStates = g.get_next_states(n);
            for(int j=0 ; j<nextStates.size() ; j++){
                nextStates.get(j).cost =n.cost + 1;
                if(!visited.contains(nextStates.get(j))) {
                    stack.add(nextStates.get(j));
                    visited.add(nextStates.get(j));
                }
            }
        }

    }

    public static int DFS(Node root , Set<Node> visited , int i){ //TODO Not working , i should increase the i by make it static or thing it will
        if(root.check_if_win()){

            System.out.println("------------------ WIN! ------------------");
            root.print_array();
            return root.cost;
        }
//        int i=0;

        if(visited.contains(root)){
            return root.cost;
        }
        visited.add(root);
        GamePlay g = new GamePlay(1);
        root.create_level();
        List<Node> nextStates = g.get_next_states(root);
        System.out.println(root.cost);
        if(nextStates.isEmpty()){
            return 0;
        }
        i++;
        DFS(nextStates.get(i) , visited , i);

        return 0;
    } // Not Working (Recursion 🤮)
    public static void StartBFS(){
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
        BFS(root);
//        current = root;
//        root.create_level();
//        List<Node> nextStates = g.get_next_states(root);

    }
    public static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

//        int i=1;
        queue.add(root);
        visited.add(root);
        int visited_number = 0;
        while(!queue.isEmpty()){
            visited_number++;
//            System.out.println('1');
//            try{Thread.sleep(200);}catch(Exception e){e.printStackTrace();}

            GamePlay g = new GamePlay(1);

            Node n = queue.poll();
//            n.map = queue.peek().map_deep_copy(queue.peek().map);
//            n.array_map = queue.peek().array_deep_copy();
//            n.cost = queue.peek().cost;
//            n.sync_array_to_map();




            n.print_array();
            System.out.println(n.cost);
            if(n.check_if_win()){
                System.out.println("------------------ WIN! ------------------");
//                n.print_array();
                n.print_nodes(n);
                System.out.println("Visited Number : "+visited_number);
                return;
            }


//            if(visited.contains(n)) {
//                continue;
//            }
//            visited.add(n);

            List<Node> nextStates = g.get_next_states(n);
            for(int j=0 ; j<nextStates.size() ; j++){
//                if(!visited.contains(nextStates.get(j))) {
//                    visited.add(nextStates.get(j));    // Mark as visited
//                    queue.add(nextStates.get(j));      // Add to queue
//                }
//                queue.add(nextStates.get(j));

                nextStates.get(j).cost =n.cost + 1;
                if(!visited.contains(nextStates.get(j))) {
                    queue.add(nextStates.get(j));
                    visited.add(nextStates.get(j));
                }
            }


        }
//        System.out.println(visited);

    }


    public static void StartUCS(){
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
        UCS(root);
//        current = root;
//        root.create_level();
//        List<Node> nextStates = g.get_next_states(root);

    }


    public static void UCS(Node root){
        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
        Set<Node> visited = new HashSet<>();

        queue.add(root);
//        visited.add(root);
        GamePlay g = new GamePlay(1);
        int visited_number = 0;
        while (!queue.isEmpty()){
            Node n = queue.poll();
            if(visited.contains(n)){
                continue;
            }
//            System.out.println("Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            visited.add(n);
            visited_number++;
            n.print_array();
            System.out.println(n.cost);
            if(n.check_if_win()){
                System.out.println("------------------ WIN! ------------------");
//                n.print_array();
                n.print_nodes(n);
                System.out.println("Visited Number : "+visited_number);

                return;
            }

            List<Node> nextStates = g.get_next_states(n);
            for(int j=0 ; j<nextStates.size() ; j++){
                nextStates.get(j).cost =n.cost + 1;
                if (queue.contains(nextStates.get(j)) && Find_Node_In_Queue(queue, nextStates.get(j)).cost > nextStates.get(j).cost) {
                    queue.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
                    queue.add(nextStates.get(j));
                    visited.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
                    visited.add(nextStates.get(j));
                }else {
                    queue.add(nextStates.get(j));
                }
//                visited.add(nextStates.get(j));
//                if(!visited.contains(nextStates.get(j))) {
//                    queue.add(nextStates.get(j));
//                    visited.add(nextStates.get(j));
//
//                    if (queue.contains(nextStates.get(j)) && Find_Node_In_Queue(queue, nextStates.get(j)).cost > nextStates.get(j).cost) {
//                        queue.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
//                        queue.add(nextStates.get(j));
//                    }
//                }
//                else if (visited.contains(nextStates.get(j)) && Find_Node_In_Set(visited, nextStates.get(j)).cost > nextStates.get(j).cost) {
//                    visited.remove(Find_Node_In_Set(visited, nextStates.get(j)));
//                    visited.add(nextStates.get(j));
//                }

            }

        }

    }

    public static void StartAStar(){
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
        root.A_cost = i;
        root.map = g.map_deep_copy(g.map);
        root.array_map = g.array_deep_copy();
        root.sync_array_to_map();
        AStar(root);
    }

    public static void AStar(Node root){
        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
        Set<Node> visited = new HashSet<>();

        queue.add(root);
//        visited.add(root);
        GamePlay g = new GamePlay(1);
        int visited_number = 0;
        while (!queue.isEmpty()){

            Node n = queue.poll();
            if(visited.contains(n)){
                continue;
            }
//            System.out.println("Aliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            visited.add(n);
            visited_number++;

            n.print_array();
//            System.out.println(n.cost);
//            System.out.println("Heuristic : " + heuristic(n));
            if(n.check_if_win()){
                System.out.println("------------------ WIN! ------------------");
//                n.print_array();
                n.print_nodes(n);
                System.out.println("Visited Number : "+visited_number);
                return;
            }


            List<Node> nextStates = g.get_next_states(n);
            System.out.println("Parent : ");
            n.print_array();
            System.out.println(n.A_cost);

            for(int j=0 ; j<nextStates.size() ; j++){
                nextStates.get(j).A_cost = n.A_cost +1;
                nextStates.get(j).cost = n.A_cost + 1 + heuristic(nextStates.get(j));

                System.out.println("Child : ");
                nextStates.get(j).print_array();
                System.out.println(nextStates.get(j).A_cost);
                System.out.println("Heuristic : " + heuristic(nextStates.get(j)));

//                if(!visited.contains(nextStates.get(j))) {
//                    queue.add(nextStates.get(j));
//                    visited.add(nextStates.get(j));
//
//                    if (queue.contains(nextStates.get(j)) && Find_Node_In_Queue(queue, nextStates.get(j)).cost > nextStates.get(j).cost) {
//                        queue.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
//                        queue.add(nextStates.get(j));
//                    }
//                }
//                else if (queue.contains(nextStates.get(j)) && Find_Node_In_Queue(queue, nextStates.get(j)).cost > nextStates.get(j).cost) {
//                    queue.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
//                    queue.add(nextStates.get(j));
//                    visited.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
//                    visited.add(nextStates.get(j));
//                }
                if (queue.contains(nextStates.get(j)) && Find_Node_In_Queue(queue, nextStates.get(j)).cost > nextStates.get(j).cost) {
                    queue.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
                    queue.add(nextStates.get(j));
                    visited.remove(Find_Node_In_Queue(queue, nextStates.get(j)));
                    visited.add(nextStates.get(j));
                }else {
                    queue.add(nextStates.get(j));
                }
            }


        }
    }
    public static int heuristic(Node node){
        int total = 0;
        List <Rabbit> rabbits = new ArrayList<>();
        List <Hole> holes = new ArrayList<>();

        for(int i=1 ; i<6 ; i++){
            for(int j=1 ; j<6 ; j++){
                if(node.array_map[i][j].equals("r")){
                    rabbits.add(new Rabbit(i,j));
                } else if (node.array_map[i][j].equals("h")) {
                    holes.add(new Hole(i,j));
                }
            }
        }
        for (Rabbit rabbit : rabbits) {
            int min_dis = Integer.MAX_VALUE;
            for(Hole hole : holes){
                int dis = Math.abs(rabbit.x - hole.x) + Math.abs(rabbit.y - hole.y);
//                if(!(rabbit.x == hole.x+1)||(rabbit.x == hole.x-1)){
//                    if(!(rabbit.y == hole.y+1)||(rabbit.y == hole.y-1)){
                        min_dis = Math.min(dis , min_dis);
//                    }
//                }
            }
            total += min_dis;
        }
        return total;
    }

    static class NodeComparator implements Comparator<Node> {

        @Override
        public int compare(Node n1, Node n2) {
//            return n1.cost - n2.cost;
            return Integer.compare(n1.cost,n2.cost);
        }
    }

//    public static Node Find_Node_In_Set(Set <Node> set , Node node){
//        for (Node n : set){
//            if(n.equals(node)){
//                return n;
//            }
//        }
//        return null;
//    }
    public static Node Find_Node_In_Queue(PriorityQueue<Node> queue , Node node){
        for (Node n : queue){
            if(n.equals(node)){
                return n;
            }
        }
        return null;
    }

}