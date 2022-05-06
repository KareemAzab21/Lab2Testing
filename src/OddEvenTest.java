import org.junit.Test;
import static org.junit.Assert.*;


public class OddEvenTest {

    @Test
    public void Test1(){

        OddEven test1 = new OddEven();
        assertEquals(test1.OddOrEven(33),"Odd");

    }

    @Test
    public void Test2(){

        OddEven test2 = new OddEven();
        assertEquals(test2.OddOrEven(182),"Even");

    }
}
