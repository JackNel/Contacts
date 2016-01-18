import main.codewars.CodeWars2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jack on 1/18/16.
 */
public class CodeWars2Test {
    @Test
    public void fixedTest() {
        Assert.assertEquals("should work for 3", CodeWars2.notVisibleCubes(3L), Long.valueOf(1L));
        Assert.assertEquals("should work for 5", CodeWars2.notVisibleCubes(5L), Long.valueOf(27L));
    }
}
