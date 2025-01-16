public class fun33 {


    public static void piramide (int num, char car){

        for (int i=0; i<num; i++){

            for (int j=0; j<num; j++){
                System.out.print(" ");
            }

            for (int j=0; j<num; j++){
                System.out.print(car);
            }
        }

    }



    public static void main(String[] args) {
        int n = 5;
        char c = 'a';

        piramide(n, c);
    }
}
