package programme17;
import programme17.Q17Floor;
import programme17.Q17Carpet;

public class Q17Calculator {

    Q17Carpet carpet;
    Q17Floor floor;

    public Q17Calculator(Q17Floor floor, Q17Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}

