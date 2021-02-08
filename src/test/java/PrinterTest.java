import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 15);
    }

    @Test
    public void printTest(){
        assertEquals(4, printer.print(2, 3));
    }


}
