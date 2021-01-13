package game;

import java.util.ArrayList;

public class Game {
    private final Code codeSecret;
    private final ArrayList<Guess> guesses;
    private State state;
    private final int maxGuess;

    public Game(int length, int maxGuess) {
        this.codeSecret = FactoryCode.generate(length);
        this.guesses = new ArrayList<>();
        this.state = State.PLAYING;
        this.maxGuess = maxGuess;
    }



    public void guess(Code code) {
        if (this.state != State.PLAYING) {
            return;
        }

        Guess guess = new Guess(code, this.codeSecret.exactMatches(code), this.codeSecret.nearMatches(code));
        this.guesses.add(guess);

        if (guess.getExactMatches() == this.getLengthCode()) {
            this.state = State.WON;
        } else if (this.guesses.size() == this.maxGuess) {
            this.state = State.LOST;
        }
    }

    public State getState() {
        return this.state;
    }

    public int getGuessCount() {
        return this.guesses.size();
    }

    public int getMaxGuess() {
        return this.maxGuess;
    }

    public Guess getGuess(int idx) {
        return this.guesses.get(idx);
    }

    public Guess getLastGuess() {
        if (this.guesses.size() == 0) {
            return null;
        } else {
            return this.guesses.get(this.guesses.size()-1);
        }
    }

    public int getLastCode(int idx) {
        Guess last = this.getLastGuess();
        if (last == null) {
            return 1;
        } else {
            return last.getCode(idx);
        }
    }

    public int getLengthCode() {
        return this.codeSecret.getLength();
    }

    public Code getCodeSecret() {
        if (this.state == State.PLAYING) {
            return null;
        } else {
            return this.codeSecret;
        }
    }
}
