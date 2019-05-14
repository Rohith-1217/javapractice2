import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {
    Even e=new Even();
    @Test
    public void getEven()
    {
        boolean result=e.isEven(4);
        assertEquals("true",result);
    }

}