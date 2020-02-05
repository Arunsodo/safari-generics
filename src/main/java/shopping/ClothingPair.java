package shopping;

public class ClothingPair<E extends Sized/*, Colored*/> extends Pair<E> {

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matched() {
    return left.getSize() == right.getSize();
//        && left.getColor().equals(right.getColor());
  }
  @Override
  public String toString() {
    return "ClothingPair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
