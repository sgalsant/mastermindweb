package game;


public class FactoryCode {
    public static Code generate(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random()*5+1);
        }


        return new Code(numbers);
    }
}
