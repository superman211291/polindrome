public class Main {
    public static void main(String[] args) {
        checkPolinrom("Топот");
        checkPolinrom("Вселенная");
        checkPolinrom("Казак");

    }

    private  static  void checkPolinrom(String s){
        String str = s.toLowerCase();
        int maxI = s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if (str.charAt(i) != str.charAt(maxI)){
                System.out.println("Слово - " + s + " не является полиндромом!");
                return;
            }
            maxI--;
        }
        System.out.println("Слово - " + s + " является полиндромом!");
    }



}