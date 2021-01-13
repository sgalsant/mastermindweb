package game;

import java.util.Arrays;

public class Code {
    private final int[] numbers;

    public Code(int[] code) {
        this.numbers = code.clone();
    }

    public int[] getCode() {
        return this.numbers;
    }
    public int getCode(int idx) { return this.numbers[idx]; }

    @Override
    public boolean equals(Object o) {
        return o instanceof Code &&
                Arrays.equals(this.numbers, ((Code) o).numbers);
    }

    public int exactMatches(Code code) {
        int result = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == code.numbers[i]) {
                result++;
            }
        }
        return result;
    }

    public int nearMatches(Code code) {
        int result = 0;
        int[] numbers = this.numbers.clone();
        for (int i = 0; i < this.numbers.length; i++) {
            if (numbers[i] == code.numbers[i]) {
                numbers[i] = -1;
            }
        }

        for (int i = 0; i < code.numbers.length; i++) {
            if (this.numbers[i] != -1) {
                for (int j = 0; j < numbers.length; j++) {
                    if (code.numbers[i] == numbers[j]) {
                        numbers[j] = -1;
                        result++;
                        break;
                    }
                }
            }
        }
        
        return result;
    }

    public int getLength() {
        return this.numbers.length;
    }
}
