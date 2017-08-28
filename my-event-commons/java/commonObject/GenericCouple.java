package commonObject;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public class GenericCouple<A,B> {
    private A first;
    private B second;

    public GenericCouple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
