public class Main {
    public static void main(String[] args) {
        int startNumber = 4;
        int endNumber = 20;
        int oddCount = 0;
        int evenCount = 0;
        while (startNumber <= endNumber){
            startNumber++;
            if(!isEvenNumber(startNumber)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + startNumber);
            evenCount++;
            if(evenCount >= 5){
                break;
            }
        }
        System.out.println("total odd numbers found = " + oddCount);
        System.out.println("total even numbers found = " + evenCount);
    }
    public static boolean isEvenNumber(int number){
        return (number % 2 == 0);
    }


}