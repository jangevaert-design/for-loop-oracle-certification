package edu.cnm.deepdive;

public class ForLoop {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
// in case you want to access your local variable out of the for loop, just initialize it before
// the for loop.

    int a;
    for (a = 0; a < 10; a++) {
      System.out.print("\na = " + a);
    }
    System.out.println("\nafter the for loop a = " + a);// in line 6 i is not reachable outside the curly braces of the
                                // for loop. by declaring it first on line 12, we can access a
                                // outside of the for loop on line 16.

//    for (;;) { // this is an infinite for loop
//      System.out.println("Hello");
//    }

    int x = 0;
    for(int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
      System.out.println("y = " + y);
    }
    System.out.println("x = " + x); // this prints multiple y values because the print statement for
                                    // y is inside the for loop. However y will stop at y = 4 bacause
                                    // of the boolean expression x < 5.
                                    // Outside of the for loop x will print as 5 because x still got
                                    // incremented.

//    int d = 10;
//    for (int e = 0, d = 0; e < 10 || d < 10; e++, d--) {
//      does not compile because d has already been initialized outside of the for loop.
//    }

//    for (long z = 0, int d = 0; z < 10; z++, d++) {
//    does not compile because different types long and int.
//    }
  }
}
