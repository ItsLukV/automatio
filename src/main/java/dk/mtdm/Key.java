package dk.mtdm;

/**
 * Key
 */
public class Key<T> {
  final private T key1,key2;
  public Key(T key1, T key2){
    this.key1 = key1;
    this.key2 = key2;
  }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return key1 == key.key1 && key2 == key.key1;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return key1.hashCode() + " : " + key2.hashCode();
    }
}
