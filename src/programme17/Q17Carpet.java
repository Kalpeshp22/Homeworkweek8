package programme17;

public class Q17Carpet {

    double cost;

    public Q17Carpet(double cost) {
        if (cost < 0) this.cost = 0;
       this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

}

