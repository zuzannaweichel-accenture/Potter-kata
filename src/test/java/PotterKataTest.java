import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotterKataTest {

    @Test
    public void oneBookReturnNoDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1};

        assertEquals(8.0, PotterKata.discount(cart) ,0.01 );
    }
    @Test
    public void twoUniqueBooksReturnFivePercentsDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2};

        assertEquals(15.20, PotterKata.discount(cart) ,0.01 );
    }
    @Test
    public void threeUniqueBooksReturnTenPercentsDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2, BOOK.title3};

        assertEquals(21.6, PotterKata.discount(cart), 0.01);
    }
    @Test
    public void fourUniqueBooksReturnFifteenPercentDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2, BOOK.title3, BOOK.title4};

        assertEquals(27.20, PotterKata.discount(cart), 0.01);
    }
    @Test
    @Ignore
    public void fiveUniqueBooksReturnTwentyFivePercentDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2, BOOK.title3, BOOK.title4, BOOK.title5};

        assertEquals(30.00, PotterKata.discount(cart), 0.01);
    }
    @Test
    @Ignore
    public void sixUniqueBooksReturnThirtyPercentDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2, BOOK.title3, BOOK.title4, BOOK.title5, BOOK.title6};

        assertEquals(33.60, PotterKata.discount(cart), 0.01);
    }
    @Test
    @Ignore
    public void sevenUniqueBooksReturnThirtyFivePercentDiscount(){
        BOOK[] cart = new BOOK[]{BOOK.title1, BOOK.title2, BOOK.title3, BOOK.title4, BOOK.title5, BOOK.title6, BOOK.title7};

        assertEquals(33.60, PotterKata.discount(cart), 0.01);
    }
}

