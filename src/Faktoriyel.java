public class Faktoriyel {
    public static void main(String[] args) {


        faktoriyel(5);

    }
    public static int faktoriyel(int sayi){
        int fact=1;
        for (int i = 1; i <sayi ; i++) {
            fact*=i;
        }
        System.out.println("fact = " + fact);
        return fact;
    }
}
