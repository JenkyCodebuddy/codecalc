package wildtornado.scocalc.strategies;

public class CommentPercentageCalculator extends BaseCalculator {

    public void generate() {
        this.result = score +  (int) Math.floor(val);
    }

}