public class Word extends ListItem {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    public String getValue() {
        return this.word;
    }

    @Override
    public int compareTo(Object otherObj) {
        if (!(otherObj instanceof Word)) {
            return -1;
        }
        Word other = (Word) otherObj;
        return this.word.compareTo(other.getWord());
    }

    @Override
    public String toString() {
        return this.word;
    }
}