import java.util.*;

public class Drawlots {

    public static void main(String args[]) {
        Scanner fn = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = fn.nextInt();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Second Number");
        int secondNum = sn.nextInt();
        List<Integer> generatedNumbers = new ArrayList<>();

        for(int i = 0; i < firstNum; i++) {
            if (generatedNumbers.size() < firstNum) {
                int numGenerated = getRandomArbitrary(firstNum, secondNum);
                boolean idExists = generatedNumbers.stream()
                        .anyMatch(t -> t.equals(numGenerated));
                if(!idExists){
                    generatedNumbers.add(numGenerated);
                }
                Collections.sort(generatedNumbers);
            }
        }
        System.out.println(generatedNumbers);

    }
    static int getRandomArbitrary(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
