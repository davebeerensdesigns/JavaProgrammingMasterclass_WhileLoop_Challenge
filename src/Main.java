public class Main {
    public static void main(String[] args) {
        int i = 5;
        int odd = 0;
        int even = 0;
        while (i <= 20){
            if(even == 5){
                break;
            }
            if(isEvenNumber(i)){
                System.out.println(i);
                even += 1;
            } else {
                odd += 1;
            }
            i++;
        }
        System.out.println("total odds = " + odd);
        System.out.println("total evens = " + even);
    }
    public static boolean isEvenNumber(int number){
        return (number % 2 == 0);
    }


}