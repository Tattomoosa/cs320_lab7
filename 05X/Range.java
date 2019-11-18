import java.util.*;

class Range implements Iterable<Integer> {
  int low;
  int high;
  Range(int low, int high) {this.low = low; this.high = high;}

  public Iterator<Integer> iterator() { return new RangeIterator(); }

  private class RangeIterator implements Iterator<Integer> {
      int i = low;
      public boolean hasNext() { return i < high; }
      public Integer next() {
          if (i >= high)
              throw new NoSuchElementException();
          return i++;
      }
  }
}


