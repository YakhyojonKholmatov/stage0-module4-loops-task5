package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){



        for (int i = 0; i < height; i++) {

            for (int j = 0; j < length; j++) {
                if(i==0){
                    System.out.print("8");

                }else if(i==height-1){
                    if(j==0){
                        System.out.println();
                    }
                    System.out.print("8");

                }

                else {
                    System.out.println();
                    System.out.print("8");
                    for (int k = 0; k < length - 2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("8");
                    // System.out.println();
                    break;
                }







            }



        }






    }
}
//
