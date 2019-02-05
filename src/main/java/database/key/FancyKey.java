package database.key;

public class FancyKey implements Key {
    private final int key;

    @Override
    public String toString() {
        return "FancyKey{" +
                "key=" + key +
                '}';
    }

    public FancyKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    @Override
    public boolean equals(Key key) {
        FancyKey keyToCompareWith = (FancyKey) key;
        return this.key == keyToCompareWith.getKey();
    }
}
