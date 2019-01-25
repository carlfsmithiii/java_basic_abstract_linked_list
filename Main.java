public class Main {
    public static void main(String[] args) {
        ListItem one = new Word("one");
        ListItem two = new Word("two");
        ListItem three = new Word("three");

        LinkedList list = new LinkedList();
        list.addItem(one);
        list.addItem(two);
        list.addItem(three);
        list.removeItem(two);

        list.printList();
    }
}