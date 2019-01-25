public class LinkedList {
    ListItem head;

    public void addItem(ListItem item) {
        if (head == null) {
            head = item;
        } else {
            if (item.compareTo(head) < 0) {
                item.setNextItem(head);
                head.setPreviousItem(item);
                head = item;
                return;
            } else {
                ListItem currentItem = head;
                ListItem previousItem;
                while (currentItem.getNextItem() != null) {
                    previousItem = currentItem;
                    currentItem = currentItem.getNextItem();
                    if (item.compareTo(currentItem) < 0) {
                        previousItem.setNextItem(item);
                        item.setPreviousItem(previousItem);
                        item.setNextItem(currentItem);
                        currentItem.setPreviousItem(item);
                        return;
                    }
                }
                currentItem.setNextItem(item);
                item.setPreviousItem(currentItem);
                return;
            }
        }
    }

    public void removeItem(ListItem item) {
        ListItem currentItem = head;
        ListItem nextItem;
        ListItem previousItem;
        while (currentItem != null) {
            if (currentItem.compareTo(item) == 0) {
                nextItem = currentItem.getNextItem();
                previousItem = currentItem.getPreviousItem();
                if (previousItem != null && nextItem != null) {
                    previousItem.setNextItem(nextItem);
                    nextItem.setPreviousItem(previousItem);
                } else if (previousItem != null) {
                    previousItem.setNextItem(null);
                } else if (nextItem != null) {
                    nextItem.setPreviousItem(null);
                    head = nextItem;
                } else {
                    head = null;
                }
            }
            currentItem = currentItem.getNextItem();
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Sorry, the list is empty");
        } else {
            ListItem currentItem = head;
            do {
                System.out.println("\t" + currentItem);
                currentItem = currentItem.getNextItem();
            } while (currentItem != null);
        }
    }
}