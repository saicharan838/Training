public class Loopsdemo {
    public static void main(String[] args) {
       /* for(int i=2;i<=100;i=i+2){
            System.out.println(i);
        }
        */
        /*
        for(int i=1;i<=100;i=i+1){
            if(i%2==0)
                System.out.println(i);
        }w

         */
      /*  int no=5;
        for(int i=1;i<=10;i=i+1){
            System.out.println(no+"x"+i+"="+(no*i));
        }
    }
       */
        for (int i = 1; i <= 10; i++) {
            System.out.println("table of " +  i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
                System.out.println();
        }
    }
}