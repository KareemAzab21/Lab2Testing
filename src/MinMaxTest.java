import org.junit.Test;
import static org.junit.Assert.*;


public class MinMaxTest {

    @Test
    public void Test1(){
        int arr[]={1,4,66,77,0,96};
        MinMax test1= new MinMax();
        assertEquals(test1.MinVal(arr),0);
        assertEquals(test1.MaxVal(arr),96);

    }
    @Test
    public void Test2(){
        int arr[]={33,4,-11,77,0,-22};
        MinMax test2= new MinMax();
        assertEquals(test2.MinVal(arr),-22);
        assertEquals(test2.MaxVal(arr),77);

    }
}
