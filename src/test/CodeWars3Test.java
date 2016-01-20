import main.codewars.CodeWars3;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jack on 1/19/16.
 */
public class CodeWars3Test {
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        Assert.assertEquals("aehrsty", CodeWars3.longest("aretheyhere", "yestheyarehere"));
        Assert.assertEquals("abcdefghilnoprstu", CodeWars3.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        Assert.assertEquals("acefghilmnoprstuy", CodeWars3.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
