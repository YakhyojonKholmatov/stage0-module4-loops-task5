package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {


        for (int i = 0; i < sideLength; i++) {


            for (int j = 0; j < sideLength; j++) {
                System.out.print(" ");
                if((sideLength/2)+2==j){
                    System.out.print("8");
                }else if(sideLength/2==i){
                    System.out.print("8");

                }


            }
            System.out.println();




        }




    }
}
//
