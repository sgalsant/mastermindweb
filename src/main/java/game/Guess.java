package game;

public class Guess {
    private final Code code;

    private final int exactMatches;
    private final int nearMatches;

    public Guess(Code code, int exactMatches, int nearMatches) {
        this.code = code;
        this.exactMatches = exactMatches;
        this.nearMatches = nearMatches;
    }

    public int getCode(int idx) {
        return this.code.getCode()[idx];
    }

    public int getExactMatches() {
        return exactMatches;
    }

    public int getNearMatches() {
        return nearMatches;
    }
}
