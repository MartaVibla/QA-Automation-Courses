public class homework3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        System.out.println (a + b);

        // - If, If - Else, If - else - else if, с логическими операторами || и &&
        //    - Switch
        //    - Ternary operator ?:

        //IF
        boolean bool = a==b;
        boolean bool2 = a !=b;
        boolean bool3 = a < b;
        boolean bool4 = a > b;
        boolean bool5 = a <= b;
        boolean bool6 = a >= b;

        boolean bool7 = (2 > 5) || (4 < 6);
        boolean bool8 = (2 > 5) && (4 < 6);

        System.out.println(bool7);
        System.out.println(bool8);

        if(a != b && a > b){
            System.out.println("Hello World");
        }

        if(a==b && a > b){
            System.out.println("Hello World");
        } else {
            System.out.println("Hello World else");
        }

        if(a==5){
            System.out.println("Hello World + a");
        } else if (a==6) {
            System.out.println("Hello World + a");
        } else if (a==10) {
            System.out.println("Hello World + a");
        }


        switch(a){
            case 10:
                System.out.println("First case");
                a++;
                break;
            case 11:
                System.out.println("Second case");
                break;
            case 15:
                System.out.println("Third case");
                break;
        }
int z = a > b ? 10 : 5;




        }








}
