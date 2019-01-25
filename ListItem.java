import java.lang.Comparable;

public abstract class ListItem implements Comparable {
    private ListItem previousItem;
    private ListItem nextItem;

    // private ListItem currentItem;

    public ListItem getPreviousItem() {
        return this.previousItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public ListItem getNextItem() {
        return this.nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public abstract String getValue();

    public int compareTo(ListItem other) {
        return this.getValue().compareTo(other.getValue());
    }

    // public int compareTo(T other) {
    // return this.compareTo(other);
    // }

    // public abstract int compareTo(ListItem other);

    @Override
    public abstract String toString();

}