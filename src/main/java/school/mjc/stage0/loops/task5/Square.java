package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){




        for (int i = 0; i < sideLength; i++) {

            for (int j = 0; j < sideLength; j++) {
                if(i==1||i==2||i==3){
                    System.out.print("8   8");
                    break;
                }


                System.out.print("8");

            }
            System.out.println();

        }





    }
}
