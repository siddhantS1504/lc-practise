QUESTION LINK:https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true



public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    Integer ap = 0;
        Integer o = 0;
        for(int i = 0; i < apples.size(); i ++) {
            if((apples.get(i) + a >= s) && (t >= apples.get(i) + a)) {
                ap++;
            }
        }
        for(int i = 0; i < oranges.size(); i ++) {
            if((oranges.get(i) + b >= s) && (t >= oranges.get(i) + b)) {
                o++;
            }
        }
        System.out.println(ap);
        System.out.println(o);
    

    }
