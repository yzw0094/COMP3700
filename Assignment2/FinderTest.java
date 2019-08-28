package Assignment2;
import org.junit.Test;

public class FinderTest {
int[] intArray = new int[] {2,9,66,54,23,85,69,62,465,897,52,36};
@Test
public void Max() {
    int mx = Finder.findMax(intArray);
    assert(mx == 897);
}
@Test
public void Min() {
    int mn = Finder.findMin(intArray);
    assert(mn == 2);
}
@Test
public void Empty() {
    int[] eArray = new int[] {};
    Integer mx = Finder.findMax(eArray);
    Integer mn = Finder.findMin(eArray);
    assert(mx == null);
    assert(mn == null);
}
    @Test
    public void Null() {
        int[] nArray = null;
        Integer mx = Finder.findMax(nArray);
        Integer mn = Finder.findMin(nArray);
        assert(mx == null);
        assert(mn == null);
    }
}