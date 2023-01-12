package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {


        int i,j,k;
        for ( i = 1; i <= height/2; i++) {

            for ( k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for ( j = i; j <=height/2; j++) {
                System.out.print("8 ");
            }
            System.out.println();

        }

        for ( i = height/2-1; i >=1; i--) {

            for ( k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for ( j = i; j <=height/2; j++) {
                System.out.print("8 ");
            }
            System.out.println();

        }





    }
}
//
