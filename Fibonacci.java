package gencho;

import java.math.BigInteger;
import java.util.ArrayList;


public class Fibonacci {
    private BigInteger fNumber;
    private BigInteger fPos;
    private static ArrayList<BigInteger> answers = new ArrayList<>();

    public Fibonacci(BigInteger fPos) {
        this.fPos = fPos;
    }

    private BigInteger fibonacciAlgorithm(){

        if(answers.size()>=fPos.intValue()){
            return answers.get(fPos.intValue());
        }
        if(answers.size() == 0) {
            answers.add(BigInteger.ZERO);
            answers.add(BigInteger.ONE);
        }
        int index;

        for(index = answers.size(); index <= fPos.intValue(); ++index){
            answers.add(answers.get(index-1).add(answers.get(index-2)));
        }

        return answers.get(index-1);
    }

    public void value() {
        this.fNumber = fibonacciAlgorithm();
    }


    public BigInteger getN(){return this.fPos;}

    @Override
    public String toString() {
        if(answers.size()>= fPos.intValue()) {
            fNumber = answers.get(fPos.intValue());
        }
        return "Fibonacci{" +
                "n=" + fPos +
                ", value=" + fNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fibonacci fibonacci = (Fibonacci) o;
        return fPos == fibonacci.fPos;
    }

}
