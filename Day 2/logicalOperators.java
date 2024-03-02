/*
 * 
 * AND  /   &   /   &&
 * OR   /   |   /   ||
 * NOT  /   !   /   !
 * 
 */

public class logicalOperators {
    public static void main(String[] args) {
        int x1 = 7;
        int y1 = 5;
        int x2 = 5;
        int y2 = 9;

        boolean z1 = x1 > y1 && x2 > y2;
        System.out.println(z1);
        
        boolean z2 = x1 > y1 || x2 > y2;
        System.out.println(z2);
        
        System.out.println(!z2);
    }
}
