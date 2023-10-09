public class Leaszorzo {
    public static void main(String[] args) {
        int szorzo=0;
        for (int i = 100; i <1000 ; i++) {
            int a = (i / 10)%10;
            int b =i /100;
            int c = i % 10;
            if (a== b*c || b==a*c || c==a*b){
                System.out.println(i);
                szorzo++;
            }

        }
        System.out.println(szorzo+" ennyi darab");




    }
}
