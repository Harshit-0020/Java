public class Basics{
    public static void main(String[] args) {
        // boolean inCrores = false; DECLARING BOOLEAN VARIABLES IN JAVA
        /*

        REFERENCE VS PRIMITIVE TYPES JAVA

        byte x = 2;
        byte y = x;
        x = 1;
        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // Here both point1 and point2 store the address to the same point object
        // and hence on changing value of point1.x point2.x automatically changes.
        // These reference type variables store references to objects and only point
        // to them hence called the reference types.

        //REFERENCE TYPES ARE COPIED BY REFERENCES WHILE PRIMITIVE TYPES ARE COPIED BY
        // VALUES.


         */

        /*

        STRINGS IN JAVA
        // String message = new String("Hello World!");
        // Despite being reference type variable, strings can be
        // initialized in a primitive format to avoid long typing.
        String message = new String("Hello World") + "!!";
        System.out.println(message.replace('!', '*'));
        System.out.println(message);
         */

        /*
        Arrays in Java:

        OLDER WAY
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        NEWER WAY IF WE KNOW ALL THE ITEMS BEFOREHAND

        int[] numbers = {4,2,3,7,5,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        TWO DIMENSIONAL ARRAYS IN JAVA

        int[][] numbers = new int[2][3];
        numbers[0][0] = 5;
        System.out.println(Arrays.deepToString(numbers));

        CONSTANTS IN JAVA
        final int value = 5;

        INCREMENTING IN JAVA
        int x = 1;
        int y1 = x++;   //Here x gets assigned first and then incremented
        int y2 = ++x;   //Here x gets incremented first and then assigned
        System.out.println(x);
        System.out.println(y1);
        System.out.println(y2);

        CASTING IN JAVA
        // Implicit Casting

        byte -> short -> int -> long -> float -> double

        short x = 1; //2bytes
        int y = x + 2; // 4 bytes int(2)
        System.out.println(y);

        // explicit casting
        double x = 3.7;
        double y = (int)x + 2;  // Floor on conversion of x to int
        System.out.println(y);


         */
    }
}