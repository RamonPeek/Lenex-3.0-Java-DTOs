package nl.ramonpeek.models;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public abstract class Ranking {
    private int order;
    private int place;
    private Result result;

    public Ranking() {
    }

    public Ranking(int order, int place, Result result) {
        this.order = order;
        this.place = place;
        this.result = result;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
